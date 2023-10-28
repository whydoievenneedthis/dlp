package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
class StatBuilder {
  private final Map<DatabaseRecord, Stat> thisSession = new HashMap<>();

  public Stat fetch(DatabaseRecord record) {
    return thisSession.computeIfAbsent(record, dr -> new Stat());
  }

  public Stat record(DatabaseRecord record, boolean correct, boolean japaneseAnswer) {
    Stat stat = thisSession.get(record);
    if (correct) {
      stat.correct++;
      if (japaneseAnswer) {
        stat.japaneseCorrect++;
      }
    } else {
      stat.incorrect++;
    }
    return stat;
  }

  public void reset() {
    thisSession.clear();
  }

  public Stat get(DatabaseRecord record) {
    return thisSession.get(record);
  }

  @Getter
  @Setter
  static class Stat {
    private int correct = 0;
    private int japaneseCorrect = 0;
    private int incorrect = 0;

    public int getPointValue() {
      return Math.max(6 - correct, 4 - japaneseCorrect);
    }
  }
}
