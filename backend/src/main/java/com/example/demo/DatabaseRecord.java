package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DatabaseRecord {
  private final String english;
  private final String japanese;
  private final String kanji;
  private String engExplanation;
  private String japExplanation;
  private String category;

  public DatabaseRecord(String english, String japanese, String kanji) {
    this.english = english;
    this.japanese = japanese.replace("-", "ー");
    this.japExplanation = kanji;
    this.kanji = kanji;
  }

  public DatabaseRecord(String english, String japanese) {
    this.english = english;
    this.japanese = japanese.replace("-", "ー");
    this.kanji = null;
  }

  public DatabaseRecord(Explanation english, String japanese, String kanji) {
    this.english = english.getValue();
    this.engExplanation = english.getExplanation();
    this.japanese = japanese.replace("-", "ー");
    this.japExplanation = kanji;
    this.kanji = kanji;
  }

  public DatabaseRecord(Explanation english, String japanese) {
    this.english = english.getValue();
    this.engExplanation = english.getExplanation();
    this.japanese = japanese.replace("-", "ー");
    this.japExplanation = null;
    this.kanji = null;
  }

  public DatabaseRecord(String english, Explanation japanese, String kanji) {
    this.english = english;
    this.engExplanation = null;
    this.japanese = japanese.getValue().replace("-", "ー");
    this.japExplanation = japanese.getExplanation().replace("-", "ー");
    this.kanji = kanji;
  }

  public DatabaseRecord(Explanation english, Explanation japanese, String kanji) {
    this.english = english.getValue();
    this.engExplanation = english.getExplanation();
    this.japanese = japanese.getValue().replace("-", "ー");
    this.japExplanation = japanese.getExplanation().replace("-", "ー");
    this.kanji = kanji;
  }

  public DatabaseRecord(String english, Explanation japanese) {
    this.english = english;
    this.engExplanation = null;
    this.japanese = japanese.getValue().replace("-", "ー");
    this.japExplanation = japanese.getExplanation().replace("-", "ー");
    this.kanji = null;
  }

  public int getId() {
    return (english + "[" + japanese + "]").hashCode();
  }

  public boolean oneWay() {
    return false;
  }
}
