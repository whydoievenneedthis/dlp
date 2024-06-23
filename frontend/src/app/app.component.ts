import { HttpClient } from '@angular/common/http';
import { AfterViewInit, Component, ElementRef, ViewChild } from '@angular/core';
import { bind } from 'wanakana';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements AfterViewInit {
  @ViewChild('answerInputJapanese')
  answerInputJapanese?: ElementRef<HTMLInputElement>;
  @ViewChild('answerInputEnglish')
  answerInputEnglish?: ElementRef<HTMLInputElement>;

  categories: CategoryDetails[] = [];
  categoryValues: string[] = [];

  question: QuestionResponse = {
    category: '',
    engExplanation: '',
    japExplanation: '',
    kanji: '',
    id: 0,
    japaneseAnswer: false,
    question: '',
    recordsRemaining: 999,
    points: { total: 0, remaining: 0 },
  };
  answer = '';

  kanjiPractice: Map<string, string> = new Map();

  history: Entry[] = [];

  constructor(private http: HttpClient) {
    http.get('http://localhost:8080/cats').subscribe((data) => {
      const r = <CategoriesResponse>data;
      this.categories = r.categories;
    });
  }

  ngAfterViewInit() {
    this.rebind();
    this.getQuestion();
  }

  rebind() {
    bind(<HTMLInputElement>this.answerInputJapanese?.nativeElement);
  }

  onEnter() {
    let actualAnswer = <string>this.answerInputJapanese?.nativeElement.value;
    if (this.question.japaneseAnswer) {
      if (!actualAnswer.match(/^[\u3040-\u30ff]*$/)) {
        return;
      }
    }

    this.http
      .post('http://localhost:8080/verify', {
        id: this.question.id,
        answer: actualAnswer,
        japaneseAnswer: this.question.japaneseAnswer,
      })
      .subscribe((data) => {
        const response = <VerifyResponse>data;
        this.history.unshift({
          question: this.question?.question,
          answer: actualAnswer,
          correct: response.correct,
          correctAnswer: response.answer,
          stat: response.stat,
        });
        this.history = this.history.splice(0, 10);
        this.getQuestion();
      });
  }

  getQuestion() {
    if (this.question.recordsRemaining == 0) {
      this.http.get('http://localhost:8080/cats').subscribe((data) => {
        const r = <CategoriesResponse>data;
        this.categories = r.categories;
      });
      return;
    }

    this.http.get('http://localhost:8080/get').subscribe((data) => {
      const response = <QuestionResponse>data;
      this.question = response;
      this.answer = '';

      if (this.question.recordsRemaining == 0) {
        this.http.get('http://localhost:8080/cats').subscribe((data) => {
          const r = <CategoriesResponse>data;
          this.categories = r.categories;
        });
        return;
      }


      setTimeout(() => {
        if (this.question.japaneseAnswer) {
          this.answerInputJapanese?.nativeElement.focus();
        } else {
          this.answerInputEnglish?.nativeElement.focus();
        }
      });
    });
  }

  dropCatValues() {
    this.categoryValues = [];
  }

  sessionReset() {
    this.http.get('http://localhost:8080/next-session').subscribe(() => {
      this.question.recordsRemaining = 999;
      this.getQuestion();
    });
  }
  allQuestionsReset() {
    this.http.get('http://localhost:8080/requeue-questions').subscribe(() => {
      this.getQuestion();
    });
  }

  perc() {
    return (
      100 -
      (this.question.points.remaining * 100) / this.question.points.total
    ).toFixed(2);
  }

  switchToVerification() {
    this.http.get('http://localhost:8080/veri-mode').subscribe(() => {
      this.getQuestion();
    });
  }

  practiceCategory(c: CategoryDetails) {
    this.question.recordsRemaining = 999;
    this.http.get(`http://localhost:8080/next-session/${c.name}`).subscribe(() => {
      this.getQuestion();
    });
  }

  switchToKanjiPractice() {
    this.question.recordsRemaining = 0;
    this.http.get("http://localhost:8080/kanji").subscribe((response) => {
      this.kanjiPractice = new Map(Object.entries(response));
      this.kanjiPracticeNext();
    })
  }

  kpKey = "";
  kpValue = "";
  showKanji = false;
  kanjiPracticeNext() {
    if (this.kanjiPractice.size === 0) return;
    let keys = Array.from(this.kanjiPractice.keys());
    this.kpKey = keys[Math.floor(Math.random() * keys.length)];
    this.kpValue = <string>this.kanjiPractice.get(this.kpKey);
  }

  kanjiDone(wasGood: boolean) {
    if (wasGood) {
      this.kanjiPractice.delete(this.kpKey);
    }
    this.showKanji = false;
    this.kanjiPracticeNext();
  }
}

interface Entry {
  question: string;
  answer: string;
  correct: boolean;
  correctAnswer: string;
  stat: Stat;
}

interface QuestionResponse {
  id: number;
  engExplanation: string;
  japExplanation: string;
  kanji: string;
  category: string;
  question: string;
  japaneseAnswer: boolean;
  recordsRemaining: number;
  points: {
    total: number;
    remaining: number;
  };
}

interface VerifyResponse {
  correct: boolean;
  answer: string;
  stat: Stat;
}

interface Stat {
  correct: number;
  incorrect: number;
}

interface CategoriesResponse {
  categories: CategoryDetails[];
}

interface CategoryDetails {
  name: string;
  total: number;
  unfinished: number;
  lastFinished: number;
}
