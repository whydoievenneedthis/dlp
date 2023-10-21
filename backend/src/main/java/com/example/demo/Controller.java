package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
public class Controller {
  private final QuestionProvider questionProvider;
  private final CategoryService categoryService;

  @GetMapping("/get")
  QuestionResponse getQuestion() {
    return questionProvider.getNextQuestion();
  }

  @PostMapping("/verify")
  VerifyResponse verifyAnswer(@RequestBody VerifyRequest request) {
    return questionProvider.verify(request);
  }

  @GetMapping("/cats")
  CategoriesResponse getCategories() {
    return categoryService.getCategories();
  }

  @GetMapping("/cats/{cat}")
  CategoriesResponse getCategoryContents(@PathVariable String cat) {
    return categoryService.getCategoryEntries(cat);
  }

  @GetMapping("/next-session")
  void resetSession() {
    questionProvider.nextSession();
  }

  @GetMapping("/requeue-questions")
  void requeueQuestions() {
    questionProvider.requeueQuestions();
  }
}
