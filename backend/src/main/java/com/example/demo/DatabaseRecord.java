package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DatabaseRecord {
  private final String english;
  private final List<String> japanese;
  private final String kanji;
  private String explanation;
  private String category;

  public DatabaseRecord(String english, List<String> japanese, String kanji) {
    this.english = english;
    this.japanese = japanese.stream().map(x -> x.replace("-", "ー")).toList();
    this.kanji = kanji;
  }

  public DatabaseRecord(String english, String japanese, String kanji) {
    this.english = english;
    this.japanese = List.of(japanese.replace("-", "ー"));
    this.kanji = kanji;
  }

  public DatabaseRecord(String english, String explanation, String japanese, String kanji) {
    this.english = english;
    this.explanation = explanation;
    this.japanese = List.of(japanese.replace("-", "ー"));
    this.kanji = kanji;
  }

  public DatabaseRecord(String english, String explanation, List<String> japanese, String kanji) {
    this.english = english;
    this.explanation = explanation;
    this.japanese = japanese.stream().map(x -> x.replace("-", "ー")).toList();
    this.kanji = kanji;
  }

  public int getId() {
    return (english + japanese.toString()).hashCode();
  }
}
