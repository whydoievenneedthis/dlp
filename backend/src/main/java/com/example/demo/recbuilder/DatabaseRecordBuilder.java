package com.example.demo.recbuilder;

import com.example.demo.DatabaseRecord;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public abstract class DatabaseRecordBuilder<T> {
  String english;
  Set<String> alsoAcceptableEnglish = Set.of();
  String englishExpl;
  String japanese;
  String japaneseExpl;
  String kanji;
  boolean practiceKanji;
  Honorific honorific;

  public T english(String english) {
    this.english = english;
    return (T) this;
  }
  public T english(String english, String expl) {
    this.english = english;
    this.englishExpl = expl;
    return (T) this;
  }
  public T englishAlt(String... alts) {
    alsoAcceptableEnglish = Set.of(alts);
    return (T) this;
  }

  public T japanese(String japanese) {
    this.japanese = jesc(japanese);
    return (T) this;
  }

  public T japanese(String japanese, String expl) {
    this.japanese = jesc(japanese);
    this.japaneseExpl = jesc(expl);
    return (T) this;
  }

  private String jesc(String string) {
    return string.replace("-", "ー");
  }

  public T honorific(Honorific honorific) {
    this.honorific = honorific;
    return (T) this;
  }

  public T kanji(String kanji) {
    this.kanji = jesc(kanji);
    return (T) this;
  }

  public T pKanji(String kanji) {
    this.kanji = jesc(kanji);
    this.practiceKanji = true;
    return (T) this;
  }

  public abstract Collection<DatabaseRecord> build();

  List<DatabaseRecord> base() {
    Set<String> acceptableEnglish = new HashSet<>();
    acceptableEnglish.add(english);
    acceptableEnglish.addAll(alsoAcceptableEnglish);
    ArrayList<DatabaseRecord> recs = new ArrayList<>(List.of(
        new DatabaseRecord(english, englishExpl, japanese, Set.of(japanese), japaneseExpl, null, null, true),
        new DatabaseRecord(japanese, japaneseExpl, english, acceptableEnglish, englishExpl, kanji, practiceKanji ? kanji : null, false)
    ));
    if (honorific != null) {
      recs.add(
          new DatabaseRecord(english, englishExpl == null ? "honorified" : englishExpl + ", honorified", honorific.honorificPrefix + japanese, Set.of(honorific.honorificPrefix + japanese), japaneseExpl, null, null, true)
      );
    }
    return recs;
  }

  @RequiredArgsConstructor
  public enum Honorific {
    O("お"),
    GO("ご");

    private final String honorificPrefix;
  }
}
