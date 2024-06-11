package com.example.demo;

import static com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder.AdjectiveType.I;
import static com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder.AdjectiveType.NA;
import static com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder.AdjectiveType.NO;
import static com.example.demo.recbuilder.DatabaseRecordBuilder.Honorific.GO;
import static com.example.demo.recbuilder.DatabaseRecordBuilder.Honorific.O;

import com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder;
import com.example.demo.recbuilder.AdjectiveDatabaseRecordBuilder.AdjectiveType;
import com.example.demo.recbuilder.CountryDatabaseRecordBuilder;
import com.example.demo.recbuilder.DatabaseRecordBuilder;
import com.example.demo.recbuilder.NameDatabaseRecordBuilder;
import com.example.demo.recbuilder.WordDatabaseRecordBuilder;

import java.util.ArrayList;
import java.util.List;

// counting: https://www.tofugu.com/japanese/counting-in-japanese/
// counters: https://www.tofugu.com/japanese/japanese-counters-list/
class DatabaseTematicPopulator {
  static class DbPopCount {
    static List<DatabaseRecord> numbersKango() {
      reset();
      word().english("zero").japanese("れい").kanji("零");
      word().english("one").japanese("いち").kanji("一");
      word().english("two").japanese("に").kanji("二");
      word().english("three").japanese("さん").kanji("三");
      word().english("four").japanese("よん").kanji("四");
      word().english("five").japanese("ご").kanji("五");
      word().english("six").japanese("ろく").kanji("六");
      word().english("seven").japanese("なな").kanji("七");
      word().english("eight").japanese("はち").kanji("八");
      word().english("nine").japanese("きゅう").kanji("九");
      word().english("ten").japanese("じゅう").kanji("十");
      word().english("forty").japanese("よんじゅう").kanji("四十");
      word().english("seventy").japanese("ななじゅう").kanji("七十");
      word().english("ninety").japanese("きゅうじゅう").kanji("九十");
      word().english("hundred").japanese("ひゃく").kanji("百");
      word().english("three hundred").japanese("さんびゃく").kanji("三百");
      word().english("six hundred").japanese("ろっぴゃく").kanji("六百");
      word().english("eight hundred").japanese("はっぴゃく").kanji("八百");
      word().english("thousand").japanese("せん").kanji("千");
      word().english("three thousand").japanese("さんぜん").kanji("三千");
      word().english("eight thousand").japanese("はっせん").kanji("八千");
      word().english("ten thousand").japanese("まん").kanji("万");
      return dump();
    }

    static List<DatabaseRecord> numbersWago() {
      reset();
      word().english("0").japanese("なし");
      word().english("1").japanese("ひと");
      word().english("2").japanese("ふた");
      word().english("3").japanese("み");
      word().english("4").japanese("よ");
      word().english("5").japanese("いつ");
      word().english("6").japanese("む");
      word().english("7").japanese("なな");
      word().english("8").japanese("や");
      word().english("9").japanese("ここの");
      word().english("10").japanese("とお");
      return dump();
    }

    //    static List<DatabaseRecord> time() {
//      reset();
//          word().english("time").japanese("じかん").kanji("時間");
//
//          word().english("one hour").japanese("いちじかん").kanji("一時間");
//          word().english("two hours").japanese("にじかん").kanji("ニ時間");
//          word().english("three hours").japanese("さんじかん").kanji("三時間");
//          word().english("four hours").japanese("よじかん").kanji("四時間");
//          word().english("five hours").japanese("ごじかん").kanji("五時間");
//          word().english("six hours").japanese("ろくじかん").kanji("六時間");
//          word().english("seven hours").japanese("しちじかん").kanji("七時間");
//          word().english("eight hours").japanese("はちじかん").kanji("八時間");
//          word().english("nine hours").japanese("くじかん").kanji("九時間");
//          word().english("ten hours").japanese("じゅうじかん").kanji("十時間");
//
//          word().english("how many hours").japanese("なんじかん").kanji("何時間");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> minute() {
//      reset();
//          word().english("minute").japanese("ふん").kanji("分");
//          word().english("one minute").japanese("いっぷん").kanji("一分");
//          word().english("two minutes").japanese("にふん").kanji("ニ分");
//          word().english("three minutes").japanese("さんぷん").kanji("三分");
//          word().english("four minutes").japanese("よんぷん").kanji("四分");
//          word().english("five minutes").japanese("ごふん").kanji("五分");
//          word().english("six minutes").japanese("ろっぷん").kanji("六分");
//          word().english("seven minutes").japanese("ななふん").kanji("七分");
//          word().english("eight minutes").japanese("はっぷん").kanji("八分");
//          word().english("nine minutes").japanese("きゅうふん").kanji("九分");
//          word().english("ten minutes").japanese("じゅっぷん").kanji("十分");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
    static List<DatabaseRecord> hour() {
      reset();
      word().english("o'clock").japanese("じ").kanji("時");
      word().english("one o'clock").japanese("いちじ").kanji("一時");
      word().english("two o'clock").japanese("にじ").kanji("ニ時");
      word().english("three o'clock").japanese("さんじ").kanji("三時");
      word().english("four o'clock").japanese("よじ").kanji("四時");
      word().english("five o'clock").japanese("ごじ").kanji("五時");
      word().english("six o'clock").japanese("ろくじ").kanji("六時");
      word().english("seven o'clock").japanese("しちじ").kanji("七時");
      word().english("eight o'clock").japanese("はちじ").kanji("八時");
      word().english("nine o'clock").japanese("くじ").kanji("九時");
      word().english("ten o'clock").japanese("じゅうじ").kanji("十時");
      word().english("what time").japanese("なんじ").kanji("何時");
      return dump();
    }

