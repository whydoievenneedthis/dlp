package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;

import java.util.Collection;

public class WordDatabaseRecordBuilder extends DatabaseRecordBuilder<WordDatabaseRecordBuilder> {
  @Override
  public Collection<DatabaseRecord> build() {
    return base();
  }
}
