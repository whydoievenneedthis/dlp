package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DatabaseRecord {
  private final String english;
  private final List<String> japanese;
  private final String kanji;
  private String engExplanation;
  private String japExplanation;
  private String category;

  public DatabaseRecord(String english, List<String> japanese, String kanji) {
    this.english = english;
    this.japanese = japanese.stream().map(x -> x.replace("-", "ー")).toList();
    this.japExplanation = kanji;
    this.kanji = kanji;
  }

  public DatabaseRecord(String english, String japanese, String kanji) {
    this.english = english;
    this.japanese = List.of(japanese.replace("-", "ー"));
    this.japExplanation = kanji;
    this.kanji = kanji;
  }

  public DatabaseRecord(Explanation english, String japanese, String kanji) {
    this.english = english.getValue();
    this.engExplanation = english.getExplanation();
    this.japanese = List.of(japanese.replace("-", "ー"));
    this.japExplanation = kanji;
    this.kanji = kanji;
  }

  public DatabaseRecord(String english, Explanation japanese, String kanji) {
    this.english = english;
    this.engExplanation = null;
    this.japanese = List.of(japanese.getValue().replace("-", "ー"));
    this.japExplanation = japanese.getExplanation().replace("-", "ー");
    this.kanji = kanji;
  }

  public DatabaseRecord(String english, String explanation, List<String> japanese, String kanji) {
    this.english = english;
    this.engExplanation = explanation;
    this.japanese = japanese.stream().map(x -> x.replace("-", "ー")).toList();
    this.japExplanation = kanji;
    this.kanji = kanji;
  }

  public int getId() {
    return (english + japanese.toString()).hashCode();
  }

  public boolean oneWay() {
    return false;
  }
}
