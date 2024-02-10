package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

class DatabasePopulator {


//  private List<DatabaseRecord> daytime() {
//        new DatabaseRecord("weekend", "しゅうまつ", "週末"),

//        new DatabaseRecord("day before yesterday", "おととい", "一昨日"),
//        new DatabaseRecord("yesterday", "きのう", "昨日"),
//        new DatabaseRecord("today", "きょう", "今日"),
//        new DatabaseRecord("tomorrow", "あした", "明日"),
//        new DatabaseRecord("day after tomorrow", "あさって", "明後日"),
//        new DatabaseRecord("every day", "まいにち", "毎日"),

//        new DatabaseRecord("this morning", "けさ", "今朝"),
//        new DatabaseRecord("every morning", "まいあさ", "相朝"),
//        new DatabaseRecord("last night", "ゆうべ", "夕べ"),
//        new DatabaseRecord("this night", "こんばん", "今晩"),
//        new DatabaseRecord("every night", "まいばん", "毎晩"),

//        new DatabaseRecord("morning", "あさ", "朝"),
//        new DatabaseRecord("daytime", "ひるま", "昼間"),
//        new DatabaseRecord("noon", "ひる", "昼"),
//        new DatabaseRecord("evening", "ゆうがた", "夕方"),
//        new DatabaseRecord("night", "ばん", "晩"),
//        new DatabaseRecord("tonight", "こんや"),
//        new DatabaseRecord("midnight", "れいじ", "零時"),

//        new DatabaseRecord("year", "とし", "年"),
//        new DatabaseRecord("every year", "まいとし", "毎年"),
//        new DatabaseRecord("year before last", "おととし", "一昨年"),
//        new DatabaseRecord("last year", "きょねん", "去年"),
//        new DatabaseRecord("this year", "ことし", "今年"),
//        new DatabaseRecord("next year", "らいねん", "来年"),
//        new DatabaseRecord("year after next", "さらいねん", "再来年"),

//        new DatabaseRecord("month", "つき", "月"),
//        new DatabaseRecord("every month", "まいつき", "毎月"),
//        new DatabaseRecord("last month", "せんげつ", "先月"),
//        new DatabaseRecord("this month", "こんげつ", "今月"),
//        new DatabaseRecord("next month", "らいげつ", "来月"),

//        new DatabaseRecord("week", "しゅう", "週"),
//        new DatabaseRecord("every week", "まいしゅう"),
//        new DatabaseRecord("this week", "こんしゅう", "今週"),
//        new DatabaseRecord("next week", "らいしゅう", "来週"),
//        new DatabaseRecord("week after next", "さらいしゅう", "再来週"),
//  }





  static List<DatabaseRecord> listOf(Object... objects) {
    List<DatabaseRecord> recs = new ArrayList<>();

    for (Object object : objects) {
      if (object instanceof DatabaseRecord dr) {
        recs.addAll(of(dr));
      } else if (object instanceof DatabaseRecordAdjectivePair drap) {
        recs.addAll(of(drap));
      }
    }

    return recs;
  }

  static List<DatabaseRecord> of(DatabaseRecord r) {
    List<DatabaseRecord> recs = new ArrayList<>();

    if ("".equals(r.getEnglish()) && "".equals(r.getJapanese())) {
      return recs;
    }
    if ("".equals(r.getEnglish()) || "".equals(r.getJapanese())) {
      throw new IllegalStateException("Found missing english or japanese: " + r.getEnglish() + " / " + r.getJapanese());
    }
    recs.add(r);

    return recs;
  }

  private static List<DatabaseRecord> of(DatabaseRecordAdjectivePair r) {
    List<DatabaseRecord> recs = new ArrayList<>();

    if ("".equals(r.getEnglishMain()) && "".equals(r.getJapaneseMain())) {
      return recs;
    }
    if ("".equals(r.getEnglishMain()) || "".equals(r.getJapaneseMain())) {
      throw new IllegalStateException("Found missing english or japanese: " + r.getEnglishMain() + " / " + r.getJapaneseMain());
    }
    recs.add(new DatabaseRecord(expl(r.getEnglishMain(), r.getEnglishSubject()), r.getJapaneseMain(), r.getKanji()));
    recs.add(new DatabaseRecAdj(r.getEnglishMain() + " " + r.getEnglishSubject(), r.getJapaneseMain() + r.getJapaneseConnector() + r.getJapaneseSubject()));

    return recs;
  }

  static Explanation expl(String value, String explanation) {
    return new Explanation(value, explanation);
  }

  @Getter
  @AllArgsConstructor(staticName = "of")
  static class Kanji {
    private final String kanji;
  }
}
