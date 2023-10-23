package com.example.demo;

import static com.example.demo.StateManager.addToCompleted;
import static com.example.demo.StateManager.getCompleted;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

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
class QuestionProvider {
  private final Database database;
  private final StatBuilder statBuilder;
  private final List<DatabaseRecord> records = new ArrayList<>();
  private final Map<Integer, DatabaseRecord> questions = new HashMap<>();
  private final Deque<Integer> last10Excluded = new LinkedList<>();

  @PostConstruct
  void init() {
    reinitRecords();
    getCompleted().forEach(x -> records.remove(questions.get(x)));
  }

  private void reinitRecords() {
    ReflectionUtils.doWithFields(
        Database.class,
        field -> {
          field.setAccessible(true);
          List<DatabaseRecord> list = (List<DatabaseRecord>) field.get(database);
          if (list == null) {
            return;
          }
          list.forEach(
              dr -> {
                if (StringUtils.hasText(dr.getEnglish())) {
                  dr.setCategory(field.getName());
                  records.add(dr);
                  if (questions.containsKey(dr.getId())) {
                    throw new IllegalStateException("Duplicate question id!");
                  }
                  questions.put(dr.getId(), dr);
                }
              });
        });
  }

  QuestionResponse getNextQuestion() {
    int recordsRemaining = records.size();
    if (recordsRemaining == 0) {
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
    if (Math.random() < englishChanceByRecord(record)) {
      String question = record.getEnglish();
      return new QuestionResponse(record, question, true, recordsRemaining);
    }
    String question = record.getJapanese().get(random(record.getJapanese().size()));
    return new QuestionResponse(record, question, false, recordsRemaining);
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
    if (stat == null || stat.getCorrect() < 5) {
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
      correct = record.getJapanese().contains(request.getAnswer());
      answer = record.getJapanese().get(0);
    } else {
      record = questions.get(id);
      correct = record.getEnglish().equals(request.getAnswer());
      answer = record.getEnglish();
    }

    StatBuilder.Stat stat = statBuilder.record(record, correct, request.isJapaneseAnswer());
    if (stat.getCorrect() > 5 && stat.getJapaneseCorrect() > 3) {
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
    init();
    statBuilder.reset();
  }

  public void requeueQuestions() {
    records.clear();
    questions.clear();
    reinitRecords();
    statBuilder.reset();
  }
}
