package com.example.demo;

import static com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder.AdjectiveType.I;
import static com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder.AdjectiveType.NA;
import static com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder.AdjectiveType.NO;

import com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder;
import com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder.AdjectiveType;
import com.example.demo.recbuilder.CountryDatabaseRecordBuilder;
import com.example.demo.recbuilder.DatabaseRecordBuilder;
import com.example.demo.recbuilder.NameDatabaseRecordBuilder;
import com.example.demo.recbuilder.WordDatabaseRecordBuilder;

import java.util.ArrayList;
import java.util.List;

// counters: https://www.tofugu.com/japanese/japanese-counters-list/
class DatabaseTematicPopulator {
  static class DbPopCount {
//    static List<DatabaseRecord> time() {
//      return listOf(
//          new DatabaseRecAdj("time", "じかん", "時間"),
//
//          new DatabaseRecAdj("one hour", "いちじかん", "一時間"),
//          new DatabaseRecAdj("two hours", "にじかん", "ニ時間"),
//          new DatabaseRecAdj("three hours", "さんじかん", "三時間"),
//          new DatabaseRecAdj("four hours", "よじかん", "四時間"),
//          new DatabaseRecAdj("five hours", "ごじかん", "五時間"),
//          new DatabaseRecAdj("six hours", "ろくじかん", "六時間"),
//          new DatabaseRecAdj("seven hours", "しちじかん", "七時間"),
//          new DatabaseRecAdj("eight hours", "はちじかん", "八時間"),
//          new DatabaseRecAdj("nine hours", "くじかん", "九時間"),
//          new DatabaseRecAdj("ten hours", "じゅうじかん", "十時間"),
//
//          new DatabaseRecAdj("how many hours", "なんじかん", "何時間"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> minute() {
//      return listOf(
//          new DatabaseRecAdj("minute", "ふん", "分"),
//          new DatabaseRecAdj("one minute", "いっぷん", "一分"),
//          new DatabaseRecAdj("two minutes", "にふん", "ニ分"),
//          new DatabaseRecAdj("three minutes", "さんぷん", "三分"),
//          new DatabaseRecAdj("four minutes", "よんぷん", "四分"),
//          new DatabaseRecAdj("five minutes", "ごふん", "五分"),
//          new DatabaseRecAdj("six minutes", "ろっぷん", "六分"),
//          new DatabaseRecAdj("seven minutes", "ななふん", "七分"),
//          new DatabaseRecAdj("eight minutes", "はっぷん", "八分"),
//          new DatabaseRecAdj("nine minutes", "きゅうふん", "九分"),
//          new DatabaseRecAdj("ten minutes", "じゅっぷん", "十分"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> hour() {
//      return listOf(
//          new DatabaseRecAdj("o'clock", "じ", "時"),
//          new DatabaseRecAdj("one o'clock", "いちじ", "一時"),
//          new DatabaseRecAdj("two o'clock", "にじ", "ニ時"),
//          new DatabaseRecAdj("three o'clock", "さんじ", "三時"),
//          new DatabaseRecAdj("four o'clock", "よじ", "四時"),
//          new DatabaseRecAdj("five o'clock", "ごじ", "五時"),
//          new DatabaseRecAdj("six o'clock", "ろくじ", "六時"),
//          new DatabaseRecAdj("seven o'clock", "しちじ", "七時"),
//          new DatabaseRecAdj("eight o'clock", "はちじ", "八時"),
//          new DatabaseRecAdj("nine o'clock", "くじ", "九時"),
//          new DatabaseRecAdj("ten o'clock", "じゅうじ", "十時"),
//          new DatabaseRecAdj("what time", "なんじ", "何時"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> calendarDay() {
//      return listOf(
//          new DatabaseRecAdj("1st", "ついたち", "一日"),
//          new DatabaseRecAdj("2nd", "ふつか", "二日"),
//          new DatabaseRecAdj("3rd", "みっか", "三日"),
//          new DatabaseRecAdj("6th", "むいか", "六日"),
//          new DatabaseRecAdj("7th", "なのか", "七日"),
//          new DatabaseRecAdj("8th", "ようか", "八日"),
//          new DatabaseRecAdj("9th", "ここのか", "九日"),
//          new DatabaseRecAdj("10th", "とおか", "十日"),
//          new DatabaseRecAdj("20th", "はつか", "二十日"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> month() {
//      return listOf(
//          new DatabaseRecAdj("january", "いちがつ", "一月"),
//          new DatabaseRecAdj("february", "にちがつ", "日月"),
//          new DatabaseRecAdj("april", "しがつ", "四月"),
//          new DatabaseRecAdj("may", "ごがつ", "五月"),
//          new DatabaseRecAdj("july", "しちがつ", "七月"),
//          new DatabaseRecAdj("september", "くがつ", "九月"),
//          new DatabaseRecAdj("october", "じゅうがつ", "十月"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> timeLength() {
//      return listOf(
//          new DatabaseRecAdj("1 day", "いちにち", "一日"),
//          new DatabaseRecAdj("2 days", "ふつか", "二日"),
//          new DatabaseRecAdj("3 days", "みっか", "三日"),
//          new DatabaseRecAdj("5 days", "いつか", "五日"),
//          new DatabaseRecAdj("7 days", "なのか", "七日"),
//          new DatabaseRecAdj("8 days", "ようか", "八日"),
//          new DatabaseRecAdj("9 days", "ここのか", "九日"),
//          new DatabaseRecAdj("10 days", "とおか", "十日"),
//          new DatabaseRecAdj("20 days", "はつか", "二十日"),
//
//          new DatabaseRecAdj("1 week", "いっしゅうかん", "一週間"),
//          new DatabaseRecAdj("2 weeks", "にしゅうかん", "二週間"),
//          new DatabaseRecAdj("3 weeks", "さんしゅうかん", "三週間"),
//
//          new DatabaseRecAdj("2 months", "にかげつ", "二ヶ月"),
//          new DatabaseRecAdj("10 months", "じゅっかげつ", "十ヶ月"),
//          new DatabaseRecAdj("11 months", "じゅういっかげつ", "十一ヶ月"),
//
//          new DatabaseRecAdj("1 year", "いちねん", "一年"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> age() {
//      return listOf(
//          new DatabaseRecAdj("age", "さい", "歳"),
//          new DatabaseRecAdj("one year old", "いっさい", "一歳"),
//          new DatabaseRecAdj("two years old", "にさい", "ニ歳"),
//          new DatabaseRecAdj("three years old", "さんさい", "三歳"),
//          new DatabaseRecAdj("four years old", "よんさい", "四歳"),
//          new DatabaseRecAdj("five years old", "ごさい", "五歳"),
//          new DatabaseRecAdj("six years old", "ろくさい", "六歳"),
//          new DatabaseRecAdj("seven years old", "ななさい", "七歳"),
//          new DatabaseRecAdj("eight years old", "はっさい", "八歳"),
//          new DatabaseRecAdj("nine years old", "きゅうさい", "九歳"),
//          new DatabaseRecAdj("ten years old", "じゅっさい", "十歳"),
//          new DatabaseRecAdj(expl("how old", "informal"), "なんさい", "何歳"),
//          new DatabaseRecAdj(expl("how old", "formal"), "おいくつ"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> anything() {
//      return listOf(
//          new DatabaseRecAdj("one pie", "ひとつ", "一つ"),
//          new DatabaseRecAdj("two pies", "ふたつ", "二つ"),
//          new DatabaseRecAdj("three pies", "みっつ", "三つ"),
//          new DatabaseRecAdj("four pies", "よっつ", "四つ"),
//          new DatabaseRecAdj("five pies", "いつつ", "五つ"),
//          new DatabaseRecAdj("six pies", "むっつ", "六つ"),
//          new DatabaseRecAdj("seven pies", "ななつ", "七つ"),
//          new DatabaseRecAdj("eight pies", "やっつ", "八つ"),
//          new DatabaseRecAdj("nine pies", "ここのつ", "九つ"),
//
//          new DatabaseRecAdj("how many pies", "いくつ"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> anythingFormed() {
//      return listOf(
//          new DatabaseRecAdj("one apple", "いっこ", "一個"),
//          new DatabaseRecAdj("two apples", "にこ", "二個"),
//          new DatabaseRecAdj("three apples", "さんこ", "三個"),
//          new DatabaseRecAdj("four apples", "よんこ", "四個"),
//          new DatabaseRecAdj("five apples", "ごこ", "五個"),
//          new DatabaseRecAdj("six apples", "ろっこ", "六個"),
//          new DatabaseRecAdj("seven apples", "ななこ", "七個"),
//          new DatabaseRecAdj("eight apples", "はちこ", "八個"),
//          new DatabaseRecAdj("nine apples", "きゅうこ", "九個"),
//          new DatabaseRecAdj("ten apples", "じゅっこ", "十個"),
//          new DatabaseRecAdj("how many apples", "なんこ", "何個"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> person() {
//      return listOf(
//          new DatabaseRecAdj("one person", "ひとり", "一人"),
//          new DatabaseRecAdj("two persons", "ふたり", "二人"),
//          new DatabaseRecAdj("three persons", "さんにん", "三人"),
//          new DatabaseRecAdj("four persons", "よにん", "四人"),
//          new DatabaseRecAdj("eight persons", "はちにん", "八人"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> politePerson() {
//      return listOf(
//          new DatabaseRecAdj("how many people", "なんめい", "何名"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> floor() {
//      return listOf(
//          new DatabaseRecAdj("floor", "かい", "階"),
//          new DatabaseRecAdj("first floor", "いっかい", "一階"),
//          new DatabaseRecAdj("second floor", "にかい", "二階"),
//          new DatabaseRecAdj("third floor", "さんかい", "三階"),
//          new DatabaseRecAdj("fourth floor", "よんかい", "四階"),
//          new DatabaseRecAdj("which floor", "なんかい", "何階"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> machineFurnitureCake() {
//      return listOf(
//          new DatabaseRecAdj("two cars", "にだい", "二台"),
//          new DatabaseRecAdj("how many tables", "なんだい", "何台"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> legwear() {
//      return listOf(
//          new DatabaseRecAdj("one pair of socks", "いっそく", "一足"),
//          new DatabaseRecAdj("two pairs of socks", "にそく", "二足"),
//          new DatabaseRecAdj("three pairs of socks", "さんそく", "三足"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> pair() {
//      return listOf(
//          new DatabaseRecAdj("two pairs of gloves", "ふたくみ", "二組"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> cylinder() {
//      return listOf(
//          new DatabaseRecAdj("one fork", "いっぽん", "一本"),
//          new DatabaseRecAdj("two chopsticks", "にほん", "日本"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> flat() {
//      return listOf(
//          new DatabaseRecAdj("one plate", "いちまい", "一枚"),
//          new DatabaseRecAdj("hundred pictures", "ひゃくまい", "百枚"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> bird() {
//      return listOf(
//          new DatabaseRecAdj("one bird", "いちわ", "一羽"),
//          new DatabaseRecAdj("two birds", "にわ", "二羽"),
//          new DatabaseRecAdj("three birds", "さんわ", "三羽"),
//          new DatabaseRecAdj("four birds", "よんわ", "四羽"),
//          new DatabaseRecAdj("seven birds", "ななわ", "七羽"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> book() {
//      return listOf(
//          new DatabaseRecAdj("one book", "いっさつ", "一冊"),
//          new DatabaseRecAdj("six books", "ろくさつ", "六冊"),
//          new DatabaseRecAdj("ten books", "じゅうさつ", "十冊"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
//    static List<DatabaseRecord> smallAnimal() {
//      return listOf(
//          new DatabaseRecAdj("one cat", "いっぴき", "一匹"),
//          new DatabaseRecAdj("three dogs", "さんびき", "三匹"),
//          new DatabaseRecAdj("five cats", "ごひき", "五匹"),
//
//          new DatabaseRecAdj("", "")
//      );
//    }
  }

