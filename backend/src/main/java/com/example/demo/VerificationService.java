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
  private final List<VeriRecord> questions = new ArrayList<>();
  private int total;

  public QuestionResponse getNextQuestion() {
    VeriRecord q = questions.get(questions.size() - 1);
    return new QuestionResponse(q.record, q.japan ? q.record.getEnglish() : q.record.getJapanese(), q.japan, questions.size(), new QuestionResponse.Points(total, questions.size()));
  }

  public VerifyResponse verify(VerifyRequest request) {
    VeriRecord q = questions.remove(questions.size() - 1);
    String expectedResponse = q.japan ? q.record.getJapanese() : q.record.getEnglish();
    if (!expectedResponse.equals(request.getAnswer())) {
      removeFromCompleted(request.getId());
    }
    return new VerifyResponse(expectedResponse.equals(request.getAnswer()), expectedResponse,
        new StatBuilder.Stat()
    );
  }

  public void init() {
    questions.clear();
    database.iterator().forEachRemaining(dr -> {
      questions.add(new VeriRecord(true, dr));
      questions.add(new VeriRecord(false, dr));
    });
    Collections.shuffle(questions);
    total = questions.size();
  }

  public boolean finished() {
    return questions.isEmpty();
  }

  @AllArgsConstructor
  private static class VeriRecord {
    private final boolean japan;
    private final DatabaseRecord record;
  }
}
