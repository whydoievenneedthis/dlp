package com.example.demo.kanji;

import com.example.demo.Database;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
class KanjiController {
  private final Database db;

  @GetMapping("/kanji")
  Map<String, String> getPracticableKanjis() {
    Map<String, String> kanjis = new HashMap<>();
    db.iterator(null).forEachRemaining(r -> {
      String pk;
      if ((pk = r.getPracticableKanji()) != null) {
        kanjis.put(r.getTo(), pk);
      }
    });
    return kanjis;
  }
}
