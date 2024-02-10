package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
class CategoryDetails {
  private final String name;
  private final int total;
  private final int unfinished;
  private final int lastFinished;
}