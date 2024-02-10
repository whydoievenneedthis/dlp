package com.example.demo;

public class DatabaseRecAdj extends DatabaseRecord {
  public DatabaseRecAdj(String english, String japanese) {
    super(english, japanese, null);
  }
  public DatabaseRecAdj(Explanation english, String japanese) {
    super(english, japanese, null);
  }
  public DatabaseRecAdj(String english, String japanese, String kanji) {
    super(english, japanese, kanji);
  }

  public DatabaseRecAdj(Explanation english, String japanese, String kanji) {
    super(english, japanese, kanji);
  }

  @Override
  public boolean oneWay() {
    return true;
  }
}