    //    static List<DatabaseRecord> calendarDay() {
//      reset();
//          word().english("1st").japanese("ついたち").kanji("一日");
//          word().english("2nd").japanese("ふつか").kanji("二日");
//          word().english("3rd").japanese("みっか").kanji("三日");
//          word().english("6th").japanese("むいか").kanji("六日");
//          word().english("7th").japanese("なのか").kanji("七日");
//          word().english("8th").japanese("ようか").kanji("八日");
//          word().english("9th").japanese("ここのか").kanji("九日");
//          word().english("10th").japanese("とおか").kanji("十日");
//          word().english("20th").japanese("はつか").kanji("二十日");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> month() {
//      reset();
//          word().english("january").japanese("いちがつ").kanji("一月");
//          word().english("february").japanese("にちがつ").kanji("日月");
//          word().english("april").japanese("しがつ").kanji("四月");
//          word().english("may").japanese("ごがつ").kanji("五月");
//          word().english("july").japanese("しちがつ").kanji("七月");
//          word().english("september").japanese("くがつ").kanji("九月");
//          word().english("october").japanese("じゅうがつ").kanji("十月");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> timeLength() {
//      reset();
//          word().english("1 day").japanese("いちにち").kanji("一日");
//          word().english("2 days").japanese("ふつか").kanji("二日");
//          word().english("3 days").japanese("みっか").kanji("三日");
//          word().english("5 days").japanese("いつか").kanji("五日");
//          word().english("7 days").japanese("なのか").kanji("七日");
//          word().english("8 days").japanese("ようか").kanji("八日");
//          word().english("9 days").japanese("ここのか").kanji("九日");
//          word().english("10 days").japanese("とおか").kanji("十日");
//          word().english("20 days").japanese("はつか").kanji("二十日");
//
//          word().english("1 week").japanese("いっしゅうかん").kanji("一週間");
//          word().english("2 weeks").japanese("にしゅうかん").kanji("二週間");
//          word().english("3 weeks").japanese("さんしゅうかん").kanji("三週間");
//
//          word().english("2 months").japanese("にかげつ").kanji("二ヶ月");
//          word().english("10 months").japanese("じゅっかげつ").kanji("十ヶ月");
//          word().english("11 months").japanese("じゅういっかげつ").kanji("十一ヶ月");
//
//          word().english("1 year").japanese("いちねん").kanji("一年");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }

