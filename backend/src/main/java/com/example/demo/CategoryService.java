package com.example.demo;

import com.sun.jdi.ArrayReference;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unchecked")
@Service
@RequiredArgsConstructor
class CategoryService {
  private final Database database;

  public CategoriesResponse getCategories() {
    List<CategoryDetails> cats = new ArrayList<>();
    ReflectionUtils.doWithFields(
        Database.class,
        f -> {
          f.setAccessible(true);
          List<DatabaseRecord>  list = (List<DatabaseRecord>) f.get(database);
          cats.add(new CategoryDetails(f.getName(), list.size(), calculateUnfinished(list)));
        });
    return new CategoriesResponse(cats);
  }

  private int calculateUnfinished(List<DatabaseRecord> list) {
    int unfinished = 0;
    Collection<Integer> completed = StateManager.getCompleted();
    for (DatabaseRecord record : list) {
      if (!completed.contains(record.getId())) {
        ++unfinished;
      }
    }
    return unfinished;
  }

}
