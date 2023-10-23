package com.example.demo;

import lombok.Getter;

@Getter
public class QuestionResponse {
  private final int id;
  private final String explanation;
  private final String category;
  private final String question;
  private final boolean japaneseAnswer;
  private final int recordsRemaining;

  public QuestionResponse(
      DatabaseRecord record, String question, boolean japaneseAnswer, int recordsRemaining) {
    this.id = record.getId();
    this.explanation = record.getExplanation();
    this.category = record.getCategory();
    this.question = question;
    this.japaneseAnswer = japaneseAnswer;
    this.recordsRemaining = recordsRemaining;
  }

  public QuestionResponse() {
    this.id = 0;
    this.explanation = null;
    this.category = null;
    this.question = null;
    this.japaneseAnswer = false;
    this.recordsRemaining = 0;
  }
}
