package com.example.demo;

import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StateManager {
  private static final ObjectMapper mapper = new ObjectMapper()
      .registerModule(new JavaTimeModule())
      .enable(SerializationFeature.INDENT_OUTPUT);
  private static final File COMPL_FILE = new File("completed.json");
  private static final File CAT_FILE = new File("categories.json");

  @SneakyThrows
  static Set<Integer> getCompleted() {
    try {
      return new TreeSet<>(mapper.readValue(COMPL_FILE, IntSet.class));
    } catch (FileNotFoundException ex) {
      return new TreeSet<>();
    }
  }

  @SneakyThrows
  static Map<String, String> getCategories() {
    try {
      return mapper.readValue(CAT_FILE, CatMap.class);
    } catch (FileNotFoundException ex) {
      return new TreeMap<>();
    }
  }

  @SneakyThrows
  static void addToCompleted(int newKey) {
    Set<Integer> completed = getCompleted();
    completed.add(newKey);

    dump(completed);
  }

  @SneakyThrows
  static void removeFromCompleted(int failedKey) {
    Set<Integer> completed = getCompleted();
    completed.remove(failedKey);
    dump(completed);
  }

  private static void dump(Set<Integer> completed) throws IOException {
    DefaultPrettyPrinter dpp = new DefaultPrettyPrinter();
    dpp.indentArraysWith(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
    mapper.writer(dpp).writeValue(COMPL_FILE, completed);
  }

  @SneakyThrows
  static void saveCategory(String currentCategory) {
    if (currentCategory == null) {
      return;
    }
    Map<String, String> categories = getCategories();
    categories.put(currentCategory, LocalDate.now().toString());
    mapper.writeValue(CAT_FILE, categories);
  }

  private static class IntSet extends HashSet<Integer> {
  }

  private static class CatMap extends HashMap<String, String> {
  }
}
