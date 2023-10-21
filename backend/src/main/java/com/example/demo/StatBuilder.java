package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
class StatBuilder {
  private final Map<DatabaseRecord, Stat> thisSession = new HashMap<>();


  public Stat record(DatabaseRecord record, boolean correct, boolean japaneseAnswer) {
    Stat stat = thisSession.computeIfAbsent(record, dr -> new Stat());
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

  @Getter@Setter
  static class Stat {
    private int correct = 0;
    private int japaneseCorrect = 0;
    private int incorrect = 0;
  }


}
