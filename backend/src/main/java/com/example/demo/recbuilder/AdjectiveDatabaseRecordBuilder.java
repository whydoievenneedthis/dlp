package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class AdjectiveDatabaseRecordBuilder extends DatabaseRecordBuilder<AdjectiveDatabaseRecordBuilder> {
  private final AdjectiveType type;
  private String englishSubject;
  private String japaneseSubject;

  public AdjectiveDatabaseRecordBuilder(AdjectiveType type) {
    this.type = type;
  }

  public AdjectiveDatabaseRecordBuilder subject(String english, String japanese) {
    this.englishSubject = english;
    this.japaneseSubject = japanese;
    return this;
  }

  public AdjectiveDatabaseRecordBuilder hito() {
    englishSubject = "person";
    japaneseSubject = "ひと";
    return this;
  }

  @Override
  public Collection<DatabaseRecord> build() {
    if (englishSubject == null || japaneseSubject == null) {
      throw new IllegalStateException("Subject needs to be specified for " + english + " --" + japanese);
    }
    List<DatabaseRecord> base = base();
    String mainAnswer = japanese + type.link + japaneseSubject;
    base.add(
        new DatabaseRecord(english + " " + englishSubject, null, mainAnswer, Set.of(mainAnswer), null, null, null, true)
    );
    return base;
  }

  @RequiredArgsConstructor
  public enum AdjectiveType {
    I(""), NA("な"), NO("の");

    private final String link;
  }
}

