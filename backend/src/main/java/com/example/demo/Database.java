package com.example.demo;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter@Setter@Accessors(chain = true)
public class Database {
  private List<DatabaseRecord> animal;
  private List<DatabaseRecord> emotion;
  private List<DatabaseRecord> job;
  private List<DatabaseRecord> color;
  private List<DatabaseRecord> family;
  private List<DatabaseRecord> number;
  private List<DatabaseRecord> time;
  private List<DatabaseRecord> food;
  private List<DatabaseRecord> politeness;
  private List<DatabaseRecord> country;
  private List<DatabaseRecord> place;
  private List<DatabaseRecord> clothes;
  private List<DatabaseRecord> pointers;
  private List<DatabaseRecord> thingies;
  private List<DatabaseRecord> doing;
  private List<DatabaseRecord> days;

  private List<DatabaseRecord> everythingElse;
}
