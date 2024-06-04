package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.List;

public class AdjectiveDatabaseRecordBuilder extends DatabaseRecordBuilder<AdjectiveDatabaseRecordBuilder> {
  private final AdjectiveType type;
  private String englishSubject = "person";
  private String japaneseSubject = "ひと";

  public AdjectiveDatabaseRecordBuilder(AdjectiveType type) {
    this.type = type;
  }

  public AdjectiveDatabaseRecordBuilder subject(String english, String japanese) {
    this.englishSubject = english;
    this.japaneseSubject = japanese;
    return this;
  }

  @Override
  public Collection<DatabaseRecord> build() {
    List<DatabaseRecord> base = base();
    base.add(
        new DatabaseRecord(english + " " + englishSubject, null, japanese + type.link + japaneseSubject, null, null, true)
    );
    return base;
  }

  @RequiredArgsConstructor
  public enum AdjectiveType {
    I(""), NA("な"), NO("の");

    private final String link;
  }
}

