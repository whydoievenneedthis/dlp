package com.example.demo;

import static com.example.demo.StateManager.addToCompleted;
import static com.example.demo.StateManager.getCompleted;
import static com.example.demo.StateManager.removeFromCompleted;

import com.example.demo.QuestionResponse.Points;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Slf4j
@SuppressWarnings("unchecked")
@Service
@RequiredArgsConstructor
class PracticeService {
  private final Database database;
  private final StatBuilder statBuilder;
  private final List<DatabaseRecord> records = new ArrayList<>();
  private final Map<Integer, DatabaseRecord> questions = new HashMap<>();
  private final Deque<Integer> last10Excluded = new LinkedList<>();
  private final CategoryService categoryService;
  private int sessionTotalPoints;
  private int sessionRemainingPoints;
  private String currentCategory;

  @PostConstruct
  void init() {
    initFull();
    for (CategoryDetails c : categoryService.getCategories().getCategories()) {
      if (c.getTotal() != 0) {
        log.info("{}: {} / {}", c.getName(), c.getTotal(), c.getUnfinished());
      }
    }
  }

  private void initFull() {
    reinitRecords(null);
    getCompleted().forEach(x -> {
      records.remove(questions.get(x));
    });
    sessionRemainingPoints = sessionTotalPoints = records.size() * 5;
  }

  private void initCat(String cat) {
    reinitRecords(cat);
    records.forEach(r -> removeFromCompleted(r.getId()));
  }

  private void reinitRecords(String cat) {
    database.iterator(cat)
        .forEachRemaining(dr -> {
          if (questions.containsKey(dr.getId())) {
            log.error(
                "{} ({}): {} ({})", dr.getEnglish(), dr.getEngExplanation(), dr.getJapanese(), dr.getId());
            throw new IllegalStateException("Duplicate question id!");
          }
          records.add(dr);
          questions.put(dr.getId(), dr);
        });
    sessionRemainingPoints = sessionTotalPoints = questions.size() * 5;
  }

  QuestionResponse getNextQuestion() {
    int recordsRemaining = records.size();
    if (recordsRemaining == 0) {
      categoryFinished();
      return new QuestionResponse();
    }
    Deque<Integer> excluded;
    if (recordsRemaining > 10) {
      excluded = last10Excluded;
    } else {
      excluded = new LinkedList<>();
    }
    DatabaseRecord record = getRecord(recordsRemaining, excluded);
    last10Excluded.add(record.getId());
    if (last10Excluded.size() > 10) {
      last10Excluded.removeFirst();
    }
    Points points = new Points(sessionTotalPoints, sessionRemainingPoints);
    if (record.oneWay() || Math.random() < englishChanceByRecord(record)) {
      return new QuestionResponse(record, record.getEnglish(), true, recordsRemaining, points);
    }
    String question = record.getJapanese();
    return new QuestionResponse(record, question, false, recordsRemaining, points);
  }

  private void categoryFinished() {
    StateManager.saveCategory(currentCategory);
    currentCategory = null;
  }

  private DatabaseRecord getRecord(int recordsRemaining, Deque<Integer> excluded) {
    DatabaseRecord record;
    do {
      record = records.get(random(recordsRemaining));
    } while (excluded.contains(record.getId()));
    return record;
  }

  private double englishChanceByRecord(DatabaseRecord record) {
    StatBuilder.Stat stat = statBuilder.get(record);
    if (stat == null || stat.getCorrect() < 3) {
      return 0.5;
    }
    return 1 - stat.getJapaneseCorrect() / (double) stat.getCorrect();
  }

  private int random(int maxSize) {
    return (int) (Math.random() * maxSize);
  }

  public VerifyResponse verify(VerifyRequest request) {
    boolean correct;
    String answer;
    DatabaseRecord record;

    int id = request.getId();
    if (request.isJapaneseAnswer()) {
      record = questions.get(id);
      correct = record.getJapanese().equals(request.getAnswer().replace(" ", ""));
      answer = record.getJapanese();
    } else {
      record = questions.get(id);
      correct = record.getEnglish().equals(request.getAnswer());
      answer = record.getEnglish();
    }

    this.sessionRemainingPoints -= statBuilder.fetch(record).getPointValue();

    StatBuilder.Stat stat = statBuilder.record(record, correct, request.isJapaneseAnswer());

    this.sessionRemainingPoints += stat.getPointValue();

    if (stat.getCorrect() > 4 && stat.getJapaneseCorrect() > 3) {
      log.info("throwing out '{}' from list", record.getEnglish());
      records.remove(record);
      if (stat.getIncorrect() == 0) {
        log.info("disabling '{}' completely", record.getEnglish());
        addToCompleted(record.getId());
      }
    }
    return new VerifyResponse(correct, correct ? null : answer, stat);
  }

  public void nextSession() {
    records.clear();
    questions.clear();
    initFull();
    statBuilder.reset();
  }

  public void nextSession(String cat) {
    records.clear();
    questions.clear();
    initCat(cat);
    statBuilder.reset();
    this.currentCategory = cat;
  }

  public void requeueQuestions() {
    records.clear();
    questions.clear();
    reinitRecords(null);
    statBuilder.reset();
  }
}
