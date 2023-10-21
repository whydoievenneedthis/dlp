package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter@AllArgsConstructor
public class VerifyResponse {
  private final boolean correct;
  private final String answer;
  private final StatBuilder.Stat stat;
}
