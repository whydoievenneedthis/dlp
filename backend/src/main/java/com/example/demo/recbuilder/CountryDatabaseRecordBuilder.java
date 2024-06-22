package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;

import java.util.Collection;
import java.util.List;

public class CountryDatabaseRecordBuilder extends DatabaseRecordBuilder<CountryDatabaseRecordBuilder> {
  private String person;

  public CountryDatabaseRecordBuilder person(String person) {
    this.person = person;
    return this;
  }

  @Override
  public Collection<DatabaseRecord> build() {
    List<DatabaseRecord> base = base();
    if (person == null)  {
      throw new IllegalStateException("Person needs to be specified for " + english + " --" + japanese);
    }
    base.addAll(List.of(
        new DatabaseRecord(person, null, japanese + "じん", null, null, true),
        new DatabaseRecord(japanese + "じん", null, person, null, kanji == null ? null : kanji + "人", false)
    ));
    return base;
  }
}