  static class DbPopHiraKata {
//    static List<DatabaseRecord> hira() {
//      return listOf(
//          new DatabaseRecord("warrior", "ぶし", null),
//          new DatabaseRecord("ninja", "にんじゃ", null),
//          new DatabaseRecord("opposite", "りゅなせ", null),
//          new DatabaseRecord("meal", "しょくじ", null),
//          new DatabaseRecord("effort", "どりょく", null),
//          new DatabaseRecord("savings", "ちょきん", null),
//          new DatabaseRecord("license", "めんきょ", null),
//          new DatabaseRecord("homemaker", "しゅふ", null),
//          new DatabaseRecord("worry", "しんぱい", null),
//          new DatabaseRecord("radio wave", "でんぱ", null),
//          new DatabaseRecord("traditional inn", "りょかん", null),
//          new DatabaseRecord("expenditure", "ししゅつ", null),
//          new DatabaseRecord("sign language", "しゅわ", null),
//          new DatabaseRecord("capital", "しゅと", null),
//          new DatabaseRecord("culture", "ぶんか", null),
//          new DatabaseRecord("journey", "たび", null),
//          new DatabaseRecord("hot pot", "なべ", null),
//          new DatabaseRecord("singer", "かしゅ", null),
//          new DatabaseRecord("konjac", "こんにゃく", null),
//          new DatabaseRecord("customer", "きゃく", null),
//          new DatabaseRecord("pumpkin", "かぽちゃ", null),
//          new DatabaseRecord("blizzard", "ふぶき", null),
//          new DatabaseRecord("nosebleed", "はなぢ", null),
//          new DatabaseRecord("perfect", "かんぺき", null),
//          new DatabaseRecord("progress", "しんぽ", null),
//          new DatabaseRecord("cheers", "かんぱい", null),
//          new DatabaseRecord("music note", "おんぷ", null),
//          new DatabaseRecord("play", "しばい", null),
//          new DatabaseRecord("finger", "ゆび", null),
//          new DatabaseRecord("alarm clock", "めざまし", null),
////          new DatabaseRecord("seat", "ざせき", null),
//          new DatabaseRecord("mouse", "ねずみ", null),
//          new DatabaseRecord("earthquake", "じしん", null),
//          new DatabaseRecord("pencil", "えんぴつ", null),
//          new DatabaseRecord("dandelion", "たんぽぽ", null),
//          new DatabaseRecord("paradox", "ぎゃくせつ", null),
//          new DatabaseRecord("gravel", "じゃり", null),
//          new DatabaseRecord("because", "だって", null),
//          new DatabaseRecord("happi coat", "はっぴ", null),
//          new DatabaseRecord("author", "さっか", null),
//          new DatabaseRecord("support", "えんじょ", null),
//          new DatabaseRecord("neighborhood", "きんじょ", null),
//          new DatabaseRecord("assistant", "じょしゅ", null),
//          new DatabaseRecord("pilgrimage", "あんぎゃ", null),
//          new DatabaseRecord("charm", "みりょく", null),
////          new DatabaseRecord("reading process", "どくしょ", null),
//          new DatabaseRecord("lady", "じょし", null),
//          new DatabaseRecord("mermaid", "にんぎょ", null),
//          new DatabaseRecord("prayer beads", "じゅず", null),
//          new DatabaseRecord("resin", "じゅし", null),
//          new DatabaseRecord("fruit tree", "かじゅ", null),
//          new DatabaseRecord("starring", "しゅえん", null),
//          new DatabaseRecord("model", "きしゅ", null),
//          new DatabaseRecord("handshake", "あくしゅ", null),
//          new DatabaseRecord("pearl", "しんじゅ", null),
//          new DatabaseRecord("preparation", "じゅんび", null),
//          new DatabaseRecord("opposite", "ぎゃく", null),
//          new DatabaseRecord("guest room", "きゃくしつ", null),
//
//          word().english("no make-up").japanese("すっぴん");
//          word().english("result").japanese("けっか");
//          word().english("stamp").japanese("きって");
//          word().english("tearoom").japanese("きっさ");
//          word().english("diary").japanese("にっき");
//          word().english("contradiction").japanese("むじゅん");
//          word().english("standard").japanese("きじゅん");
//          word().english("order").japanese("じゅんばん");
//          word().english("pure").japanese("じゅんすい");
//          word().english("required").japanese("ひっす");
//          word().english("absence").japanese("けっせき");
//          word().english("actually").japanese("じっさいに");
//          word().english("finally").japanese("やっと");
//          word().english("earlier").japanese("さっき");
//          word().english("phrase").japanese("いっく");
//          word().english("simple").japanese("しっそ");
//          word().english("cheek").japanese("ほっぺ");
//          word().english("fishing boat").japanese("ぎょせん");
//          word().english("witch").japanese("まじょ");
//          word().english("goldfish").japanese("きんぎょ");
//          word().english("dehumidifier").japanese("じょしつき");
//          word().english("only").japanese("たった");
//          word().english("growth").japanese("はったつ");
//          word().english("resolve").japanese("けっしん");
//          word().english("step").japanese("いっぽ");
//          word().english("shock").japanese("あっけ");
//          word().english("daily routine").japanese("にっか");
//          word().english("excerpt").japanese("ばっすい");
//          word().english("leaf").japanese("はっぱ");
//          word().english("stick to").japanese("くっつく");
//          word().english("tail").japanese("しっぽ");
//          word().english("wetland").japanese("しっち");
//          word().english("practical").japanese("じっせんてき");
//          word().english("coffee shop").japanese("きっせてん");
//          word().english("applause").japanese("かっさい");
//          word().english("definitely").japanese("ぜったい");
//          word().english("penalty").japanese("ばっそく");
//          word().english("surprised").japanese("びっくり");
//          word().english("robust").japanese("がっちり");
//          word().english("failure").japanese("しっぱい");
//          word().english("departure").japanese("しゅっぱつ");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//
//          word().english("").japanese("");
//      );
//    }
//    static List<DatabaseRecord> kata() {
//      return listOf(
//          word().english("impetus").japanese("キッカケ");
//          word().english("trumpet").japanese("ラッパ");
//          word().english("stealthily").japanese("コッソリ");
//          word().english("grasshopper").japanese("バッタ");
//          word().english("sea otter").japanese("ラッコ");
//          word().english("seal").japanese("アザラシ");
//          word().english("mexico").japanese("メキシコ");
//          word().english("whispering").japanese("ヒソヒソ");
//          word().english("frog").japanese("カエル");
//          word().english("jellyfish").japanese("クラゲ");
//          word().english("green onion").japanese("ネギ");
//          word().english("flea").japanese("ノミ");
//          word().english("newt").japanese("イモリ");
//          word().english("duck").japanese("カモ");
//          word().english("scorpion").japanese("サソリ");
//          word().english("garlic").japanese("ニンニク");
//          word().english("connection").japanese("コネ");
//          word().english("alligator").japanese("ワニ");
//          word().english("crab").japanese("カニ");
//          word().english("bee").japanese("ハチ");
//          word().english("twin").japanese("ツイン");
//          word().english("signature").japanese("サイン");
//          word().english("falcon").japanese("タカ");
//          word().english("pear").japanese("ナシ");
//          word().english("spider").japanese("クモ");
//          word().english("hawaii").japanese("ハワイ");
//          word().english("cutlet").japanese("カツ");
//          word().english("latte").japanese("ラテ");
//          word().english("squirrel").japanese("リス");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//
//          word().english("").japanese("");
//      );
//    }
  }

  static class DbPopS1 {
    static List<DatabaseRecord> u01() {
      reset();
      word().english("sushi").japanese("すし").kanji("寿司");
      word().english("please").japanese("ください");
      word().english("green tea").japanese("おちゃ");
      word().english("and").japanese("と");
      word().english("rice").japanese("ごはん");
      word().english("water").japanese("みず").kanji("水");
      return dump();
    }

    static List<DatabaseRecord> u02() {
      reset();
      word().english("doctor").japanese("いしゃ");
      word().english("teacher").japanese("せんせい");
      word().english("student").japanese("がくせい").kanji("学生");
      word().english("lawyer").japanese("べんごし");
      word().english("person").eExpl("informal").japanese("ひと").kanji("人");
      adj(I).english("nice").japanese("やさしい").kanji("易しい");
      adj(I).english("cool").japanese("かっこいい").kanji("易しい");
      return dump();
    }

