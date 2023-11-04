package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Database {
  private List<DatabaseRecord> animal;
  private List<DatabaseRecord> emotion;
  private List<DatabaseRecord> job;
  private List<DatabaseRecord> color;
  private List<DatabaseRecord> family;
  private List<DatabaseRecord> number;
  private List<DatabaseRecord> daytime;
  private List<DatabaseRecord> food;
  private List<DatabaseRecord> politeness;
  private List<DatabaseRecord> country;
  private List<DatabaseRecord> place;
  private List<DatabaseRecord> clothing;
  private List<DatabaseRecord> pointer;
  private List<DatabaseRecord> thingy;
  private List<DatabaseRecord> action;
  private List<DatabaseRecord> actionable;
  private List<DatabaseRecord> sport;
  private List<DatabaseRecord> genre;
  private List<DatabaseRecord> name;
  private List<DatabaseRecord> counting;

  private List<DatabaseRecord> everythingElse;

  public Iterator<DatabaseRecord> iterator() {
    List<DatabaseRecord> overall = new ArrayList<>();


    ReflectionUtils.doWithFields(
        Database.class,
        field -> {
          field.setAccessible(true);
          List<DatabaseRecord> list = (List<DatabaseRecord>) field.get(this);
          if (list == null) {
            return;
          }
          list.forEach(
              dr -> {
                if (StringUtils.hasText(dr.getEnglish())) {
                  dr.setCategory(field.getName());
                  overall.add(dr);
                }
              });
        });


    return overall.iterator();
  }
}
