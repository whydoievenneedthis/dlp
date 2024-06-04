package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NameDatabaseRecordBuilder extends DatabaseRecordBuilder<NameDatabaseRecordBuilder> {

  public NameDatabaseRecordBuilder() {

  }

  @Override
  public Collection<DatabaseRecord> build() {
    return new ArrayList<>(List.of(
        new DatabaseRecord(english, englishExpl, japanese, "名前", null, true),
        new DatabaseRecord(japanese, "名前", english, englishExpl, kanji, false)
    ));
  }

  @RequiredArgsConstructor
  public enum AdjectiveType {
    I(""), NA("な"), NO("の");

    private final String link;
  }
}