    static List<DatabaseRecord> u03() {
      reset();
      word().english("hello").japanese("こんにちは");
      name().english("ken").japanese("けん");
      name().english("naomi").japanese("なおみ");
      name().english("hana").japanese("はな");
      word().english("nice to meet you").eExpl("treat me well").japanese("どうぞよろしく");
      word().english("good evening").japanese("こんばんは");
      word().english("bye").japanese("じゃあね");
      word().english("see you tomorrow").japanese("またあした");
      return dump();
    }

    static List<DatabaseRecord> u04() {
      reset();
      word().english("this one").japanese("これ");
      word().english("that one").japanese("それ");
      word().english("curry").japanese("カレー");
      word().english("ramen").japanese("ラーメン");
      word().english("pizza").japanese("ピザ");
      word().english("cake").japanese("ケーキ");
      adj(I).english("tasty").japanese("おいしい");
      word().english("yes").japanese("はい");
      word().english("no").japanese("いいえ");
      return dump();
    }

    static List<DatabaseRecord> u05() {
      reset();
      country().english("america").person("american").japanese("アメリカ");
      country().english("canada").person("canadian").japanese("カナダ");
      country().english("brazil").person("brazilian").japanese("ブラジル");
      country().english("britain").person("british").japanese("イギリス");
      country().english("japan").person("japanese").japanese("にほん").kanji("日本");
      adj(I).english("big").japanese("おおきい").kanji("大きい");
      adj(I).english("small").japanese("ちいさい").kanji("小さい");
      return dump();
    }

//    static List<DatabaseRecord> u02() {
//      return listOf(
//          word().english("this").japanese("この");
//          word().english("that").japanese("その");
//      );
//    }
//    static List<DatabaseRecord> u03() {
//      return listOf(
//
//          word().english("hotel").japanese("ホテル");
//          word().english("department store").japanese("デパート");
//          word().english("convenience store").japanese("コンビニ");
//          word().english("bus stop").japanese("バスてい");
//          word().english("train station").japanese("えき").kanji("駅");
//          word().english("university").japanese("だいがく");
//          word().english("here").japanese("ここ");
//          word().english("there").japanese("そこ");
//          word().english("where").japanese("どこ");
//      );
//    }
//    static List<DatabaseRecord> u04() {
//      return listOf(
//          word().english("hat").japanese("ぼうし").kanji("帽子");
//          word().english("umbrella").japanese("かさ").kanji("傘");
//          word().english("shoe").japanese("くつ").kanji("靴");
//          word().english("coat").japanese("コート");
//          new DatabaseRecordAdjectivePair("red", "あかい", Kanji.of("赤い")),
//          new DatabaseRecordAdjectivePair("white", "しろい", Kanji.of("白い")),
//          word().english("these ones").japanese("これら");
//          word().english("those ones").japanese("それら");
//
//          new DatabaseRecordAdjectivePair("cheerful", "あかるい", Kanji.of("明るい")),
//          new DatabaseRecordAdjectivePair("funny", "おもしろい"),
//          new DatabaseRecordAdjectivePair("cute", "かわいい")
//      );
//    }
//    static List<DatabaseRecord> u05() {
//      return listOf(
//          word().english("one").japanese("いち").kanji("一");
//          word().english("two").japanese("に").kanji("二");
//          word().english("three").japanese("さん").kanji("三");
//          word().english("half-").japanese("はん").kanji("半");
//          word().english("excuse me").japanese("すみません");
//          word().english("now").japanese("いま").kanji("今");
//          new DatabaseRecord(expl("about", "time"), "ごろ"),
//
//          word().english("airport").japanese("くうこう").kanji("空港");
//          word().english("subway").japanese("ちかてつ").kanji("地下鉄");
//          word().english("passport").japanese("パスポート");
//          word().english("smartphone").japanese("スマホ");
//          new DatabaseRecord(expl("ticket", "train"), "きっぷ"),
//          word().english("bag").japanese("かばん").kanji("鞄");
//          word().english("map").japanese("ちず").kanji("地図");
//      );
//    }
//    static List<DatabaseRecord> u06() {
//      return listOf(
//          new DatabaseRecord(expl("I", "female"), "わたし", "私"),
//          word().english("good morning").japanese("おはようございます");
//          new DatabaseRecord(expl("welcome", "be welcomed"), "ようこそ"),
//          new DatabaseRecord(expl("welcome", "to this shop"), "いらっしゃいませ"),
//          new DatabaseRecord(expl("from", "place"), "しゅっしん"),
//          word().english("city").japanese("とし").kanji("都市");
//          word().english("town").japanese("まち");
//          word().english("very").japanese("とても");
//          new DatabaseRecordAdjectivePair("lively", "にぎやか", "な", Kanji.of("賑やか")),
//          new DatabaseRecordAdjectivePair("quiet", "しずか", "な", Kanji.of("静か")),
//          new DatabaseRecordAdjectivePair("clean", "city", "きれい", "な", "とし"),
//          word().english("to live").japanese("すみます").kanji("住みます");
//
//          new DatabaseRecord(expl("family", "informal"), "かぞく"),
//          new DatabaseRecord(expl("mother", "own"), "はは", "母"),
//          new DatabaseRecord(expl("father", "own"), "ちち", "父"),
//          word().english("younger brother").japanese("おとうと").kanji("弟");
//          word().english("younger sister").japanese("いもうと").kanji("妹");
//          word().english("older brother").japanese("あに").kanji("兄");
//          new DatabaseRecord(expl("older sister", "own"), "あね", "姉"),
//          word().english("son").japanese("むすこ");
//          word().english("daughter").japanese("むすめ");
//          new DatabaseRecord(expl("husband", "informal"), "おっと", "夫"),
//          new DatabaseRecord(expl("wife", "informal"), "つま", "妻"),
//          word().english("office worker").japanese("かいしゃいん");
//          word().english("engineer").japanese("エンジニア");
//          word().english("nurse").japanese("かんごし");
//          word().english("four").japanese("よん").kanji("四");
//          word().english("five").japanese("ご").kanji("五");
//          word().english("six").japanese("ろく").kanji("六");
//          word().english("seven").japanese("なな").kanji("七");
//          word().english("years old").japanese("さい").kanji("歳");
//          new DatabaseRecordAdjectivePair("noisy", "うるさい"),
//          new DatabaseRecordAdjectivePair("famous", "ゆうめい", "な", Kanji.of("有名")),
//          new DatabaseRecordAdjectivePair("busy", "いそがしい", Kanji.of("忙しい")),
//          new DatabaseRecordAdjectivePair("smart", "あたまがいい")
//      );
//    }
//    static List<DatabaseRecord> u07() {
//      return listOf(
//          word().english("often").japanese("よく");
//          word().english("sometimes").japanese("ときどき").kanji("時々");
//          word().english("news").japanese("ニュース");
//          word().english("anime").japanese("アニメ");
//          word().english("book").japanese("ほん").kanji("本");
//          word().english("magazine").japanese("ざっし");
//          word().english("movie").japanese("えいが").kanji("映画");
//          word().english("music").japanese("おんがく").kanji("音楽");
//          word().english("manga").japanese("まんが");
//          word().english("tv").japanese("テレビ");
//          word().english("jazz").japanese("ジャズ");
//          word().english("pop").japanese("ポップス");
//          word().english("rock").japanese("ロック");
//          word().english("baseball").japanese("やきゅう");
//          word().english("soccer").japanese("サッカー");
//          word().english("basketball").japanese("バスケットボール");
//          word().english("volleyball").japanese("バレ-ボ-ル");
//          word().english("to watch").japanese("みます").kanji("見ます");
//          word().english("to do").japanese("します");
//          word().english("to read").japanese("よみます").kanji("読みます");
//          new DatabaseRecord("to listen", expl("ききます", "おんがく"), "聞きます"),
//
//          word().english("to eat").japanese("たべます").kanji("食べる");
//          word().english("to drink").japanese("のみます").kanji("飲む");
//          word().english("vegetable").japanese("やさい").kanji("野菜");
//          word().english("boxed lunch").japanese("べんとう").kanji("弁当");
//          word().english("sandwich").japanese("サンドイッチ");
//          word().english("bread").japanese("パン");
//          word().english("coffee").japanese("コーヒー");
//          word().english("juice").japanese("ジュース");
//          word().english("which one").japanese("どれ");
//          word().english("every").japanese("まい").kanji("舞");
//          word().english("morning").japanese("あさ").kanji("朝");
//          word().english("every morning").japanese("まいあさ").kanji("毎朝");
//          word().english("every day").japanese("まいにち").kanji("毎日");
//          word().english("breakfast").japanese("あさごはん").kanji("朝ご飯");
//          word().english("lunch").japanese("ひるごはん").kanji("昼ご飯");
//          word().english("dinner").japanese("ばんごはん").kanji("晩ご飯");
//          word().english("eight").japanese("はち").kanji("八");
//          word().english("nine").japanese("きゅう").kanji("九");
//          word().english("ten").japanese("じゅう").kanji("十");
//      );
//    }
//    static List<DatabaseRecord> u08() {
//      return listOf(
//          word().english("that over there").japanese("あの");
//          new DatabaseRecordAdjectivePair("wanting", "ほしい", Kanji.of("欲しい")),
//          new DatabaseRecordAdjectivePair("new", "あたらしい", Kanji.of("新しい")),
//          new DatabaseRecordAdjectivePair("old", "ふるい", Kanji.of("古い")),
//          new DatabaseRecordAdjectivePair("hideous", "ダサい"),
//          new DatabaseRecordAdjectivePair("fashionable", "おしゃれ", "な"),
//          new DatabaseRecordAdjectivePair("purple", "むらさきいろ", "の", Kanji.of("紫色")),
//          new DatabaseRecordAdjectivePair("blue", "あおい", Kanji.of("青い")),
//          new DatabaseRecordAdjectivePair("black", "くろい", Kanji.of("黒い")),
//          word().english("color").japanese("いろ").kanji("色");
//          word().english("clothes").japanese("ふく").kanji("服");
//          word().english("skirt").japanese("スカート");
//          word().english("jacket").japanese("ジャケット");
//          word().english("shirt").japanese("シャツ");
//          word().english("dress").japanese("ドレス");
//          word().english("necktie").japanese("ネクタイ");
//          word().english("wallet").japanese("さいふ").kanji("財布");
//          word().english("wait a moment").japanese("ちょっとまって");
//          word().english("how much").japanese("いくら");
//          word().english("hundred").japanese("ひゃく").kanji("百");
//          word().english("thousand").japanese("せん").kanji("千");
//          word().english("yen").japanese("えん").kanji("円");
//          word().english("thank you").japanese("ありがとうございます");
//          word().english("store").japanese("みせ").kanji("店");
//          new DatabaseRecord("restaurant", "レストラン", null),
//
//          new DatabaseRecordAdjectivePair("expensive", "shoe", "たかい", "", "くつ", "高い"),
//          new DatabaseRecordAdjectivePair("cheap", "やすい"),
//          word().english("how").japanese("どう");
//          word().english("udon").japanese("うどん");
//          word().english("meal set").japanese("ていしょく");
//          word().english("miso soup").japanese("みそしる");
//          word().english("soba").japanese("そば").kanji("蕎");
//          word().english("iced coffee").japanese("アイスコーヒー");
//          word().english("salad").japanese("サラダ");
//          word().english("tempura").japanese("てんぷら");
//          word().english("ice cream").japanese("アイスクリーム");
//          word().english("black tea").japanese("こうちゃ").kanji("紅茶");
//          word().english("rice ball").japanese("おにぎり");
//          new DatabaseRecord(expl("a bit", "+ verb, informal"), "すこし", "少し")
//      );
//    }
  }

//  static class DbPopS2 {
//    public static List<DatabaseRecord> u01() {
//      return listOf(
//          word().english("to swim").japanese("およぎます").kanji("泳ぎます");
//          word().english("yoga").japanese("ヨガ");
//          new DatabaseRecord(expl("game", "videogame"), "ゲーム"),
//          word().english("study").japanese("べんきょう").kanji("勉強");
//          word().english("job").japanese("しごと").kanji("仕事");
//          word().english("party").japanese("パーティー");
//          word().english("judo").japanese("じゅうどう");
//          word().english("karate").japanese("からて");
//          word().english("tennis").japanese("テニス");
//          word().english("sports").japanese("スポーツ");
//          word().english("saturday").japanese("どようび").kanji("土曜日");
//          word().english("sunday").japanese("にちようび").kanji("日曜日");
//          word().english("weekday").japanese("へいじつ").kanji("平日");
//          word().english("weekend").japanese("しゅうまつ").kanji("週末");
//          word().english("day before yesterday").japanese("おととい").kanji("一昨日");
//          word().english("yesterday").japanese("きのう").kanji("昨日");
//          word().english("every night").japanese("まいばん").kanji("毎晩");
//          word().english("friend").japanese("ともだち").kanji("友達");
//          word().english("to talk").japanese("はなします").kanji("話します");
//          word().english("to buy").japanese("かいます").kanji("買います");
//          word().english("to go out").japanese("でかけます").kanji("出かけます");
//          word().english("to hang out").japanese("あそびます").kanji("遊びます");
//          word().english("drama").japanese("ドラマ");
//          word().english("video").japanese("どうが");
//
//          word().english("um").japanese("ええと");
//          word().english("oh").japanese("あ");
//          word().english("okay then").japanese("じゃあ");
//          word().english("cafe").japanese("カフェ");
//          word().english("ticket gate").japanese("かいさつ");
//          word().english("elevator").japanese("エレベーター");
//          word().english("phone").japanese("でんわ").kanji("電話");
//          word().english("platform").japanese("ホ-ム");
//          word().english("outlet").japanese("コンセント");
//          word().english("trash can").japanese("ゴミばこ");
//          word().english("restroom").japanese("おてあらい");
//          word().english("exit").japanese("でぐち");
//          word().english("transfer").japanese("のりかえ");
//          word().english("taxi").japanese("タクシ-");
//          word().english("stair").japanese("かいだん");
//          word().english("storage locker").japanese("コインロッカ-");
//          word().english("vending machine").japanese("じはんき");
//          word().english("underground").japanese("ちか");
//          word().english("over there").japanese("あそこ");
//          new DatabaseRecord(expl("to have", "inanimate"), "あります"),
//          new DatabaseRecordAdjectivePair("close", "ちかい", Kanji.of("近い")),
//          new DatabaseRecordAdjectivePair("far", "とおい", Kanji.of("遠い")),
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u02() {
//      return listOf(
//          word().english("next week").japanese("らいしゅう").kanji("来週");
//          word().english("every week").japanese("まいしゅう").kanji("毎週");
//          word().english("always").japanese("いつも");
//          new DatabaseRecord(expl("to take", "a picture"), "とります", "撮ります"),
//          word().english("photo").japanese("しゃしん").kanji("写真");
//          word().english("trip").japanese("りょこう").kanji("旅行");
//          word().english("newspaper").japanese("しんぶん").kanji("新聞");
//          word().english("radio").japanese("ラジオ");
//          word().english("email").japanese("メ-ル");
//          word().english("pasta").japanese("パスタ");
//          word().english("to get up").japanese("おきます").kanji("起きます");
//          word().english("to run").japanese("はしります").kanji("走ります");
//          word().english("to sleep").japanese("ねます").kanji("寝ます");
//          word().english("tomorrow").japanese("あした").kanji("明日");
//          word().english("to make").japanese("つくります").kanji("作ります");
//          new DatabaseRecord(expl("to take", "a shower"), "あびます", "浴びます"),
//          word().english("shower").japanese("シャワ-");
//          new DatabaseRecord(expl("nice to meet you", "first time meeting"), "はじめまして"),
//          word().english("to be named").japanese("いいます").kanji("言います");
//          word().english("girlfriend").japanese("かのじょ").kanji("彼女");
//          word().english("boyfriend").japanese("かれし");
//          word().english("this way").japanese("こちら");
//          word().english("hobby").japanese("しゅみ");
//          word().english("horror").japanese("ホラ-");
//          word().english("fantasy").japanese("ファンタジー");
//          word().english("action").japanese("アクション");
//          word().english("mystery").japanese("ミステリ-");
//          word().english("comedy").japanese("コメディ");
//          word().english("romance").japanese("れんあい");
//          new DatabaseRecordAdjectivePair("liked", "すき", "な"),
//          word().english("vietnam").japanese("ベトナム");
//          word().english("china").japanese("ちゅうごく");
//          word().english("korea").japanese("かんこく").kanji("韓国");
//          word().english("to be able").japanese("できます");
//          word().english("what kind of").japanese("どんな");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u03() {
//      return listOf(
//          new DatabaseRecord(expl("to move", "house"), "ひっこします"),
//          word().english("apartment").japanese("アパ-ト");
//          new DatabaseRecordAdjectivePair("spacious", "ひろい", Kanji.of("広い")),
//          new DatabaseRecord(expl("kitchen", "modern"), "キッチン"),
//          word().english("air conditioner").japanese("エアコン");
//          word().english("still").japanese("まだ");
//          word().english("washing machine").japanese("せんたくき").kanji("洗濯機");
//          word().english("vacuum cleaner").japanese("そうじき").kanji("掃除機");
//          word().english("bookshelf").japanese("ほんだな").kanji("本棚");
//          word().english("this week").japanese("こんしゅう").kanji("今週");
//          word().english("window").japanese("まど").kanji("窓");
//          word().english("bathroom").japanese("トイレ");
//          word().english("cat").japanese("ねこ").kanji("猫");
//          word().english("dog").japanese("いぬ").kanji("犬");
//          new DatabaseRecord(expl("to have", "living thing"), "います"),
//          word().english("train").japanese("でんしゃ").kanji("電車");
//          new DatabaseRecord(expl("to go", "away"), "いきます", "行きます"),
//          word().english("next").japanese("つぎ").kanji("次");
//          word().english("about how long").japanese("どのぐらい");
//          new DatabaseRecord(expl("to take", "time"), "かかります"),
//          new DatabaseRecord(expl("about", "approximately"), "ぐらい"),
//          word().english("house").japanese("いえ").kanji("家");
//          word().english("desk").japanese("つくえ").kanji("机");
//          word().english("microwave").japanese("でんしレンジ");
//          word().english("futon").japanese("ふとん").kanji("布団");
//          new DatabaseRecordAdjectivePair("cramped", "せまい", Kanji.of("狭い")),
//          new DatabaseRecordAdjectivePair("well lit", "kitchen", "あかるい", "キッチン"),
//          word().english("fridge").japanese("れいぞうこ").kanji("冷蔵庫");
//          word().english("chair").japanese("いす").kanji("椅子");
//          word().english("perhaps").japanese("たぶん");
//          word().english("living room").japanese("リビング");
//          word().english("shelf").japanese("たな").kanji("棚");
//          word().english("bed").japanese("ベッド");
//          new DatabaseRecord(expl("when", "what time"), "いつ"),
//          new DatabaseRecordAdjectivePair("fast", "はやい", Kanji.of("速い")),
//          word().english("to come").japanese("きます").kanji("来ます");
//          new DatabaseRecordAdjectivePair("long", "ながい", Kanji.of("長い")),
//          word().english("bus").japanese("バス");
//          word().english("final stop").japanese("しゅうてん");
//          word().english("soon").japanese("もうすぐ");
//          word().english("park").japanese("こうえん").kanji("公園");
//          word().english("coach").japanese("コ-チ");
//          word().english("english").japanese("えいご");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u04() {
//      return listOf(
//          word().english("truth").japanese("ほんとう").kanji("本当");
//          word().english("shrine").japanese("じんじゃ");
//          word().english("postcard").japanese("ポストカ-ド");
//          new DatabaseRecordAdjectivePair("lovely", "すてき", "な"),
//          word().english("that one over there").japanese("あれ");
//          word().english("all right").japanese("だいじょうぶ");
//          word().english("condition").japanese("ぐあい");
//          new DatabaseRecordAdjectivePair("bad", "わるい", Kanji.of("悪い")),
//          word().english("ambulance").japanese("きゅうきゅうしゃ");
//          new DatabaseRecord(expl("to need", "I need help please"), "おねがいします"),
//          word().english("phone number").japanese("でんわばんごう");
//          word().english("number").japanese("ばんごう");
//          word().english("allergy").japanese("アレルギ-");
//          new DatabaseRecordAdjectivePair("tall", "mountain", "たかい", "", "やま", "高い"),
//          word().english("mountain").japanese("やま").kanji("山");
//          new DatabaseRecordAdjectivePair("pretty", "flower", "きれい", "な", "はな"),
//          word().english("flower").japanese("はな").kanji("花");
//          word().english("building").japanese("たてもの").kanji("建物");
//          word().english("temple").japanese("おてら");
//          word().english("dessert").japanese("デザ-ト");
//          word().english("snack").japanese("おかし").kanji("お菓子");
//          word().english("souvenir").japanese("おみやげ").kanji("お土産");
//          word().english("shop").japanese("や");
//          word().english("place").japanese("ところ");
//          new DatabaseRecordAdjectivePair("dangerous", "あぶない", "な"),
//          word().english("today").japanese("きょう").kanji("今日");
//          new DatabaseRecord(expl("parents", "formal"), "ごりょうしん"),
//          new DatabaseRecord(expl("parents", "informal"), "りょうしん", "両親"),
//          word().english("hospital").japanese("びょういん").kanji("病院");
//          word().english("police").japanese("けいさつ");
//          word().english("to rest").japanese("やすみます").kanji("休みます");
//          new DatabaseRecord(expl("family", "formal"), "ごかぞく"),
//          word().english("medicine").japanese("くすり");
//          word().english("make sure").japanese("ちゃんと");
//          word().english("to sit").japanese("すわります").kanji("座ります");
//          new DatabaseRecordAdjectivePair("hard", "たいへん", "な"),
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u05() {
//      return listOf(
//          word().english("weather").japanese("てんき").kanji("天気");
//          word().english("rain").japanese("あめ").kanji("雨");
//          word().english("sunny").japanese("はれ").kanji("晴れ");
//          word().english("sunny day").japanese("はれのひ");
//          new DatabaseRecordAdjectivePair("nice", "weather", "いい", "てんき"),
//          word().english("snow").japanese("ゆき").kanji("雪");
//          word().english("snowy day").japanese("ゆきのひ").kanji("雪の日");
//          new DatabaseRecordAdjectivePair("warm", "あたたかい"),
//          word().english("every year").japanese("まいとし").kanji("毎年");
//          word().english("every month").japanese("まいつき").kanji("毎月");
//          new DatabaseRecord("siblings", expl("きょうだい", "兄弟姉妹"), "兄弟"),
//          word().english("chinese").japanese("ちゅうごくご").kanji("中国語");
//          word().english("australia").japanese("オーストラリア");
//          word().english("japanese").japanese("にほんご").kanji("日本語");
//          new DatabaseRecord(expl("mother", "other's"), "おかあ", "お母"),
//          new DatabaseRecord(expl("father", "other's"), "おとう", "お父"),
//          new DatabaseRecordAdjectivePair("good health", "げんき", "な"),
//          word().english("welcome back").japanese("おかえりなさい");
//          word().english("he").japanese("かれ").kanji("彼");
//          new DatabaseRecord(expl("older sister", "other's"), "おねえ"),
//          new DatabaseRecord(expl("older brother", "other's"), "おにい", "お兄"),
//          word().english("pool").japanese("プ-ル");
//          word().english("firework").japanese("はなび");
//          word().english("concert").japanese("コンサ-ト");
//          word().english("break").japanese("やすみ").kanji("休み");
//          word().english("autumn").japanese("あき").kanji("秋");
//          new DatabaseRecordAdjectivePair("hot", "あつい", Kanji.of("熱い")),
//          word().english("spring").japanese("はる").kanji("春");
//          word().english("winter").japanese("ふゆ").kanji("冬");
//          word().english("cocoa").japanese("ココア");
//          word().english("day").japanese("ひ").kanji("日");
//          word().english("summer").japanese("なつ").kanji("夏");
//          word().english("cloud").japanese("くも").kanji("雲");
//          word().english("cloudy").japanese("くもり").kanji("曇り");
//          word().english("cloudy day").japanese("くもりのひ");
//          new DatabaseRecordAdjectivePair("cold", "さむい", Kanji.of("寒い")),
//          word().english("korean").japanese("かんこくご").kanji("韓国語");
//          word().english("taiwan").japanese("たいわん");
//          word().english("seoul").japanese("ソウル");
//          new DatabaseRecord(expl("child", "own"), "こども", "子供"),
//          new DatabaseRecord(expl("child", "other's"), "おこ", "子"),
//          word().english("malaysia").japanese("マレ-シア");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u06() {
//      return listOf(
//          word().english("after").japanese("あと");
//          word().english("chore").japanese("かじ");
//          word().english("to help").japanese("てつだいます");
//          word().english("homework").japanese("しゅくだい").kanji("宿題");
//          word().english("rest day").japanese("やすみのひ").kanji("休みの日");
//          word().english("gardening").japanese("ガ-デニング");
//          word().english("next month").japanese("らいげつ").kanji("来月");
//          word().english("france").japanese("フランス");
//          word().english("foreign language").japanese("ごが");
//          word().english("zoo").japanese("どうぶつえん").kanji("動物園");
//          word().english("stretch").japanese("ストレッチ");
//          new DatabaseRecord(expl("bath", "formal"), "おふろ"),
//          new DatabaseRecord(expl("bath", "informal"), "ふろ", "風呂"),
//          new DatabaseRecord(expl("who", "informal"), "だれ", "誰"),
//          new DatabaseRecordAdjectivePair("fun", "たのしい"),
//          word().english("and then").japanese("そして");
//          word().english("to return").japanese("かえります").kanji("帰ります");
//          word().english("home").japanese("うち");
//          new DatabaseRecord(expl("to take", "a bath"), "はいります", "入ります"),
//          word().english("laundry").japanese("せんたく").kanji("洗濯");
//          new DatabaseRecordAdjectivePair("various", "いろいろ", "な", Kanji.of("色々")),
//          word().english("cleaning").japanese("そうじ").kanji("掃除");
//          word().english("cooking").japanese("りょうり").kanji("料理");
//          word().english("suitcase").japanese("スーツケース");
//          new DatabaseRecord(expl("ticket", "sports games"), "チケット"),
//          word().english("airplane").japanese("ひこうき").kanji("飛行機");
//          word().english("plaza").japanese("ひろば");
//          word().english("lion").japanese("ライオン");
//          word().english("meat").japanese("にく").kanji("肉");
//          word().english("art museum").japanese("びじゅつかん");
//          word().english("to meet").japanese("あいます").kanji("会います");
//          word().english("painting").japanese("え").kanji("絵");
//          word().english("like").japanese("すき").kanji("好き");
//          new DatabaseRecord(expl("night", "not the rice one"), "よる", "夜"),
//          new DatabaseRecord(expl("night", "the rice one"), "ばん", "夜"),
//          word().english("week").japanese("しゅう").kanji("週");
//          word().english("month").japanese("つき").kanji("月");
//          word().english("year").japanese("とし").kanji("年");
//          word().english("hot spring").japanese("おんせん");
//          word().english("school").japanese("がっこう").kanji("学校");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u07() {
//      return listOf(
//          word().english("friday").japanese("きんようび").kanji("金曜日");
//          word().english("castle").japanese("しろ");
//          word().english("bullet train").japanese("しんかんせん");
//          word().english("look forward to").japanese("たのしみ");
//          word().english("monday").japanese("げつようび").kanji("月曜日");
//          word().english("tuesday").japanese("かようび").kanji("火曜日");
//          new DatabaseRecord(expl("love", "like a lot"), "だいすき", "大好き"),
//          word().english("matcha").japanese("まっちゃ");
//          word().english("cheesecake").japanese("チ-ズケ-キ");
//          word().english("donut").japanese("ド-ナツ");
//          word().english("chocolate").japanese("チョコレ-ト");
//          word().english("pie").japanese("パイ");
//          new DatabaseRecord("which", expl("どの", "物")),
//          word().english("garden").japanese("にわ").kanji("庭");
//          new DatabaseRecordAdjectivePair("short", "みじかい"),
//          word().english("sightseeing").japanese("かんこう");
//          new DatabaseRecord(expl("to ride", "train"), "のります"),
//          word().english("to wait").japanese("まちます").kanji("待ちます");
//          word().english("miso pork cutlet").japanese("みそかつ");
//          new DatabaseRecordAdjectivePair("convenient", "べんり", "な"),
//          word().english("lobby").japanese("ロビ-");
//          word().english("strawberry").japanese("いちご");
//          word().english("cookie").japanese("クッキ-");
//          new DatabaseRecordAdjectivePair("green", "みどりいろ", "の", Kanji.of("緑色")),
//          word().english("cupcake").japanese("カップケ-キ");
//          new DatabaseRecordAdjectivePair("sweet", "あまい", Kanji.of("甘い")),
//          word().english("stuff").japanese("もの");
//          word().english("seat").japanese("せき");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u08() {
//      return listOf(
//          word().english("soy sauce").japanese("しょうゆ").kanji("醬油");
//          word().english("fish").japanese("さかな").kanji("魚");
//          word().english("class").japanese("じゅぎょう").kanji("授業");
//          new DatabaseRecordAdjectivePair("interesting", "class", "おもしろい", "じゅぎょう"),
//          new DatabaseRecord(expl("to end", "finishes"), "おわります", "終わります"),
//          new DatabaseRecord("to ask", expl("ききます", "しつもん"), "聞きます"),
//          word().english("tofu").japanese("とうふ");
//          word().english("egg").japanese("たまご");
//          word().english("pork cutlet").japanese("とんかつ");
//          word().english("thursday").japanese("もくようび").kanji("木曜日");
//          word().english("cola").japanese("コ-ラ");
//          word().english("beef bowl").japanese("ぎゅうどん");
//          word().english("pork").japanese("ぶたにく");
//          word().english("pig").japanese("ぶた");
//          word().english("beer").japanese("ビ-ル");
//          word().english("salt").japanese("しお").kanji("塩");
//          word().english("more").japanese("もっと");
//          word().english("to use").japanese("つかいます").kanji("使います");
//          word().english("raw").japanese("なま");
//          word().english("supermarket").japanese("ス-パ-");
//          word().english("this night").japanese("こんばん").kanji("今晩");
//          word().english("together").japanese("いっしょ").kanji("一緒");
//          word().english("but").japanese("でも");
//          word().english("sauce").japanese("ソ-ス");
//          word().english("available").japanese("ひま");
//          new DatabaseRecordAdjectivePair("salty", "しょっぱい"),
//          word().english("table").japanese("テ-ブル");
//          word().english("what day").japanese("なんようび").kanji("何曜日");
//          word().english("wednesday").japanese("すいようび").kanji("水曜日");
//          word().english("test").japanese("テスト");
//          word().english("lot of").japanese("たくさん");
//          word().english("question").japanese("しつもん");
//          word().english("early").japanese("はやく");
//          word().english("classroom").japanese("きょうしつ");
//          word().english("deadline").japanese("しめきり");
//          word().english("project").japanese("プロジェクト");
//          word().english("spain").japanese("スペイン");
//          word().english("spanish").japanese("スペインご");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u09() {
//      return listOf(
//          new DatabaseRecord(expl("to wear", "lower body"), "はきます"),
//          word().english("to wash").japanese("あらいます").kanji("洗います");
//          word().english("exercise").japanese("うんどう");
//          word().english("driving").japanese("うんてん");
//          word().english("translation").japanese("ほんやく");
//          word().english("pro").japanese("プロ");
//          word().english("gym").japanese("ジム");
//          word().english("player").japanese("せんしゅ");
//          word().english("team").japanese("チ-ム");
//          word().english("entrance").japanese("いりぐち");
//          word().english("event").japanese("イベント");
//          word().english("entrance fee").japanese("にゅうじょうりょう");
//          word().english("roller coaster").japanese("ジェットコースター");
//          word().english("mascot").japanese("キャラクタ-");
//          word().english("face").japanese("かお");
//          word().english("flavor").japanese("あじ");
//          word().english("camera").japanese("カメラ");
//          word().english("dictionary").japanese("じしょ").kanji("辞書");
//          word().english("size").japanese("サイズ");
//          word().english("show").japanese("ショ-");
//          word().english("go-kart").japanese("ゴ-カ-ト");
//          word().english("attraction").japanese("アトラクション");
//          word().english("theme park").japanese("ゆうえんち");
//          word().english("museum").japanese("はくぶつかん");
//          word().english("a.m.").japanese("ごぜん").kanji("午前");
//          word().english("p.m.").japanese("ごご").kanji("午後");
//          new DatabaseRecordAdjectivePair("orange", "オレンジいろ", "の"),
//          new DatabaseRecordAdjectivePair("pink", "ピンクいろ", "の"),
//          new DatabaseRecordAdjectivePair("yellow", "きいろい", Kanji.of("黄色い")),
//          word().english("library").japanese("としょかん");
//          word().english("company").japanese("かいしゃ").kanji("会社");
//          new DatabaseRecordAdjectivePair("scary", "こわい"),
//          word().english("photographer").japanese("しゃしんか");
//          word().english("driver").japanese("うんてんしゅ");
//          word().english("translator").japanese("ほんやくか");
//          word().english("manager").japanese("マネージャー");
//          word().english("coworker").japanese("どうりょう");
//          word().english("mint chocolate chip").japanese("チョコミント");
//          word().english("vanilla").japanese("バニラ");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u10() {
//      return listOf(
//          word().english("documentary").japanese("ドキュメンタリ-");
//          word().english("fiction").japanese("フィクション");
//          word().english("non-fiction").japanese("ノンフィクション");
//          word().english("anime music").japanese("アニソン");
//          new DatabaseRecord(expl("really", "don't really read"), "あまり"),
//          new DatabaseRecordAdjectivePair("difficult", "むずかしい", Kanji.of("難しい")),
//          new DatabaseRecordAdjectivePair("boring", "つまらない"),
//          word().english("story").japanese("はなし").kanji("話");
//          word().english("gps").japanese("ナビ");
//
//          word().english("section").japanese("コ-ナ-");
//          word().english("sale").japanese("セ-ル");
//
//          word().english("poster").japanese("ポスタ-");
//          word().english("card game").japanese("カ-ドゲ-ム");
//          word().english("puzzle").japanese("パズル");
//          word().english("band").japanese("バンド");
//          word().english("album").japanese("アルバム");
//
//          word().english("actor").japanese("はいゆう");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u11() {
//      return listOf(
//          word().english("french　fries").japanese("フライドポテト");
//          word().english("front desk").japanese("うけつけ");
//          word().english("printer").japanese("プリンター");
//          word().english("fried rice").japanese("チャ-ハン");
//          word().english("until").japanese("まで");
//          new DatabaseRecord(expl("from", "time"), "から"),
//          word().english("meeting").japanese("ミーティング");
//          word().english("client").japanese("クライアント");
//          new DatabaseRecord(expl("training", "job-related"), "トレーニング"),
//          word().english("presentation").japanese("プレゼン");
//          word().english("computer").japanese("パソコン");
//          word().english("cafeteria").japanese("しょくどう").kanji("食堂");
//          word().english("last").japanese("さいご");
//          word().english("karaoke").japanese("カラオケ");
//          word().english("to sing").japanese("うたいます").kanji("歌います");
//          word().english("lunch break").japanese("ひるやすみ").kanji("ひる休み");
//          word().english("bar").japanese("バ-");
//
//          word().english("badminton").japanese("バドミントン");
//          word().english("piano").japanese("ピアノ");
//          word().english("instrument").japanese("がっき");
//          word().english("hiragana").japanese("ひらがな");
//          word().english("tonight").japanese("こんや");
//          word().english("kanji").japanese("かんじ").kanji("漢字");
//          new DatabaseRecord(expl("game", "match"), "しあい"),
//          word().english("to begin").japanese("はじまります").kanji("始まります");
//          word().english("lesson").japanese("レッスン");
//          word().english("practice").japanese("れんしゅう").kanji("練習");
//          word().english("post").japanese("きじ");
//          word().english("fashion").japanese("ファッション");
//          word().english("blog").japanese("ブログ");
//          word().english("to dance").japanese("おどります");
//          word().english("to write").japanese("かきます").kanji("書きます");
//          word().english("guitar").japanese("ギター");
//          new DatabaseRecord(expl("to play", "an instrument"), "ひきます", "弾きます"),
//          word().english("performance").japanese("パフォーマンス");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u12() {
//      return listOf(
//          word().english("shopping").japanese("かいもの").kanji("買い物");
//          word().english("name").japanese("なまえ").kanji("名前");
//          word().english("let's eat").japanese("いただきます");
//          word().english("thank you for the meal").japanese("ごちそうさまでした");
//          word().english("milk").japanese("ぎゅうにゅう").kanji("牛乳");
//          word().english("apple").japanese("りんご");
//          word().english("well then").japanese("では");
//          word().english("exactly").japanese("ちょうど");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u13() {
//      return listOf(
//          word().english("which school year").japanese("なんねんせい").kanji("何年生");
//          new DatabaseRecord(expl("kitchen", "older"), "だいどころ", "台所"),
//          word().english("bedroom").japanese("しんしつ").kanji("寝室");
//          word().english("sofa").japanese("ソファー");
//          word().english("room").japanese("へや").kanji("部屋");
//          word().english("midnight").japanese("れいじ").kanji("零時");
//          word().english("puppy").japanese("こいぬ").kanji("子犬");
//          word().english("kitten").japanese("こねこ").kanji("子猫");
//          word().english("bird").japanese("とり").kanji("鳥");
//          word().english("pet").japanese("ペット");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u14() {
//      return listOf(
//          word().english("foreigner").japanese("がいこくじん").kanji("外国人");
//          word().english("to be called").japanese("もうします").kanji("申します");
//          word().english("high school").japanese("こうこう").kanji("高校");
//          word().english("middle school").japanese("ちゅうがく").kanji("中学");
//          word().english("elementary school").japanese("しょうがく").kanji("小学");
//          word().english("studying abroad").japanese("りゅうがく").kanji("留学");
//          word().english("foreign exchange student").japanese("りゅうがくせい").kanji("留学生");
//          word().english("difference").japanese("ちがい").kanji("違い");
//          word().english("that is not the case").japanese("ちがいます").kanji("違います");
//          word().english("that's right").japanese("そうです");
//          word().english("zero").japanese("ゼロ").kanji("〇");
//          word().english("mood").japanese("ちょうし").kanji("調子");
//          word().english("how are you").japanese("ちょうしはいかがですか").kanji("調子はいかがですか");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u15() {
//      return listOf(
//          new DatabaseRecord("brothers", expl("きょうだい", "兄弟"), "兄弟"),
//          word().english("sisters").japanese("しまい").kanji("姉妹");
//          word().english("steak").japanese("ステーキ");
//          word().english("menu").japanese("メニュー");
//          word().english("ten thousand").japanese("まん").kanji("万");
//          new DatabaseRecordAdjectivePair("disliked", "きらい", "な", Kanji.of("嫌い")),
//          new DatabaseRecordAdjectivePair("bad tasting", "tea", "まずい", "おちゃ"),
//          new DatabaseRecordAdjectivePair("spicy", "からい"),
//          new DatabaseRecord("she", expl("かのじょ", "pronoun")),
//          new DatabaseRecord(expl("I", "male"), "ぼく", "僕"),
//          word().english("you").japanese("あなた");
//          word().english("they").japanese("かれら").kanji("彼ら");
//          word().english("noon").japanese("ひる").kanji("昼");
//          word().english("day after tomorrow").japanese("あさって").kanji("明後日");
//          new DatabaseRecordAdjectivePair("freezing", "つめたい", Kanji.of("冷たい")),
//          word().english("ballet").japanese("バレイ");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u16() {
//      return listOf(
//          word().english("to work").japanese("はたらきます").kanji("働きます");
//
//          word().english("upper left").japanese("ひだりうえ").kanji("左上");
//          word().english("lower left").japanese("ひだりした").kanji("左下");
//          word().english("upper right").japanese("みぎうえ").kanji("右上");
//          word().english("lower right").japanese("みぎした").kanji("右下");
//
//          word().english("left").japanese("ひだり").kanji("左");
//          word().english("right").japanese("みぎ").kanji("右");
//          word().english("above").japanese("うえ").kanji("上");
//          word().english("below").japanese("した").kanji("下");
//          word().english("before").japanese("まえ").kanji("前");
//          word().english("behind").japanese("うしろ").kanji("後ろ");
//          word().english("beside").japanese("よこ").kanji("横");
//          word().english("between").japanese("あいだ").kanji("間");
//          word().english("next door").japanese("となり").kanji("隣");
//          word().english("inside").japanese("なか").kanji("中");
//          word().english("outside").japanese("そと").kanji("外");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u17() {
//      return listOf(
//          word().english("housework").japanese("いえのそうじ").kanji("家の掃除");
//          word().english("corner").japanese("かたすみ").kanji("片隅");
//          new DatabaseRecordAdjectivePair("low", "chair", "ひくい", "", "いす", "低い"),
//          word().english("to turn on").japanese("つけます");
//          word().english("immediately").japanese("すぐ");
//          new DatabaseRecord(expl("to be opened", "window"), "あけます", "開けます"),
//          word().english("mirror").japanese("かがみ").kanji("鏡");
//          new DatabaseRecordAdjectivePair("dirty", "きたない", Kanji.of("汚い")),
//          word().english("electricity").japanese("でんき").kanji("電気");
//          new DatabaseRecord(expl("to close", "window"), "しめます", "閉めます"),
//          word().english("from then on").japanese("それから");
//          word().english("to stand up").japanese("たちます").kanji("立ちます");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u18() {
//      return listOf(
//          word().english("song").japanese("うた").kanji("歌");
//          word().english("to learn").japanese("ならいます").kanji("習います");
//          word().english("stroll").japanese("さんぽ").kanji("散歩");
//          word().english("letter").japanese("てがみ").kanji("手紙");
//          new DatabaseRecord(expl("wife", "formal"), "おくさん", "奥さん"),
//          new DatabaseRecord(expl("husband", "formal"), "ごしゅじん", "ご主人"),
//          word().english("parent").japanese("おや").kanji("親");
//          word().english("relative").japanese("しんせき").kanji("親戚");
//          word().english("cousin").japanese("いとこ");
//          word().english("uncle").japanese("おじ");
//          word().english("aunt").japanese("おば");
//          word().english("grandfather").japanese("そふ").kanji("祖父");
//          word().english("grandmother").japanese("そぼ").kanji("祖母");
//          word().english("grandchild").japanese("まご").kanji("孫");
//          word().english("granddaughter").japanese("まごむすめ").kanji("孫娘");
//          word().english("grandson").japanese("まごむすこ").kanji("孫息子");
//          word().english("to resemble").japanese("にます").kanji("似ます");
//          word().english("to draw").japanese("かきます").kanji("描きます");
//          word().english("being home").japanese("ざいたく").kanji("在宅");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u19() {
//      return listOf(
//          word().english("sweater").japanese("セーター");
//          new DatabaseRecord(expl("to wear", "head"), "かぶります", "被ります"),
//          word().english("car").japanese("くるま").kanji("車");
//          word().english("bicycle").japanese("じてんしゃ").kanji("自転車");
//          word().english("to walk").japanese("あるきます").kanji("歩きます");
//          new DatabaseRecordAdjectivePair("slow", "おそい", Kanji.of("遅い")),
//          new DatabaseRecordAdjectivePair("brown", "ちゃいろ", "の", Kanji.of("茶色")),
//          new DatabaseRecord(expl("to wear", "upper body"), "きます", "着ます"),
//          word().english("to take off").japanese("ぬぎます").kanji("脱ぎます");
//          word().english("pants").japanese("ズボン");
//          word().english("underwear").japanese("パンツ");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u20() {
//      return listOf(
//          word().english("movie theater").japanese("えいがかん").kanji("映画館");
//          word().english("this morning").japanese("けさ").kanji("今朝");
//          word().english("to fall").japanese("ふります").kanji("降ります");
//          new DatabaseRecordAdjectivePair("strong", "つよい", Kanji.of("強い")),
//          new DatabaseRecordAdjectivePair("weak", "よわい", Kanji.of("弱い")),
//          word().english("wind").japanese("かぜ").kanji("風");
//          word().english("this month").japanese("こんげつ").kanji("今月");
//          word().english("week after next").japanese("さらいしゅう").kanji("再来週");
//          word().english("to teach").japanese("おしえます").kanji("教えます");
//          new DatabaseRecord(expl("to make a call", "with a phone"), "かけます"),
//          word().english("last month").japanese("せんげつ").kanji("先月");
//          word().english("last night").japanese("ゆうべ").kanji("夕べ");
//          word().english("to blow").japanese("ふきます").kanji("吹きます");
//          word().english("evening").japanese("ゆうがた").kanji("夕方");
//          word().english("daytime").japanese("ひるま").kanji("昼間");
//          new DatabaseRecordAdjectivePair("dark", "weather", "くらい", "", "てんき", "暗い"),
//          new DatabaseRecordAdjectivePair("bright", "weather", "あかるい", "", "てんき", "明るい"),
//          word().english("sky").japanese("そら").kanji("空");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> udelta() {
//      return listOf(
//          word().english("free of charge").japanese("むりょう");
//          word().english("to look for").japanese("さがします");
//          word().english("password").japanese("パスワード");
//          word().english("spa").japanese("スパ");
//          word().english("ice").japanese("こおり");
//          word().english("to stay").japanese("とまります");
//          word().english("towel").japanese("タオル");
//          word().english("internet").japanese("ネット");
//          word().english("toast").japanese("トースト");
//          word().english("check-out").japanese("チェックアウト");
//          word().english("coffee maker").japanese("コーヒーメーカー");
//          word().english("room service").japanese("ルームサービス");
//          word().english("key").japanese("かぎ");
//          word().english("pancake").japanese("パンケーキ");
//          word().english("check-in").japanese("チェックイン");
//          word().english("credit card").japanese("クレジットカード");
//          word().english("change money").japanese("おつり");
//          word().english("chinese food").japanese("ちゅうかくりょうり");
//          word().english("to become open").japanese("あきます");
//          word().english("napkin").japanese("ナプキン");
//          word().english("chinatown").japanese("ちゅうかがい");
//          word().english("to pay").japanese("はらいます");
//          word().english("mapo tofu").japanese("マーポーとうふ");
//          word().english("bubble tea").japanese("タピオカティー");
//          word().english("oolong tea").japanese("ウーロンちゃ");
//          word().english("barbecue").japanese("バーベキュー");
//          word().english("scenery").japanese("けしき");
//          word().english("fried dumpling").japanese("ぎょうざ");
//          word().english("to fry").japanese("やきます");
//          word().english("backpack").japanese("バックパック");
//          word().english("to enjoy").japanese("たのしみます");
//          word().english("pepper").japanese("こしょう");
//          word().english("beef").japanese("ぎゅうにく");
//          word().english("shrimp").japanese("えび");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//          word().english("").japanese("");
//
//          word().english("").japanese("");
//      );
//    }
//
//  }
//
//  static class DbPopS3 {
//    public static List<DatabaseRecord> u01() {
//      return listOf(
//          word().english("not sure").japanese("さあ");
//          new DatabaseRecord(expl("not at all", "formal"), "まったく", "全く"),
//          new DatabaseRecord(expl("not at all", "informal"), "ぜんぜん", "全然"),
//          new DatabaseRecordAdjectivePair("many", "おおい", Kanji.of("多い")),
//          word().english("alcohol").japanese("おさけ").kanji("お酒");
//          word().english("fruit").japanese("くだもの").kanji("果物");
//          word().english("sugar").japanese("さとう").kanji("砂糖");
//          word().english("supper").japanese("ゆうはん").kanji("夕飯");
//          word().english("mint").japanese("ミント");
//          word().english("all of them").japanese("ぜんぶ").kanji("全部");
//          word().english("food").japanese("たべもの").kanji("食べ物");
//          word().english("I'm fine").japanese("けっこう").kanji("結構");
//          word().english("drink").japanese("のみもの").kanji("飲み物");
//          new DatabaseRecordAdjectivePair("a bit", "of time", "すくない", "", "じかん", "少ない"),
//          word().english("terribly").japanese("たいへん").kanji("大変");
//
//          word().english("which way").japanese("どちら");
//          word().english("in what way").japanese("どうやって");
//          word().english("bank").japanese("ぎんこう").kanji("銀行");
//          word().english("that way").japanese("そちら");
//          word().english("that way over there").japanese("あちら");
//          word().english("path").japanese("みち").kanji("道");
//          word().english("street").japanese("とおり").kanji("通り");
//          word().english("to leave").japanese("でます").kanji("出ます");
//          word().english("to enter").japanese("はいります").kanji("入ります");
//          word().english("across").japanese("むこう").kanji("向こう");
//          word().english("north").japanese("きた").kanji("北");
//          word().english("north-east").japanese("ほくとう").kanji("北東");
//          word().english("north-west").japanese("ほくせい").kanji("北西");
//          word().english("south").japanese("みなみ").kanji("南");
//          word().english("south-east").japanese("なんとう").kanji("南東");
//          word().english("south-west").japanese("なんせい").kanji("南西");
//          word().english("east").japanese("ひがし").kanji("東");
//          word().english("west").japanese("にし").kanji("西");
//          word().english("to get off").japanese("おります").kanji("降ります");
//          word().english("proximity").japanese("そば").kanji("側");
//          word().english("to pass by").japanese("とおります").kanji("通ります");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u02() {
//      return listOf(
//          word().english("this year").japanese("ことし").kanji("今年");
//          word().english("next year").japanese("らいねん").kanji("来年");
//          word().english("last year").japanese("きょねん").kanji("去年");
//          word().english("year after next").japanese("さらいねん").kanji("再来年");
//          word().english("year before last").japanese("おととし").kanji("一昨年");
//          word().english("congratulations").japanese("おめでとう");
//          word().english("birthday").japanese("たんじょうび").kanji("誕生日");
//          word().english("birth").japanese("たんじょう").kanji("誕生");
//          word().english("plate").japanese("さら").kanji("皿");
//          word().english("cup").japanese("カップ");
//          word().english("chopstick").japanese("はし").kanji("箸");
//          word().english("to be hungry").japanese("おなかがすきました").kanji("お腹がすきました");
//          word().english("to become empty").japanese("すきます").kanji("空きます");
//          word().english("stomach").japanese("おなか").kanji("お腹");
//          word().english("knife").japanese("ナイフ");
//          word().english("spoon").japanese("スプーン");
//          word().english("bowl").japanese("ボウル");
//          word().english("fork").japanese("フォーク");
//          word().english("rice bowl").japanese("ちゃわん").kanji("茶碗");
//          word().english("half").japanese("はんぶん").kanji("半分");
//          word().english("glass").japanese("グラス");
//          word().english("favourite food").japanese("こうぶつ").kanji("好物");
//          word().english("wine").japanese("ワイン");
//          word().english("lemon").japanese("レモン");
//          word().english("grape").japanese("ぶどう");
//          word().english("soup").japanese("スープ");
//          new DatabaseRecordAdjectivePair("sour", "すっぱい"),
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u03() {
//      return listOf(
//          word().english("money").japanese("おかね").kanji("お金");
//          word().english("clock").japanese("とけい").kanji("時計");
//          word().english("watch").japanese("うでどけい").kanji("腕時計");
//          word().english("luggage").japanese("にもつ").kanji("荷物");
//          word().english("to receive").japanese("もらいます");
//          word().english("other").japanese("ほか");
//          word().english("different").japanese("ちがう").kanji("違う");
//          word().english("same").japanese("おなじ").kanji("同じ");
//          word().english("this kind of").japanese("こんな");
//          new DatabaseRecordAdjectivePair("heavy", "おもい", Kanji.of("重い")),
//          new DatabaseRecordAdjectivePair("light", "かるい", Kanji.of("軽い")),
//          new DatabaseRecordAdjectivePair("sturdy", "じょうぶ", Kanji.of("丈夫")),
//          word().english("to put in").japanese("いれます").kanji("入れます");
//          word().english("to take out").japanese("だします").kanji("出します");
//          word().english("to give").japanese("あげます");
//          word().english("for someone").japanese("にとって");
//          word().english("bakery").japanese("パンや").kanji("パン屋");
//          word().english("cashier").japanese("かいけい").kanji("会計");
//          word().english("how about").japanese("いかが");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u04() {
//      return listOf(
//          word().english("female").japanese("おんな").kanji("女");
//          word().english("magnificent").japanese("りっぱ").kanji("立派");
//          new DatabaseRecord(expl("who", "formal"), "どなた"),
//          new DatabaseRecord(expl("person", "formal"), "かた", "方"),
//          word().english("adult female").japanese("おんなのひと").kanji("女の人");
//          word().english("adult male").japanese("おとこのひと").kanji("男の人");
//          word().english("child female").japanese("おんなのこ").kanji("女の子");
//          word().english("child male").japanese("おとこのこ").kanji("男の子");
//          new DatabaseRecord(expl("everyone", "formal"), "みなさん", "皆さん"),
//          new DatabaseRecord(expl("everyone", "informal"), "みんな", "皆"),
//          word().english("to summon").japanese("よびます").kanji("呼びます");
//          word().english("crowd").japanese("おおぜい").kanji("大勢");
//          word().english("marriage").japanese("けっこん").kanji("結婚");
//          word().english("divorce").japanese("りこん").kanji("離婚");
//          word().english("young").japanese("わかい").kanji("若い");
//          word().english("adult").japanese("おとな").kanji("大人");
//          word().english("baby").japanese("あかちゃん").kanji("赤ちゃん");
//          word().english("to die").japanese("しにます").kanji("死にます");
//          word().english("to be born").japanese("うまれます").kanji("生まれます");
//          word().english("to pass away").japanese("なくなります").kanji("亡くなります");
//          word().english("single").japanese("どくしん").kanji("独身");
//          word().english("to break up").japanese("わかれます").kanji("別れます");
//          word().english("date").japanese("デート");
//          word().english("lover").japanese("こいびと").kanji("恋人");
//          word().english("intention").japanese("つもり");
//          word().english("cool").japanese("すずしい").kanji("涼しい");
//          new DatabaseRecord(expl("to hold up", "umbrella"), "?????", "????"),
//          word().english("however").japanese("しかし");
//          word().english("handle it with care").japanese("たいせつにしてね");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u05() {
//      return listOf(
//          new DatabaseRecordAdjectivePair("tight", "きつい"),
//          new DatabaseRecordAdjectivePair("loose", "ゆるい"),
//          word().english("socks").japanese("くつした").kanji("靴下");
//          new DatabaseRecordAdjectivePair("gray", "はいいろ", "の", Kanji.of("灰色")),
//          word().english("ash").japanese("はい").kanji("灰");
//          word().english("glove").japanese("てぶくろ").kanji("手袋");
//          word().english("straight").japanese("まっすぐ");
//          word().english("to advance").japanese("すすみます").kanji("進みます");
//          word().english("corner").japanese("かど").kanji("角");
//          word().english("which　way").japanese("どっち");
//          word().english("that way over there").japanese("あっち");
//          word().english("that way").japanese("そっち");
//          word().english("this way").japanese("こっち");
//          word().english("to turn").japanese("まがります").kanji("曲がります");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u06() {
//      return listOf(
//          word().english("to turn off").japanese("けします").kanji("消します");
//          word().english("early morning").japanese("あさはやく").kanji("朝早く");
//          word().english("quickly").japanese("はやく").kanji("早く");
//          word().english("to work for").japanese("つとめます").kanji("勤めます");
//          word().english("door").japanese("ドア");
//          word().english("cell phone").japanese("けいたいでんわ").kanji("携帯電話");
//          word().english("to possess").japanese("もちます").kanji("持ちます");
//          word().english("slowly").japanese("ゆっくり");
//
//          word().english("to bloom").japanese("さきます").kanji("咲きます");
//          word().english("to fly").japanese("とびます").kanji("飛びます");
//          word().english("deer").japanese("しか").kanji("鹿");
//          word().english("fox").japanese("キツネ");
//          word().english("monkey").japanese("サル");
//          word().english("pigeon").japanese("ハト");
//          word().english("horse").japanese("うま").kanji("馬");
//          word().english("cow").japanese("うし").kanji("牛");
//          word().english("bear").japanese("くま").kanji("熊");
//          word().english("animal").japanese("どうぶつ").kanji("動物");
//          word().english("voice").japanese("こえ").kanji("声");
//          new DatabaseRecord(expl("to make a sound", "animals"), "鳴きます", "なきます"),
//          word().english("pond").japanese("いけ").kanji("池");
//          word().english("river").japanese("かわ").kanji("川");
//          word().english("sea").japanese("うみ").kanji("海");
//          word().english("to climb").japanese("のぼります").kanji("登ります");
//          word().english("tree").japanese("き").kanji("木");
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u07() {
//      return listOf(
//          word().english("already").japanese("もう");
//          word().english("textbook").japanese("きょうかしょ").kanji("教科書");
//          word().english("like this").japanese("こう");
//          word().english("must not").japanese("いけません");
//          word().english("meaning").japanese("いみ").kanji("意味");
//          word().english("to memorize").japanese("おぼえます").kanji("覚えます");
//          word().english("word").japanese("ことば").kanji("言葉");
//          word().english("to consult").japanese("ひきます").kanji("引きます");
//          word().english("to need").japanese("いります").kanji("要ります");
//          word().english("shopping bag").japanese("レジぶくろ").kanji("レジ袋");
//          new DatabaseRecord(expl("a bit", "+ verb, formal"), "しょうしょう", "少々"),
//          word().english("to heat up").japanese("あたためます").kanji("温めます");
//          word().english("fired chicken").japanese("からあげ").kanji("唐揚げ");
//          word().english("french fries").japanese("フライドポテト");
//          word().english("receipt").japanese("レシート");
//          word().english("takeout").japanese("もちかえり").kanji("持ち帰り");
//          word().english("in the store").japanese("てんない").kanji("店内");
//          new DatabaseRecordAdjectivePair("good", "よろしい"),
//          new DatabaseRecord(expl("to eat", "formal"), "めしあがります", "召し上がります"),
//          word().english("").japanese("").kanji("");
//          word().english("").japanese("").kanji("");
//          word().english("").japanese("").kanji("");
//      );
//    }
//    public static List<DatabaseRecord> u08() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u09() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u10() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u11() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u12() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u13() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u14() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u15() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u16() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u17() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u18() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u19() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u20() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u21() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u22() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u23() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u24() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u25() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u26() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u27() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u28() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u29() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u30() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u31() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u32() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u33() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u34() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u35() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u36() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u37() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u38() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u39() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//    public static List<DatabaseRecord> u40() {
//      return listOf(
//
//          word().english("").japanese("");
//      );
//    }
//  }


  private static List<DatabaseRecord> recs;
  private static DatabaseRecordBuilder<?> builder;

  private static void reset() {
    recs = new ArrayList<>();
    builder = null;
  }

  private static WordDatabaseRecordBuilder word() {
    if (builder != null) {
      recs.addAll(builder.build());
    }
    return (WordDatabaseRecordBuilder) (builder = new WordDatabaseRecordBuilder());
  }

  private static NameDatabaseRecordBuilder name() {
    if (builder != null) {
      recs.addAll(builder.build());
    }
    return (NameDatabaseRecordBuilder) (builder = new NameDatabaseRecordBuilder());
  }

  private static CountryDatabaseRecordBuilder country() {
    if (builder != null) {
      recs.addAll(builder.build());
    }
    return (CountryDatabaseRecordBuilder) (builder = new CountryDatabaseRecordBuilder());
  }

  private static AdjectiveDatabaseRecordBuilder adj(AdjectiveType type) {
    if (builder != null) {
      recs.addAll(builder.build());
    }
    return (AdjectiveDatabaseRecordBuilder) (builder = new AdjectiveDatabaseRecordBuilder(type));
  }

  private static List<DatabaseRecord> dump() {
    if (builder != null) {
      recs.addAll(builder.build());
    }
    builder = null;
    return new ArrayList<>(recs);
  }

}