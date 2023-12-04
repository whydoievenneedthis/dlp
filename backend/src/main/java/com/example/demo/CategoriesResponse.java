package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class CategoriesResponse {
  private final List<CategoryDetails> categories;
}
