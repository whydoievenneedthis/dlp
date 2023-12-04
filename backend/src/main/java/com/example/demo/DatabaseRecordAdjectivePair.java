package com.example.demo;

import com.example.demo.DatabasePopulator.Kanji;
import lombok.Getter;

@Getter
public class DatabaseRecordAdjectivePair {
  private final String englishMain;
  private final String englishSubject;
  private final String japaneseMain;
  private final String japaneseConnector;
  private final String japaneseSubject;
  private final String kanji;

  public DatabaseRecordAdjectivePair(String englishMain, String englishSubject, String japaneseMain, String japaneseConnector, String japaneseSubject, String kanji) {
    this.englishMain = englishMain;
    this.englishSubject = englishSubject;
    this.japaneseMain = japaneseMain;
    this.japaneseConnector = japaneseConnector;
    this.japaneseSubject = japaneseSubject;
    this.kanji = kanji;
  }

  public DatabaseRecordAdjectivePair(String englishMain, String englishSubject, String japaneseMain, String japaneseConnector, String japaneseSubject) {
    this(englishMain, englishSubject, japaneseMain, japaneseConnector, japaneseSubject, null);
  }

  public DatabaseRecordAdjectivePair(String englishMain, String englishSubject, String japaneseMain, String japaneseSubject) {
    this(englishMain, englishSubject, japaneseMain, "", japaneseSubject, null);
  }

  public DatabaseRecordAdjectivePair(String englishMain, String japaneseMain, String japaneseConnector, Kanji kanji) {
    this(englishMain, "person", japaneseMain, japaneseConnector, "ひと", kanji.getKanji());
  }

  public DatabaseRecordAdjectivePair(String englishMain, String japaneseMain) {
    this(englishMain, "person", japaneseMain, "", "ひと", null);
  }

  public DatabaseRecordAdjectivePair(String englishMain, String japaneseMain, Kanji kanji) {
    this(englishMain, "person", japaneseMain, "", "ひと", kanji.getKanji());
  }

  public DatabaseRecordAdjectivePair(String englishMain, String japaneseMain, String japaneseConnector) {
    this(englishMain, "person", japaneseMain, japaneseConnector, "ひと", null);
  }
}
