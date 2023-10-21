package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter@RequiredArgsConstructor
public class CategoriesResponse {
  private final List<String> categories;
}
