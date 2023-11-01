package com.example.demo;

public class DatabaseRecAdj extends DatabaseRecord {
  public DatabaseRecAdj(String eng, String jap) {
    super(eng, jap, null);
  }

  @Override
  public boolean oneWay() {
    return true;
  }
}
