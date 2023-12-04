package com.example.demo;

public class DatabaseRecAdj extends DatabaseRecord {
  public DatabaseRecAdj(String english, String japanese) {
    super(english, japanese, null);
  }

  @Override
  public boolean oneWay() {
    return true;
  }
}
