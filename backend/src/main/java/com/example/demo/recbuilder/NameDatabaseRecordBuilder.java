package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class NameDatabaseRecordBuilder extends DatabaseRecordBuilder<NameDatabaseRecordBuilder> {

  public NameDatabaseRecordBuilder() {

  }

  @Override
  public Collection<DatabaseRecord> build() {
    return new ArrayList<>(List.of(
        new DatabaseRecord(english, englishExpl, japanese, Set.of(japanese), "名前", null, null, true),
        new DatabaseRecord(japanese, "名前", english, Set.of(english), englishExpl, kanji, practiceKanji ? null : kanji, false)
    ));
  }

  @RequiredArgsConstructor
  public enum AdjectiveType {
    I(""), NA("な"), NO("の");

    private final String link;
  }
}

