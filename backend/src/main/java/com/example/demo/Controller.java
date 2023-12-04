package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
public class Controller {
  private final PracticeService practiceService;
  private final CategoryService categoryService;
  private final VerificationService verificationService;
  private Mode mode = Mode.PRACTICE;

  @GetMapping("/get")
  QuestionResponse getQuestion() {
    if (mode == Mode.PRACTICE) {
      return practiceService.getNextQuestion();
    }
    return verificationService.getNextQuestion();
  }

  @PostMapping("/verify")
  VerifyResponse verifyAnswer(@RequestBody VerifyRequest request) {
    if (mode == Mode.PRACTICE) {
      return practiceService.verify(request);
    }
    VerifyResponse response = verificationService.verify(request);
    if (verificationService.finished()) {
      mode = Mode.PRACTICE;
      practiceService.init();
    }
    return response;
  }

  @GetMapping("/cats")
  CategoriesResponse getCategories() {
    return categoryService.getCategories();
  }

  @GetMapping("/next-session")
  void resetSession() {
    practiceService.nextSession();
  }

  @GetMapping("/next-session/{cat}")
  void resetSession(@PathVariable String cat) {
    practiceService.nextSession(cat);
  }

  @GetMapping("/requeue-questions")
  void requeueQuestions() {
    practiceService.requeueQuestions();
  }

  @GetMapping("/veri-mode")
  void switchToVerificationMode() {
    this.mode = Mode.VERIFICATION;
    verificationService.init();
  }

  private enum Mode {
    PRACTICE,
    VERIFICATION
  }
}
