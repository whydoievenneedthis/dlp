package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class QuestionResponse {
  private final int id;
  private final String engExplanation;
  private final String japExplanation;
  private final String category;
  private final String question;
  private final boolean japaneseAnswer;
  private final int recordsRemaining;
  private final Points points;

  public QuestionResponse(
      DatabaseRecord record,
      String question,
      boolean japaneseAnswer,
      int recordsRemaining,
      Points points) {
    this.id = record.getId();
    this.engExplanation = record.getEngExplanation();
    this.japExplanation = record.getJapExplanation();
    this.category = record.getCategory();
    this.question = question;
    this.japaneseAnswer = japaneseAnswer;
    this.recordsRemaining = recordsRemaining;
    this.points = points;
  }

  public QuestionResponse() {
    this.id = 0;
    this.engExplanation = null;
    this.japExplanation = null;
    this.category = null;
    this.question = null;
    this.japaneseAnswer = false;
    this.recordsRemaining = 0;
    this.points = null;
  }

  @Getter
  @AllArgsConstructor
  static class Points {
    private final int total;
    private final int remaining;
  }
}
