package com.example.demo;

import static com.example.demo.StateManager.removeFromCompleted;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
class VerificationService {
  private final Database database;
  private final List<DatabaseRecord> questions = new ArrayList<>();
  private int total;

  public QuestionResponse getNextQuestion() {
    DatabaseRecord q = questions.getLast();
    return new QuestionResponse(q, q.getFrom(), q.isAnswerInJapanese(), questions.size(), new QuestionResponse.Points(total, questions.size()));
  }

  public VerifyResponse verify(VerifyRequest request) {
    DatabaseRecord q = questions.removeLast();
    String expectedResponse = q.getTo();
    if (!expectedResponse.equals(request.getAnswer().trim())) {
      removeFromCompleted(request.getId());
    }
    return new VerifyResponse(expectedResponse.equals(request.getAnswer()), expectedResponse,
        new StatBuilder.Stat()
    );
  }

  public void init() {
    questions.clear();
    database.iterator(null).forEachRemaining(questions::add);
    Collections.shuffle(questions);
    total = questions.size();
  }

  public boolean finished() {
    return questions.isEmpty();
  }
}
