package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StateManager {
  private static final ObjectMapper mapper = new ObjectMapper();

  @SneakyThrows
  static Collection<Integer> getCompleted() {
    try {
      return mapper.readValue(new File("completed.json"), IntSet.class);
    } catch (FileNotFoundException ex) {
      return List.of();
    }
  }

  @SneakyThrows
  static void addToCompleted(int newKey) {
    Set<Integer> completed = new HashSet<>(getCompleted());
    completed.add(newKey);
    mapper.writeValue(new File("completed.json"), completed);
  }

  private static class IntSet extends HashSet<Integer> {}
}
