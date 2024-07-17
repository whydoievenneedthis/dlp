package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter@Setter
@RequiredArgsConstructor
public class DatabaseRecord {
  private final String from;
  private final String fromExpl;
  private final String to;
  private final Set<String> tos;
  private final String toExpl;
  private final String kanji;
  private final String practicableKanji;
  private final boolean answerInJapanese;
  private String category;

  public int getId() {
    return (from + " -- " + to).hashCode();
  }
}