    static List<DatabaseRecord> age() {
      reset();
      word().english("years old").japanese("さい").kanji("歳");
      word().english("one year old").japanese("いっさい").kanji("一歳");
      word().english("two years old").japanese("にさい").kanji("ニ歳");
      word().english("three years old").japanese("さんさい").kanji("三歳");
      word().english("four years old").japanese("よんさい").kanji("四歳");
      word().english("five years old").japanese("ごさい").kanji("五歳");
      word().english("six years old").japanese("ろくさい").kanji("六歳");
      word().english("seven years old").japanese("ななさい").kanji("七歳");
      word().english("eight years old").japanese("はっさい").kanji("八歳");
      word().english("nine years old").japanese("きゅうさい").kanji("九歳");
      word().english("ten years old").japanese("じゅっさい").kanji("十歳");
      word().english("how old").eExpl("informal").japanese("なんさい").kanji("何歳");
      word().english("how old").eExpl("formal").japanese("おいくつ");
      return dump();
    }

//    static List<DatabaseRecord> anything() {
//      reset();
//          word().english("one pie").japanese("ひとつ").kanji("一つ");
//          word().english("two pies").japanese("ふたつ").kanji("二つ");
//          word().english("three pies").japanese("みっつ").kanji("三つ");
//          word().english("four pies").japanese("よっつ").kanji("四つ");
//          word().english("five pies").japanese("いつつ").kanji("五つ");
//          word().english("six pies").japanese("むっつ").kanji("六つ");
//          word().english("seven pies").japanese("ななつ").kanji("七つ");
//          word().english("eight pies").japanese("やっつ").kanji("八つ");
//          word().english("nine pies").japanese("ここのつ").kanji("九つ");
//
//          new DatabaseRecAdj("how many pies", "いくつ"),
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> anythingFormed() {
//      reset();
//          word().english("one apple").japanese("いっこ").kanji("一個");
//          word().english("two apples").japanese("にこ").kanji("二個");
//          word().english("three apples").japanese("さんこ").kanji("三個");
//          word().english("four apples").japanese("よんこ").kanji("四個");
//          word().english("five apples").japanese("ごこ").kanji("五個");
//          word().english("six apples").japanese("ろっこ").kanji("六個");
//          word().english("seven apples").japanese("ななこ").kanji("七個");
//          word().english("eight apples").japanese("はちこ").kanji("八個");
//          word().english("nine apples").japanese("きゅうこ").kanji("九個");
//          word().english("ten apples").japanese("じゅっこ").kanji("十個");
//          word().english("how many apples").japanese("なんこ").kanji("何個");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> person() {
//      reset();
//          word().english("one person").japanese("ひとり").kanji("一人");
//          word().english("two persons").japanese("ふたり").kanji("二人");
//          word().english("three persons").japanese("さんにん").kanji("三人");
//          word().english("four persons").japanese("よにん").kanji("四人");
//          word().english("eight persons").japanese("はちにん").kanji("八人");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> politePerson() {
//      reset();
//          word().english("how many people").japanese("なんめい").kanji("何名");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> floor() {
//      reset();
//          word().english("floor").japanese("かい").kanji("階");
//          word().english("first floor").japanese("いっかい").kanji("一階");
//          word().english("second floor").japanese("にかい").kanji("二階");
//          word().english("third floor").japanese("さんかい").kanji("三階");
//          word().english("fourth floor").japanese("よんかい").kanji("四階");
//          word().english("which floor").japanese("なんかい").kanji("何階");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> machineFurnitureCake() {
//      reset();
//          word().english("two cars").japanese("にだい").kanji("二台");
//          word().english("how many tables").japanese("なんだい").kanji("何台");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> legwear() {
//      reset();
//          word().english("one pair of socks").japanese("いっそく").kanji("一足");
//          word().english("two pairs of socks").japanese("にそく").kanji("二足");
//          word().english("three pairs of socks").japanese("さんそく").kanji("三足");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> pair() {
//      reset();
//          word().english("two pairs of gloves").japanese("ふたくみ").kanji("二組");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> cylinder() {
//      reset();
//          word().english("one fork").japanese("いっぽん").kanji("一本");
//          word().english("two chopsticks").japanese("にほん").kanji("日本");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> flat() {
//      reset();
//          word().english("one plate").japanese("いちまい").kanji("一枚");
//          word().english("hundred pictures").japanese("ひゃくまい").kanji("百枚");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> bird() {
//      reset();
//          word().english("one bird").japanese("いちわ").kanji("一羽");
//          word().english("two birds").japanese("にわ").kanji("二羽");
//          word().english("three birds").japanese("さんわ").kanji("三羽");
//          word().english("four birds").japanese("よんわ").kanji("四羽");
//          word().english("seven birds").japanese("ななわ").kanji("七羽");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> book() {
//      reset();
//          word().english("one book").japanese("いっさつ").kanji("一冊");
//          word().english("six books").japanese("ろくさつ").kanji("六冊");
//          word().english("ten books").japanese("じゅうさつ").kanji("十冊");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
//    static List<DatabaseRecord> smallAnimal() {
//      reset();
//          word().english("one cat").japanese("いっぴき").kanji("一匹");
//          word().english("three dogs").japanese("さんびき").kanji("三匹");
//          word().english("five cats").japanese("ごひき").kanji("五匹");
//
//          new DatabaseRecAdj("", "")
//     return dump();
//    }
  }

  static class DbPopHiraKata {
//    static List<DatabaseRecord> hira() {
//      reset();
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
//     return dump();
//    }
//    static List<DatabaseRecord> kata() {
//      reset();
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
//     return dump();
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
      adj(I).english("tasty").japanese("おいしい").subject("ramen", "ラーメン");
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

    static List<DatabaseRecord> u06() {
      reset();
      word().english("hotel").japanese("ホテル");
      word().english("department store").japanese("デパート");
      word().english("convenience store").japanese("コンビニ");
      word().english("bus stop").japanese("バスてい");
      word().english("train station").japanese("えき").kanji("駅");
      word().english("university").japanese("だいがく");
      word().english("here").japanese("ここ");
      word().english("there").japanese("そこ");
      word().english("where").japanese("どこ");
      return dump();
    }

    static List<DatabaseRecord> u07() {
      reset();
      word().english("hat").japanese("ぼうし").kanji("帽子");
      word().english("umbrella").japanese("かさ").kanji("傘");
      word().english("shoe").japanese("くつ").kanji("靴");
      word().english("coat").japanese("コート");
      word().english("these ones").japanese("これら");
      word().english("those ones").japanese("それら");
      adj(I).english("red").japanese("あかい").kanji("赤い").subject("shoe", "くつ");
      adj(I).english("white").japanese("しろい").kanji("白い").subject("shoe", "くつ");
      word().english("I").eExpl("female").japanese("わたし").kanji("私");
      word().english("I").eExpl("male").japanese("ぼく").kanji("僕");
      return dump();
    }

    static List<DatabaseRecord> u08() {
      reset();
      word().english("this").japanese("この");
      word().english("that").japanese("その");
      adj(I).english("cheerful").japanese("あかるい").jExpl("ひと").kanji("明るい");
      adj(I).english("funny").japanese("おもしろい");
      adj(I).english("cute").japanese("かわいい");
      name().english("tanaka").japanese("たなか").kanji("田中");
      name().english("yamaguchi").japanese("やまぐち").kanji("山口");
      name().english("nakayama").japanese("なかやま").kanji("中山");
      return dump();
    }

    static List<DatabaseRecord> u09() {
      reset();
      word().english("half-").japanese("はん").kanji("半");
      word().english("excuse me").japanese("すみません");
      word().english("now").japanese("いま").kanji("今");
      word().english("about").eExpl("time").japanese("ごろ");
      return dump();
    }

