package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SuppressWarnings("unchecked")
public abstract class DatabaseRecordBuilder<T> {
  String english;
  String englishExpl;
  String japanese;
  String japaneseExpl;
  String kanji;
  Honorific honorific;

  public T english(String english) {
    this.english = english;
    return (T) this;
  }

  public T eExpl(String english) {
    this.englishExpl = english;
    return (T) this;
  }

  public T japanese(String japanese) {
    this.japanese = japanese;
    return (T) this;
  }

  public T honorific(Honorific honorific) {
    this.honorific = honorific;
    return (T) this;
  }


  public T jExpl(String japanese) {
    this.japaneseExpl = japanese;
    return (T) this;
  }

  public T kanji(String kanji) {
    this.kanji = kanji;
    return (T) this;
  }

  public abstract Collection<DatabaseRecord> build();

  List<DatabaseRecord> base() {
    ArrayList<DatabaseRecord> recs = new ArrayList<>(List.of(
        new DatabaseRecord(english, englishExpl, japanese, japaneseExpl, null, true),
        new DatabaseRecord(japanese, japaneseExpl, english, englishExpl, kanji, false)
    ));
    if (honorific != null) {
      recs.add(
          new DatabaseRecord(english, englishExpl == null ? "honorified" : englishExpl + ", honorified", honorific.honorificPrefix + japanese, japaneseExpl, null, true)
      );
    }
    return recs;
  }

  @RequiredArgsConstructor
  public enum Honorific {
    O("お"),
    GO("ご");

    private final String honorificPrefix;
  }
}
