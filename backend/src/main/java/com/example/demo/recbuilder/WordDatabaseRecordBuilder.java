package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;

import java.util.Collection;
import java.util.List;

public class WordDatabaseRecordBuilder extends DatabaseRecordBuilder<WordDatabaseRecordBuilder> {
  private boolean askJapanOnly = false;
  @Override
  public Collection<DatabaseRecord> build() {
    List<DatabaseRecord> base = base();
    if (askJapanOnly) {
      base.removeLast();
    }
    return base;
  }
  public void askJapanOnly() {
    askJapanOnly = true;
  }
}