    static List<DatabaseRecord> u10() {
      reset();
      word().english("airport").japanese("くうこう").kanji("空港");
      word().english("subway").japanese("ちかてつ").kanji("地下鉄");
      word().english("passport").japanese("パスポート");
      word().english("smartphone").japanese("スマホ");
      word().english("ticket").eExpl("train").japanese("きっぷ");
      word().english("bag").japanese("かばん").kanji("鞄");
      word().english("map").japanese("ちず").kanji("地図");
      return dump();
    }
  }

  static class DbPopS2 {
    static List<DatabaseRecord> u01() {
      reset();
      word().english("good morning").japanese("おはようございます");
      word().english("welcome").eExpl("be welcomed").japanese("ようこそ");
      word().english("nice to meet you").eExpl("first time meeting").japanese("はじめまして");
      word().english("hometown").japanese("しゅっしん");
      word().english("city").japanese("とし").kanji("都市");
      word().english("town").japanese("まち");
      word().english("very").japanese("とても");
      word().english("kyoto").japanese("きょうと").kanji("京都");
      word().english("tokyo").japanese("とうきょう").kanji("東京");
      word().english("osaka").japanese("おおさか").kanji("大阪");
      adj(NA).english("lively").japanese("にぎやか").subject("city", "とし").kanji("賑やか");
      adj(NA).english("quiet").japanese("しずか").subject("city", "とし").kanji("静か");
      adj(NA).english("clean").japanese("きれい").jExpl("都市").subject("city", "とし");
      word().english("name").japanese("なまえ").honorific(O).kanji("名前");
      word().english("new york").japanese("ニューヨーク");
      word().english("to live").japanese("すみます").kanji("住みます");
      word().english("how about").japanese("どう");
      word().english("toronto").japanese("トロント");
      return dump();
    }

    static List<DatabaseRecord> u02() {
      reset();
      word().english("family").japanese("かぞく").honorific(GO);
      word().english("mother").eExpl("own").japanese("はは").kanji("母");
      word().english("father").eExpl("own").japanese("ちち").kanji("父");
      word().english("younger brother").japanese("おとうと").kanji("弟");
      word().english("younger sister").japanese("いもうと").kanji("妹");
      word().english("older brother").japanese("あに").kanji("兄");
      word().english("older sister").eExpl("own").japanese("あね").kanji("姉");
      adj(I).english("noisy").japanese("うるさい");
      adj(NA).english("famous").japanese("ゆうめい").kanji("有名");
      adj(I).english("busy").japanese("いそがしい").kanji("忙しい");
      adj(I).english("smart").japanese("あたまがいい");
      adj(NA).english("fashionable").japanese("おしゃれ");
      word().english("son").japanese("むすこ");
      word().english("daughter").japanese("むすめ");
      word().english("husband").eExpl("informal").japanese("おっと").kanji("夫");
      word().english("wife").eExpl("informal").japanese("つま").kanji("妻");
      word().english("office worker").japanese("かいしゃいん");
      word().english("engineer").japanese("エンジニア");
      word().english("nurse").japanese("かんごし");
      word().english("university student").japanese("だいがくせい").kanji("大学生");
      return dump();
    }

    static List<DatabaseRecord> u03() {
      reset();
      word().english("tv").japanese("テレビ");
      word().english("sometimes").japanese("ときどき").kanji("時々");
      word().english("news").japanese("ニュース");
      word().english("magazine").japanese("ざっし");
      word().english("movie").japanese("えいが").kanji("映画");
      word().english("music").japanese("おんがく").kanji("音楽");
      word().english("manga").japanese("まんが");
      word().english("jazz").japanese("ジャズ");
      word().english("baseball").japanese("やきゅう");
      word().english("anime").japanese("アニメ");
      word().english("to watch").japanese("みます").kanji("見ます");
      word().english("soccer").japanese("サッカー");
      word().english("to do").japanese("します");
      word().english("basketball").japanese("バスケットボール");
      word().english("often").japanese("よく");
      word().english("book").japanese("ほん").kanji("本");
      word().english("to read").japanese("よみます").kanji("読みます");
      word().english("to listen").japanese("ききます").jExpl("おんがく").kanji("聞きます");
      word().english("pop").japanese("ポップス");
      word().english("rock").japanese("ロック");
      return dump();
    }

