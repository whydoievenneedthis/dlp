package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CountryDatabaseRecordBuilder extends DatabaseRecordBuilder<CountryDatabaseRecordBuilder> {
  private String person;
  private String language;

  public CountryDatabaseRecordBuilder person(String person) {
    this.person = person;
    return this;
  }

  public CountryDatabaseRecordBuilder personAndLanguage(String person) {
    this.person = person;
    this.language = person;
    return this;
  }

  @Override
  public Collection<DatabaseRecord> build() {
    List<DatabaseRecord> base = base();
    if (person == null) {
      throw new IllegalStateException("Person needs to be specified for " + english + " --" + japanese);
    }
    base.addAll(List.of(
        new DatabaseRecord(person, "person", japanese + "じん", Set.of(japanese + "じん"), null, null, null, true),
        new DatabaseRecord(japanese + "じん", null, person, Set.of(person), null, kanji == null ? null : kanji + "人", null, false)
    ));
    if (language != null) {
      base.addAll(List.of(
          new DatabaseRecord(person, "language", japanese + "ご", Set.of(japanese + "ご"), null, null, null, true),
          new DatabaseRecord(japanese + "ご", null, person, Set.of(person), null, kanji == null ? null : kanji + "語", null, false)
      ));
    }
    return base;
  }
}