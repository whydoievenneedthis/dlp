package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
class CategoryService {
  private final Database database;

  public CategoriesResponse getCategories() {
    List<String> cats = new ArrayList<>();
    ReflectionUtils.doWithFields(Database.class, f -> {
      cats.add(f.getName());
    });
    return new CategoriesResponse(cats);
  }

  @SuppressWarnings("unchecked")
  @SneakyThrows
  public CategoriesResponse getCategoryEntries(String cat) {
    Field field = Database.class.getDeclaredField(cat);
    field.setAccessible(true);
    List<DatabaseRecord> records = (List<DatabaseRecord>) field.get(database);
    List<String> pairs = new ArrayList<>();
    records.forEach(r -> {
      if (StringUtils.hasText(r.getEnglish())) {
        pairs.add(r.getEnglish() + ": " + r.getJapanese());
      }
    });
    pairs.sort(Comparator.naturalOrder());
    return new CategoriesResponse(pairs);
  }
}