    static List<DatabaseRecord> u04() {
      reset();
      word().english("to eat").japanese("たべます").kanji("食べる");
      word().english("to drink").japanese("のみます").kanji("飲む");
      word().english("bread").japanese("パン");
      word().english("coffee").japanese("コーヒー");
      word().english("juice").japanese("ジュース");
      word().english("boxed lunch").japanese("べんとう").kanji("弁当");
      word().english("sandwich").japanese("サンドイッチ");
      word().english("every").japanese("まい").kanji("舞");
      word().english("morning").japanese("あさ").kanji("朝");
      word().english("every morning").japanese("まいあさ").kanji("毎朝");
      word().english("every day").japanese("まいにち").kanji("毎日");
      word().english("every night").japanese("まいばん").kanji("毎晩");
      word().english("breakfast").japanese("あさごはん").kanji("朝ご飯");
      word().english("lunch").japanese("ひるごはん").kanji("昼ご飯");
      word().english("dinner").japanese("ばんごはん").kanji("晩ご飯");
      return dump();
    }

//    static List<DatabaseRecord> u06() {
//      reset();
//          new DatabaseRecord(expl("welcome", "to this shop"), "いらっしゃいませ"),
//     return dump();
//    }
//    static List<DatabaseRecord> u07() {
//      reset();
//          word().english("vegetable").japanese("やさい").kanji("野菜");
//          word().english("which one").japanese("どれ");
//          word().english("volleyball").japanese("バレ-ボ-ル");
//
//     return dump();
//    }
//    static List<DatabaseRecord> u08() {
//      reset();
//          word().english("that over there").japanese("あの");
//          adj(I).english("wanting").japanese("ほしい").kanji("欲しい");
//          adj(I).english("new").japanese("あたらしい").kanji("新しい");
//          adj(I).english("old").japanese("ふるい").kanji("古い");
//          adj(I).english("hideous").japanese("ダサい");
//          new DatabaseRecordAdjectivePair("purple", "むらさきいろ", "の", Kanji.of("紫色")),
//          adj(I).english("blue").japanese("あおい").kanji("青い");
//          adj(I).english("black").japanese("くろい").kanji("黒い");
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
//          word().english("yen").japanese("えん").kanji("円");
//          word().english("thank you").japanese("ありがとうございます");
//          word().english("store").japanese("みせ").kanji("店");
//          new DatabaseRecord("restaurant", "レストラン", null),
//
//          new DatabaseRecordAdjectivePair("expensive", "shoe", "たかい", "", "くつ", "高い"),
//          adj(I).english("cheap").japanese("やすい");
//
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
//          word().english("a bit").eExpl("+ verb, informal").japanese("すこし").kanji("少し");
//     return dump();
//    }
  }

//  static class DbPopS2 {
//    public static List<DatabaseRecord> u01() {
//      reset();
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
//          adj(I).english("close").japanese("ちかい").kanji("近い");
//          adj(I).english("far").japanese("とおい").kanji("遠い");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u02() {
//      reset();
//          word().english("next week").japanese("らいしゅう").kanji("来週");
//          word().english("every week").japanese("まいしゅう").kanji("毎週");
//          word().english("always").japanese("いつも");
//          word().english("to take").eExpl("a picture").japanese("とります").kanji("撮ります");
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
//          word().english("to take").eExpl("a shower").japanese("あびます").kanji("浴びます");
//          word().english("shower").japanese("シャワ-");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u03() {
//      reset();
//          new DatabaseRecord(expl("to move", "house"), "ひっこします"),
//          word().english("apartment").japanese("アパ-ト");
//          adj(I).english("spacious").japanese("ひろい").kanji("広い");
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
//          word().english("to go").eExpl("away").japanese("いきます").kanji("行きます");
//          word().english("next").japanese("つぎ").kanji("次");
//          word().english("about how long").japanese("どのぐらい");
//          new DatabaseRecord(expl("to take", "time"), "かかります"),
//          new DatabaseRecord(expl("about", "approximately"), "ぐらい"),
//          word().english("house").japanese("いえ").kanji("家");
//          word().english("desk").japanese("つくえ").kanji("机");
//          word().english("microwave").japanese("でんしレンジ");
//          word().english("futon").japanese("ふとん").kanji("布団");
//          adj(I).english("cramped").japanese("せまい").kanji("狭い");
//          new DatabaseRecordAdjectivePair("well lit", "kitchen", "あかるい", "キッチン"),
//          word().english("fridge").japanese("れいぞうこ").kanji("冷蔵庫");
//          word().english("chair").japanese("いす").kanji("椅子");
//          word().english("perhaps").japanese("たぶん");
//          word().english("living room").japanese("リビング");
//          word().english("shelf").japanese("たな").kanji("棚");
//          word().english("bed").japanese("ベッド");
//          new DatabaseRecord(expl("when", "what time"), "いつ"),
//          adj(I).english("fast").japanese("はやい").kanji("速い");
//          word().english("to come").japanese("きます").kanji("来ます");
//          adj(I).english("long").japanese("ながい").kanji("長い");
//          word().english("bus").japanese("バス");
//          word().english("final stop").japanese("しゅうてん");
//          word().english("soon").japanese("もうすぐ");
//          word().english("park").japanese("こうえん").kanji("公園");
//          word().english("coach").japanese("コ-チ");
//          word().english("english").japanese("えいご");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u04() {
//      reset();
//          word().english("truth").japanese("ほんとう").kanji("本当");
//          word().english("shrine").japanese("じんじゃ");
//          word().english("postcard").japanese("ポストカ-ド");
//          new DatabaseRecordAdjectivePair("lovely", "すてき", "な"),
//          word().english("that one over there").japanese("あれ");
//          word().english("all right").japanese("だいじょうぶ");
//          word().english("condition").japanese("ぐあい");
//          adj(I).english("bad").japanese("わるい").kanji("悪い");
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
//          word().english("parents").eExpl("informal").japanese("りょうしん").kanji("両親");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u05() {
//      reset();
//          word().english("weather").japanese("てんき").kanji("天気");
//          word().english("rain").japanese("あめ").kanji("雨");
//          word().english("sunny").japanese("はれ").kanji("晴れ");
//          word().english("sunny day").japanese("はれのひ");
//          new DatabaseRecordAdjectivePair("nice", "weather", "いい", "てんき"),
//          word().english("snow").japanese("ゆき").kanji("雪");
//          word().english("snowy day").japanese("ゆきのひ").kanji("雪の日");
//          adj(I).english("warm").japanese("あたたかい");
//          word().english("every year").japanese("まいとし").kanji("毎年");
//          word().english("every month").japanese("まいつき").kanji("毎月");
//          new DatabaseRecord("siblings", expl("きょうだい", "兄弟姉妹"), "兄弟"),
//          word().english("chinese").japanese("ちゅうごくご").kanji("中国語");
//          word().english("australia").japanese("オーストラリア");
//          word().english("japanese").japanese("にほんご").kanji("日本語");
//          word().english("mother").eExpl("other's").japanese("おかあ").kanji("お母");
//          word().english("father").eExpl("other's").japanese("おとう").kanji("お父");
//          new DatabaseRecordAdjectivePair("good health", "げんき", "な"),
//          word().english("welcome back").japanese("おかえりなさい");
//          word().english("he").japanese("かれ").kanji("彼");
//          new DatabaseRecord(expl("older sister", "other's"), "おねえ"),
//          word().english("older brother").eExpl("other's").japanese("おにい").kanji("お兄");
//          word().english("pool").japanese("プ-ル");
//          word().english("firework").japanese("はなび");
//          word().english("concert").japanese("コンサ-ト");
//          word().english("break").japanese("やすみ").kanji("休み");
//          word().english("autumn").japanese("あき").kanji("秋");
//          adj(I).english("hot").japanese("あつい").kanji("熱い");
//          word().english("spring").japanese("はる").kanji("春");
//          word().english("winter").japanese("ふゆ").kanji("冬");
//          word().english("cocoa").japanese("ココア");
//          word().english("day").japanese("ひ").kanji("日");
//          word().english("summer").japanese("なつ").kanji("夏");
//          word().english("cloud").japanese("くも").kanji("雲");
//          word().english("cloudy").japanese("くもり").kanji("曇り");
//          word().english("cloudy day").japanese("くもりのひ");
//          adj(I).english("cold").japanese("さむい").kanji("寒い");
//          word().english("korean").japanese("かんこくご").kanji("韓国語");
//          word().english("taiwan").japanese("たいわん");
//          word().english("seoul").japanese("ソウル");
//          word().english("child").eExpl("own").japanese("こども").kanji("子供");
//          word().english("child").eExpl("other's").japanese("おこ").kanji("子");
//          word().english("malaysia").japanese("マレ-シア");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u06() {
//      reset();
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
//          word().english("bath").eExpl("informal").japanese("ふろ").kanji("風呂");
//          word().english("who").eExpl("informal").japanese("だれ").kanji("誰");
//          adj(I).english("fun").japanese("たのしい");
//          word().english("and then").japanese("そして");
//          word().english("to return").japanese("かえります").kanji("帰ります");
//          word().english("home").japanese("うち");
//          word().english("to take").eExpl("a bath").japanese("はいります").kanji("入ります");
//          word().english("laundry").japanese("せんたく").kanji("洗濯");
//          adj(NA).english("various").japanese("いろいろ").kanji("色々");
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
//          word().english("night").eExpl("not the rice one").japanese("よる").kanji("夜");
//          word().english("night").eExpl("the rice one").japanese("ばん").kanji("夜");
//          word().english("week").japanese("しゅう").kanji("週");
//          word().english("month").japanese("つき").kanji("月");
//          word().english("year").japanese("とし").kanji("年");
//          word().english("hot spring").japanese("おんせん");
//          word().english("school").japanese("がっこう").kanji("学校");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u07() {
//      reset();
//          word().english("friday").japanese("きんようび").kanji("金曜日");
//          word().english("castle").japanese("しろ");
//          word().english("bullet train").japanese("しんかんせん");
//          word().english("look forward to").japanese("たのしみ");
//          word().english("monday").japanese("げつようび").kanji("月曜日");
//          word().english("tuesday").japanese("かようび").kanji("火曜日");
//          word().english("love").eExpl("like a lot").japanese("だいすき").kanji("大好き");
//          word().english("matcha").japanese("まっちゃ");
//          word().english("cheesecake").japanese("チ-ズケ-キ");
//          word().english("donut").japanese("ド-ナツ");
//          word().english("chocolate").japanese("チョコレ-ト");
//          word().english("pie").japanese("パイ");
//          new DatabaseRecord("which", expl("どの", "物")),
//          word().english("garden").japanese("にわ").kanji("庭");
//          adj(I).english("short").japanese("みじかい");
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
//          adj(I).english("sweet").japanese("あまい").kanji("甘い");
//          word().english("stuff").japanese("もの");
//          word().english("seat").japanese("せき");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u08() {
//      reset();
//          word().english("soy sauce").japanese("しょうゆ").kanji("醬油");
//          word().english("fish").japanese("さかな").kanji("魚");
//          word().english("class").japanese("じゅぎょう").kanji("授業");
//          new DatabaseRecordAdjectivePair("interesting", "class", "おもしろい", "じゅぎょう"),
//          word().english("to end").eExpl("finishes").japanese("おわります").kanji("終わります");
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
//          adj(I).english("salty").japanese("しょっぱい");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u09() {
//      reset();
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
//          adj(I).english("yellow").japanese("きいろい").kanji("黄色い");
//          word().english("library").japanese("としょかん");
//          word().english("company").japanese("かいしゃ").kanji("会社");
//          adj(I).english("scary").japanese("こわい");
//          word().english("photographer").japanese("しゃしんか");
//          word().english("driver").japanese("うんてんしゅ");
//          word().english("translator").japanese("ほんやくか");
//          word().english("manager").japanese("マネージャー");
//          word().english("coworker").japanese("どうりょう");
//          word().english("mint chocolate chip").japanese("チョコミント");
//          word().english("vanilla").japanese("バニラ");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u10() {
//      reset();
//          word().english("documentary").japanese("ドキュメンタリ-");
//          word().english("fiction").japanese("フィクション");
//          word().english("non-fiction").japanese("ノンフィクション");
//          word().english("anime music").japanese("アニソン");
//          new DatabaseRecord(expl("really", "don't really read"), "あまり"),
//          adj(I).english("difficult").japanese("むずかしい").kanji("難しい");
//          adj(I).english("boring").japanese("つまらない");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u11() {
//      reset();
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
//          word().english("to play").eExpl("an instrument").japanese("ひきます").kanji("弾きます");
//          word().english("performance").japanese("パフォーマンス");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u12() {
//      reset();
//          word().english("shopping").japanese("かいもの").kanji("買い物");
//          word().english("let's eat").japanese("いただきます");
//          word().english("thank you for the meal").japanese("ごちそうさまでした");
//          word().english("milk").japanese("ぎゅうにゅう").kanji("牛乳");
//          word().english("apple").japanese("りんご");
//          word().english("well then").japanese("では");
//          word().english("exactly").japanese("ちょうど");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u13() {
//      reset();
//          word().english("which school year").japanese("なんねんせい").kanji("何年生");
//          word().english("kitchen").eExpl("older").japanese("だいどころ").kanji("台所");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u14() {
//      reset();
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u15() {
//      reset();
//          new DatabaseRecord("brothers", expl("きょうだい", "兄弟"), "兄弟"),
//          word().english("sisters").japanese("しまい").kanji("姉妹");
//          word().english("steak").japanese("ステーキ");
//          word().english("menu").japanese("メニュー");
//          adj(NA).english("disliked").japanese("きらい").kanji("嫌い");
//          new DatabaseRecordAdjectivePair("bad tasting", "tea", "まずい", "おちゃ"),
//          adj(I).english("spicy").japanese("からい");
//          new DatabaseRecord("she", expl("かのじょ", "pronoun")),
//          word().english("I").eExpl("male").japanese("ぼく").kanji("僕");
//          word().english("you").japanese("あなた");
//          word().english("they").japanese("かれら").kanji("彼ら");
//          word().english("noon").japanese("ひる").kanji("昼");
//          word().english("day after tomorrow").japanese("あさって").kanji("明後日");
//          adj(I).english("freezing").japanese("つめたい").kanji("冷たい");
//          word().english("ballet").japanese("バレイ");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u16() {
//      reset();
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u17() {
//      reset();
//          word().english("housework").japanese("いえのそうじ").kanji("家の掃除");
//          word().english("corner").japanese("かたすみ").kanji("片隅");
//          new DatabaseRecordAdjectivePair("low", "chair", "ひくい", "", "いす", "低い"),
//          word().english("to turn on").japanese("つけます");
//          word().english("immediately").japanese("すぐ");
//          word().english("to be opened").eExpl("window").japanese("あけます").kanji("開けます");
//          word().english("mirror").japanese("かがみ").kanji("鏡");
//          adj(I).english("dirty").japanese("きたない").kanji("汚い");
//          word().english("electricity").japanese("でんき").kanji("電気");
//          word().english("to close").eExpl("window").japanese("しめます").kanji("閉めます");
//          word().english("from then on").japanese("それから");
//          word().english("to stand up").japanese("たちます").kanji("立ちます");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u18() {
//      reset();
//          word().english("song").japanese("うた").kanji("歌");
//          word().english("to learn").japanese("ならいます").kanji("習います");
//          word().english("stroll").japanese("さんぽ").kanji("散歩");
//          word().english("letter").japanese("てがみ").kanji("手紙");
//          word().english("wife").eExpl("formal").japanese("おくさん").kanji("奥さん");
//          word().english("husband").eExpl("formal").japanese("ごしゅじん").kanji("ご主人");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u19() {
//      reset();
//          word().english("sweater").japanese("セーター");
//          word().english("to wear").eExpl("head").japanese("かぶります").kanji("被ります");
//          word().english("car").japanese("くるま").kanji("車");
//          word().english("bicycle").japanese("じてんしゃ").kanji("自転車");
//          word().english("to walk").japanese("あるきます").kanji("歩きます");
//          adj(I).english("slow").japanese("おそい").kanji("遅い");
//          new DatabaseRecordAdjectivePair("brown", "ちゃいろ", "の", Kanji.of("茶色")),
//          word().english("to wear").eExpl("upper body").japanese("きます").kanji("着ます");
//          word().english("to take off").japanese("ぬぎます").kanji("脱ぎます");
//          word().english("pants").japanese("ズボン");
//          word().english("underwear").japanese("パンツ");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u20() {
//      reset();
//          word().english("movie theater").japanese("えいがかん").kanji("映画館");
//          word().english("this morning").japanese("けさ").kanji("今朝");
//          word().english("to fall").japanese("ふります").kanji("降ります");
//          adj(I).english("strong").japanese("つよい").kanji("強い");
//          adj(I).english("weak").japanese("よわい").kanji("弱い");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> udelta() {
//      reset();
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
//     return dump();
//    }
//
//  }
//
//  static class DbPopS3 {
//    public static List<DatabaseRecord> u01() {
//      reset();
//          word().english("not sure").japanese("さあ");
//          word().english("not at all").eExpl("formal").japanese("まったく").kanji("全く");
//          word().english("not at all").eExpl("informal").japanese("ぜんぜん").kanji("全然");
//          adj(I).english("many").japanese("おおい").kanji("多い");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u02() {
//      reset();
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
//          adj(I).english("sour").japanese("すっぱい");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u03() {
//      reset();
//          word().english("money").japanese("おかね").kanji("お金");
//          word().english("clock").japanese("とけい").kanji("時計");
//          word().english("watch").japanese("うでどけい").kanji("腕時計");
//          word().english("luggage").japanese("にもつ").kanji("荷物");
//          word().english("to receive").japanese("もらいます");
//          word().english("other").japanese("ほか");
//          word().english("different").japanese("ちがう").kanji("違う");
//          word().english("same").japanese("おなじ").kanji("同じ");
//          word().english("this kind of").japanese("こんな");
//          adj(I).english("heavy").japanese("おもい").kanji("重い");
//          adj(I).english("light").japanese("かるい").kanji("軽い");
//          adj(I).english("sturdy").japanese("じょうぶ").kanji("丈夫");
//          word().english("to put in").japanese("いれます").kanji("入れます");
//          word().english("to take out").japanese("だします").kanji("出します");
//          word().english("to give").japanese("あげます");
//          word().english("for someone").japanese("にとって");
//          word().english("bakery").japanese("パンや").kanji("パン屋");
//          word().english("cashier").japanese("かいけい").kanji("会計");
//          word().english("how about").japanese("いかが");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u04() {
//      reset();
//          word().english("female").japanese("おんな").kanji("女");
//          word().english("magnificent").japanese("りっぱ").kanji("立派");
//          new DatabaseRecord(expl("who", "formal"), "どなた"),
//          word().english("person").eExpl("formal").japanese("かた").kanji("方");
//          word().english("adult female").japanese("おんなのひと").kanji("女の人");
//          word().english("adult male").japanese("おとこのひと").kanji("男の人");
//          word().english("child female").japanese("おんなのこ").kanji("女の子");
//          word().english("child male").japanese("おとこのこ").kanji("男の子");
//          word().english("everyone").eExpl("formal").japanese("みなさん").kanji("皆さん");
//          word().english("everyone").eExpl("informal").japanese("みんな").kanji("皆");
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
//          word().english("to hold up").eExpl("umbrella").japanese("?????").kanji("????");
//          word().english("however").japanese("しかし");
//          word().english("handle it with care").japanese("たいせつにしてね");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u05() {
//      reset();
//          adj(I).english("tight").japanese("きつい");
//          adj(I).english("loose").japanese("ゆるい");
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
//     return dump();
//    }
//    public static List<DatabaseRecord> u06() {
//      reset();
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
//          word().english("to make a sound").eExpl("animals").japanese("鳴きます").kanji("なきます");
//          word().english("pond").japanese("いけ").kanji("池");
//          word().english("river").japanese("かわ").kanji("川");
//          word().english("sea").japanese("うみ").kanji("海");
//          word().english("to climb").japanese("のぼります").kanji("登ります");
//          word().english("tree").japanese("き").kanji("木");
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u07() {
//      reset();
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
//          word().english("a bit").eExpl("+ verb, formal").japanese("しょうしょう").kanji("少々");
//          word().english("to heat up").japanese("あたためます").kanji("温めます");
//          word().english("fired chicken").japanese("からあげ").kanji("唐揚げ");
//          word().english("french fries").japanese("フライドポテト");
//          word().english("receipt").japanese("レシート");
//          word().english("takeout").japanese("もちかえり").kanji("持ち帰り");
//          word().english("in the store").japanese("てんない").kanji("店内");
//          adj(I).english("good").japanese("よろしい");
//          word().english("to eat").eExpl("formal").japanese("めしあがります").kanji("召し上がります");
//          word().english("").japanese("").kanji("");
//          word().english("").japanese("").kanji("");
//          word().english("").japanese("").kanji("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u08() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u09() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u10() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u11() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u12() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u13() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u14() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u15() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u16() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u17() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u18() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u19() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u20() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u21() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u22() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u23() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u24() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u25() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u26() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u27() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u28() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u29() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u30() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u31() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u32() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u33() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u34() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u35() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u36() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u37() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u38() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u39() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
//    }
//    public static List<DatabaseRecord> u40() {
//      reset();
//
//          word().english("").japanese("");
//     return dump();
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