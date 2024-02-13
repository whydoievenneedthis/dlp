package com.example.demo;

import static com.example.demo.DatabasePopulator.expl;
import static com.example.demo.DatabasePopulator.listOf;

import com.example.demo.DatabasePopulator.Kanji;

import java.util.List;

// counters: https://www.tofugu.com/japanese/japanese-counters-list/
class DatabaseTematicPopulator {
  static class DbPopCount {
    static List<DatabaseRecord> time() {
      return listOf(
          new DatabaseRecAdj("time", "じかん", "時間"),

          new DatabaseRecAdj("one hour", "いちじかん", "一時間"),
          new DatabaseRecAdj("two hours", "にじかん", "ニ時間"),
          new DatabaseRecAdj("three hours", "さんじかん", "三時間"),
          new DatabaseRecAdj("four hours", "よじかん", "四時間"),
          new DatabaseRecAdj("five hours", "ごじかん", "五時間"),
          new DatabaseRecAdj("six hours", "ろくじかん", "六時間"),
          new DatabaseRecAdj("seven hours", "しちじかん", "七時間"),
          new DatabaseRecAdj("eight hours", "はちじかん", "八時間"),
          new DatabaseRecAdj("nine hours", "くじかん", "九時間"),
          new DatabaseRecAdj("ten hours", "じゅうじかん", "十時間"),

          new DatabaseRecAdj("how many hours", "なんじかん", "何時間"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> minute() {
      return listOf(
          new DatabaseRecAdj("minute", "ふん", "分"),
          new DatabaseRecAdj("one minute", "いっぷん", "一分"),
          new DatabaseRecAdj("two minutes", "にふん", "ニ分"),
          new DatabaseRecAdj("three minutes", "さんぷん", "三分"),
          new DatabaseRecAdj("four minutes", "よんぷん", "四分"),
          new DatabaseRecAdj("five minutes", "ごふん", "五分"),
          new DatabaseRecAdj("six minutes", "ろっぷん", "六分"),
          new DatabaseRecAdj("seven minutes", "ななふん", "七分"),
          new DatabaseRecAdj("eight minutes", "はっぷん", "八分"),
          new DatabaseRecAdj("nine minutes", "きゅうふん", "九分"),
          new DatabaseRecAdj("ten minutes", "じゅっぷん", "十分"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> hour() {
      return listOf(
          new DatabaseRecAdj("o'clock", "じ", "時"),
          new DatabaseRecAdj("one o'clock", "いちじ", "一時"),
          new DatabaseRecAdj("two o'clock", "にじ", "ニ時"),
          new DatabaseRecAdj("three o'clock", "さんじ", "三時"),
          new DatabaseRecAdj("four o'clock", "よじ", "四時"),
          new DatabaseRecAdj("five o'clock", "ごじ", "五時"),
          new DatabaseRecAdj("six o'clock", "ろくじ", "六時"),
          new DatabaseRecAdj("seven o'clock", "しちじ", "七時"),
          new DatabaseRecAdj("eight o'clock", "はちじ", "八時"),
          new DatabaseRecAdj("nine o'clock", "くじ", "九時"),
          new DatabaseRecAdj("ten o'clock", "じゅうじ", "十時"),
          new DatabaseRecAdj("what time", "なんじ", "何時"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> calendarDay() {
      return listOf(
          new DatabaseRecAdj("1st", "ついたち", "一日"),
          new DatabaseRecAdj("2nd", "ふつか", "二日"),
          new DatabaseRecAdj("3rd", "みっか", "三日"),
          new DatabaseRecAdj("6th", "むいか", "六日"),
          new DatabaseRecAdj("7th", "なのか", "七日"),
          new DatabaseRecAdj("8th", "ようか", "八日"),
          new DatabaseRecAdj("9th", "ここのか", "九日"),
          new DatabaseRecAdj("10th", "とおか", "十日"),
          new DatabaseRecAdj("20th", "はつか", "二十日"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> month() {
      return listOf(
          new DatabaseRecAdj("january", "いちがつ", "一月"),
          new DatabaseRecAdj("february", "にちがつ", "日月"),
          new DatabaseRecAdj("april", "しがつ", "四月"),
          new DatabaseRecAdj("may", "ごがつ", "五月"),
          new DatabaseRecAdj("july", "しちがつ", "七月"),
          new DatabaseRecAdj("september", "くがつ", "九月"),
          new DatabaseRecAdj("october", "じゅうがつ", "十月"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> timeLength() {
      return listOf(
          new DatabaseRecAdj("1 day", "いちにち", "一日"),
          new DatabaseRecAdj("2 days", "ふつか", "二日"),
          new DatabaseRecAdj("3 days", "みっか", "三日"),
          new DatabaseRecAdj("5 days", "いつか", "五日"),
          new DatabaseRecAdj("7 days", "なのか", "七日"),
          new DatabaseRecAdj("8 days", "ようか", "八日"),
          new DatabaseRecAdj("9 days", "ここのか", "九日"),
          new DatabaseRecAdj("10 days", "とおか", "十日"),
          new DatabaseRecAdj("20 days", "はつか", "二十日"),

          new DatabaseRecAdj("1 week", "いっしゅうかん", "一週間"),
          new DatabaseRecAdj("2 weeks", "にしゅうかん", "二週間"),
          new DatabaseRecAdj("3 weeks", "さんしゅうかん", "三週間"),

          new DatabaseRecAdj("2 months", "にかげつ", "二ヶ月"),
          new DatabaseRecAdj("10 months", "じゅっかげつ", "十ヶ月"),
          new DatabaseRecAdj("11 months", "じゅういっかげつ", "十一ヶ月"),

          new DatabaseRecAdj("1 year", "いちねん", "一年"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> age() {
      return listOf(
          new DatabaseRecAdj("age", "さい", "歳"),
          new DatabaseRecAdj("one year old", "いっさい", "一歳"),
          new DatabaseRecAdj("two years old", "にさい", "ニ歳"),
          new DatabaseRecAdj("three years old", "さんさい", "三歳"),
          new DatabaseRecAdj("four years old", "よんさい", "四歳"),
          new DatabaseRecAdj("five years old", "ごさい", "五歳"),
          new DatabaseRecAdj("six years old", "ろくさい", "六歳"),
          new DatabaseRecAdj("seven years old", "ななさい", "七歳"),
          new DatabaseRecAdj("eight years old", "はっさい", "八歳"),
          new DatabaseRecAdj("nine years old", "きゅうさい", "九歳"),
          new DatabaseRecAdj("ten years old", "じゅっさい", "十歳"),
          new DatabaseRecAdj(expl("how old", "informal"), "なんさい", "何歳"),
          new DatabaseRecAdj(expl("how old", "formal"), "おいくつ"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> anything() {
      return listOf(
          new DatabaseRecAdj("one pie", "ひとつ", "一つ"),
          new DatabaseRecAdj("two pies", "ふたつ", "二つ"),
          new DatabaseRecAdj("three pies", "みっつ", "三つ"),
          new DatabaseRecAdj("four pies", "よっつ", "四つ"),
          new DatabaseRecAdj("five pies", "いつつ", "五つ"),
          new DatabaseRecAdj("six pies", "むっつ", "六つ"),
          new DatabaseRecAdj("seven pies", "ななつ", "七つ"),
          new DatabaseRecAdj("eight pies", "やっつ", "八つ"),
          new DatabaseRecAdj("nine pies", "ここのつ", "九つ"),

          new DatabaseRecAdj("how many pies", "いくつ"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> anythingFormed() {
      return listOf(
          new DatabaseRecAdj("one apple", "いっこ", "一個"),
          new DatabaseRecAdj("two apples", "にこ", "二個"),
          new DatabaseRecAdj("three apples", "さんこ", "三個"),
          new DatabaseRecAdj("four apples", "よんこ", "四個"),
          new DatabaseRecAdj("five apples", "ごこ", "五個"),
          new DatabaseRecAdj("six apples", "ろっこ", "六個"),
          new DatabaseRecAdj("seven apples", "ななこ", "七個"),
          new DatabaseRecAdj("eight apples", "はちこ", "八個"),
          new DatabaseRecAdj("nine apples", "きゅうこ", "九個"),
          new DatabaseRecAdj("ten apples", "じゅっこ", "十個"),
          new DatabaseRecAdj("how many apples", "なんこ", "何個"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> person() {
      return listOf(
          new DatabaseRecAdj("one person", "ひとり", "一人"),
          new DatabaseRecAdj("two persons", "ふたり", "二人"),
          new DatabaseRecAdj("three persons", "さんにん", "三人"),
          new DatabaseRecAdj("four persons", "よにん", "四人"),
          new DatabaseRecAdj("eight persons", "はちにん", "八人"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> floor() {
      return listOf(
          new DatabaseRecAdj("floor", "かい", "階"),
          new DatabaseRecAdj("first floor", "いっかい", "一階"),
          new DatabaseRecAdj("second floor", "にかい", "二階"),
          new DatabaseRecAdj("which floor", "なんかい", "何階"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> machineFurnitureCake() {
      return listOf(
          new DatabaseRecAdj("two cars", "にだい", "二台"),
          new DatabaseRecAdj("how many tables", "なんだい", "何台"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> legwear() {
      return listOf(
          new DatabaseRecAdj("one pair of socks", "いっそく", "一足"),
          new DatabaseRecAdj("two pairs of socks", "にそく", "二足"),
          new DatabaseRecAdj("three pairs of socks", "さんそく", "三足"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> pair() {
      return listOf(
          new DatabaseRecAdj("two pairs of gloves", "ふたくみ", "二組"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> cylinder() {
      return listOf(
          new DatabaseRecAdj("one fork", "いっぽん", "一本"),
          new DatabaseRecAdj("two chopsticks", "にほん", "日本"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> flat() {
      return listOf(
          new DatabaseRecAdj("one plate", "いちまい", "一枚"),
          new DatabaseRecAdj("hundred pictures", "ひゃくまい", "百枚"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> bird() {
      return listOf(
          new DatabaseRecAdj("one bird", "いちわ", "一羽"),
          new DatabaseRecAdj("two birds", "にわ", "二羽"),
          new DatabaseRecAdj("three birds", "さんわ", "三羽"),
          new DatabaseRecAdj("four birds", "よんわ", "四羽"),
          new DatabaseRecAdj("seven birds", "ななわ", "七羽"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> book() {
      return listOf(
          new DatabaseRecAdj("one book", "いっさつ", "一冊"),
          new DatabaseRecAdj("six books", "ろくさつ", "六冊"),
          new DatabaseRecAdj("ten books", "じゅうさつ", "十冊"),

          new DatabaseRecAdj("", "")
      );
    }
    static List<DatabaseRecord> smallAnimal() {
      return listOf(
          new DatabaseRecAdj("one cat", "いっぴき", "一匹"),
          new DatabaseRecAdj("three dogs", "さんびき", "三匹"),
          new DatabaseRecAdj("five cats", "ごひき", "五匹"),

          new DatabaseRecAdj("", "")
      );
    }
  }

  static class DbPopHiraKata {
    static List<DatabaseRecord> hira() {
      return listOf(
          new DatabaseRecord("warrior", "ぶし", null),

          new DatabaseRecord("", "")
      );
    }
    static List<DatabaseRecord> kata() {
      return listOf(
          new DatabaseRecord("", "")
      );
    }
  }

  static class DbPopS1 {
    static List<DatabaseRecord> u01() {
      return listOf(
          new DatabaseRecord("sushi", "すし", "寿司"),
          new DatabaseRecord("please", "ください"),
          new DatabaseRecord("green tea", "おちゃ"),
          new DatabaseRecord("rice", "ごはん"),
          new DatabaseRecord("water", "みず", "水"),

          new DatabaseRecord("doctor", "いしゃ"),
          new DatabaseRecord("teacher", "せんせい"),
          new DatabaseRecord("student", "がくせい", "学生"),
          new DatabaseRecord("lawyer", "べんごし"),
          new DatabaseRecord(expl("person", "informal"), "ひと", "人"),
          new DatabaseRecordAdjectivePair("nice", "person", "やさしい", "ひと"),
          new DatabaseRecordAdjectivePair("cool", "かっこいい")
      );
    }
    static List<DatabaseRecord> u02() {
      return listOf(
          new DatabaseRecord("hello", "こんにちは"),
          new DatabaseRecord(expl("nice to meet you", "treat me well"), "どうぞよろしく"),
          new DatabaseRecord("good evening", "こんばんは"),
          new DatabaseRecord("see you tomorrow", "またあした"),
          new DatabaseRecord("bye", "じゃあね"),

          new DatabaseRecord("this", "この"),
          new DatabaseRecord("that", "その"),
          new DatabaseRecord("this one", "これ"),
          new DatabaseRecord("that one", "それ"),
          new DatabaseRecord("curry", "カレー"),
          new DatabaseRecord("ramen", "ラーメン"),
          new DatabaseRecord("pizza", "ピザ"),
          new DatabaseRecord("cake", "ケーキ"),
          new DatabaseRecordAdjectivePair("tasty", "おいしい"),
          new DatabaseRecord("yes", "はい"),
          new DatabaseRecord("no", "いいえ")
      );
    }
    static List<DatabaseRecord> u03() {
      return listOf(
          new DatabaseRecord("america", "アメリカ"),
          new DatabaseRecord("canada", "カナダ"),
          new DatabaseRecord("brazil", "ブラジル"),
          new DatabaseRecord("britain", "イギリス"),
          new DatabaseRecord("japan", "にほん", "日本"),
          new DatabaseRecordAdjectivePair("big", "おおきい", Kanji.of("大きい")),
          new DatabaseRecordAdjectivePair("small", "ちいさい", Kanji.of("小さい")),

          new DatabaseRecord("hotel", "ホテル"),
          new DatabaseRecord("department store", "デパート"),
          new DatabaseRecord("convenience store", "コンビニ"),
          new DatabaseRecord("bus stop", "バスてい"),
          new DatabaseRecord("train station", "えき", "駅"),
          new DatabaseRecord("university", "だいがく"),
          new DatabaseRecord("here", "ここ"),
          new DatabaseRecord("there", "そこ"),
          new DatabaseRecord("where", "どこ")
      );
    }
    static List<DatabaseRecord> u04() {
      return listOf(
          new DatabaseRecord("hat", "ぼうし", "帽子"),
          new DatabaseRecord("umbrella", "かさ", "傘"),
          new DatabaseRecord("shoe", "くつ", "靴"),
          new DatabaseRecord("coat", "コート"),
          new DatabaseRecordAdjectivePair("red", "あかい", Kanji.of("赤い")),
          new DatabaseRecordAdjectivePair("white", "しろい", Kanji.of("白い")),
          new DatabaseRecord("these ones", "これら"),
          new DatabaseRecord("those ones", "それら"),

          new DatabaseRecordAdjectivePair("cheerful", "あかるい", Kanji.of("明るい")),
          new DatabaseRecordAdjectivePair("funny", "おもしろい"),
          new DatabaseRecordAdjectivePair("cute", "かわいい")
      );
    }
    static List<DatabaseRecord> u05() {
      return listOf(
          new DatabaseRecord("one", "いち", "一"),
          new DatabaseRecord("two", "に", "二"),
          new DatabaseRecord("three", "さん", "三"),
          new DatabaseRecord("half-", "はん", "半"),
          new DatabaseRecord("excuse me", "すみません"),
          new DatabaseRecord("now", "いま", "今"),
          new DatabaseRecord(expl("about", "time"), "ごろ"),

          new DatabaseRecord("airport", "くうこう", "空港"),
          new DatabaseRecord("subway", "ちかてつ", "地下鉄"),
          new DatabaseRecord("passport", "パスポート"),
          new DatabaseRecord("smartphone", "スマホ"),
          new DatabaseRecord(expl("ticket", "train"), "きっぷ"),
          new DatabaseRecord("bag", "かばん", "鞄"),
          new DatabaseRecord("map", "ちず", "地図")
      );
    }
    static List<DatabaseRecord> u06() {
      return listOf(
          new DatabaseRecord(expl("I", "female"), "わたし", "私"),
          new DatabaseRecord("good morning", "おはようございます"),
          new DatabaseRecord(expl("welcome", "be welcomed"), "ようこそ"),
          new DatabaseRecord(expl("welcome", "to this shop"), "いらっしゃいませ"),
          new DatabaseRecord(expl("from", "place"), "しゅっしん"),
          new DatabaseRecord("city", "とし", "都市"),
          new DatabaseRecord("town", "まち"),
          new DatabaseRecord("very", "とても"),
          new DatabaseRecordAdjectivePair("lively", "にぎやか", "な", Kanji.of("賑やか")),
          new DatabaseRecordAdjectivePair("quiet", "しずか", "な", Kanji.of("静か")),
          new DatabaseRecordAdjectivePair("clean", "city", "きれい", "な", "とし"),
          new DatabaseRecord("to live", "すみます", "住みます"),

          new DatabaseRecord(expl("family", "informal"), "かぞく"),
          new DatabaseRecord(expl("mother", "own"), "はは", "母"),
          new DatabaseRecord(expl("father", "own"), "ちち", "父"),
          new DatabaseRecord("younger brother", "おとうと", "弟"),
          new DatabaseRecord("younger sister", "いもうと", "妹"),
          new DatabaseRecord("older brother", "あに", "兄"),
          new DatabaseRecord(expl("older sister", "own"), "あね", "姉"),
          new DatabaseRecord("son", "むすこ"),
          new DatabaseRecord("daughter", "むすめ"),
          new DatabaseRecord(expl("husband", "informal"), "おっと", "夫"),
          new DatabaseRecord(expl("wife", "informal"), "つま", "妻"),
          new DatabaseRecord("office worker", "かいしゃいん"),
          new DatabaseRecord("engineer", "エンジニア"),
          new DatabaseRecord("nurse", "かんごし"),
          new DatabaseRecord("four", "よん", "四"),
          new DatabaseRecord("five", "ご", "五"),
          new DatabaseRecord("six", "ろく", "六"),
          new DatabaseRecord("seven", "なな", "七"),
          new DatabaseRecord("years old", "さい", "歳"),
          new DatabaseRecordAdjectivePair("noisy", "うるさい"),
          new DatabaseRecordAdjectivePair("famous", "ゆうめい", "な", Kanji.of("有名")),
          new DatabaseRecordAdjectivePair("busy", "いそがしい", Kanji.of("忙しい")),
          new DatabaseRecordAdjectivePair("smart", "あたまがいい")
      );
    }
    static List<DatabaseRecord> u07() {
      return listOf(
          new DatabaseRecord("often", "よく"),
          new DatabaseRecord("sometimes", "ときどき", "時々"),
          new DatabaseRecord("news", "ニュース"),
          new DatabaseRecord("anime", "アニメ"),
          new DatabaseRecord("book", "ほん", "本"),
          new DatabaseRecord("magazine", "ざっし"),
          new DatabaseRecord("movie", "えいが", "映画"),
          new DatabaseRecord("music", "おんがく", "音楽"),
          new DatabaseRecord("manga", "まんが"),
          new DatabaseRecord("tv", "テレビ"),
          new DatabaseRecord("jazz", "ジャズ"),
          new DatabaseRecord("pop", "ポップス"),
          new DatabaseRecord("rock", "ロック"),
          new DatabaseRecord("baseball", "やきゅう"),
          new DatabaseRecord("soccer", "サッカー"),
          new DatabaseRecord("basketball", "バスケットボール"),
          new DatabaseRecord("volleyball", "バレ-ボ-ル"),
          new DatabaseRecord("to watch", "みます", "見ます"),
          new DatabaseRecord("to do", "します"),
          new DatabaseRecord("to read", "よみます", "読みます"),
          new DatabaseRecord("to listen", expl("ききます", "おんがく"), "聞きます"),

          new DatabaseRecord("to eat", "たべます", "食べる"),
          new DatabaseRecord("to drink", "のみます", "飲む"),
          new DatabaseRecord("vegetable", "やさい", "野菜"),
          new DatabaseRecord("boxed lunch", "べんとう", "弁当"),
          new DatabaseRecord("sandwich", "サンドイッチ"),
          new DatabaseRecord("bread", "パン"),
          new DatabaseRecord("coffee", "コーヒー"),
          new DatabaseRecord("juice", "ジュース"),
          new DatabaseRecord("which one", "どれ"),
          new DatabaseRecord("every", "まい", "舞"),
          new DatabaseRecord("morning", "あさ", "朝"),
          new DatabaseRecord("every morning", "まいあさ", "毎朝"),
          new DatabaseRecord("every day", "まいにち", "毎日"),
          new DatabaseRecord("breakfast", "あさごはん", "朝ご飯"),
          new DatabaseRecord("lunch", "ひるごはん", "昼ご飯"),
          new DatabaseRecord("dinner", "ばんごはん", "晩ご飯"),
          new DatabaseRecord("eight", "はち", "八"),
          new DatabaseRecord("nine", "きゅう", "九"),
          new DatabaseRecord("ten", "じゅう", "十")
      );
    }
    static List<DatabaseRecord> u08() {
      return listOf(
          new DatabaseRecord("that over there", "あの"),
          new DatabaseRecordAdjectivePair("wanting", "ほしい", Kanji.of("欲しい")),
          new DatabaseRecordAdjectivePair("new", "あたらしい", Kanji.of("新しい")),
          new DatabaseRecordAdjectivePair("old", "ふるい", Kanji.of("古い")),
          new DatabaseRecordAdjectivePair("hideous", "ダサい"),
          new DatabaseRecordAdjectivePair("fashionable", "おしゃれ", "な"),
          new DatabaseRecordAdjectivePair("purple", "むらさきいろ", "の", Kanji.of("紫色")),
          new DatabaseRecordAdjectivePair("blue", "あおい", Kanji.of("青い")),
          new DatabaseRecordAdjectivePair("black", "くろい", Kanji.of("黒い")),
          new DatabaseRecord("color", "いろ", "色"),
          new DatabaseRecord("clothes", "ふく", "服"),
          new DatabaseRecord("skirt", "スカート"),
          new DatabaseRecord("jacket", "ジャケット"),
          new DatabaseRecord("shirt", "シャツ"),
          new DatabaseRecord("dress", "ドレス"),
          new DatabaseRecord("necktie", "ネクタイ"),
          new DatabaseRecord("wallet", "さいふ", "財布"),
          new DatabaseRecord("a little bit", "ちょっと"),
          new DatabaseRecord("how much", "いくら"),
          new DatabaseRecord("hundred", "ひゃく", "百"),
          new DatabaseRecord("thousand", "せん", "千"),
          new DatabaseRecord("yen", "えん", "円"),
          new DatabaseRecord("thank you", "ありがとうございます"),
          new DatabaseRecord("store", "みせ", "店"),
          new DatabaseRecord("restaurant", "レストラン", null),

          new DatabaseRecordAdjectivePair("expensive", "shoe", "たかい", "", "くつ", "高い"),
          new DatabaseRecordAdjectivePair("cheap", "やすい"),
          new DatabaseRecord("how", "どう"),
          new DatabaseRecord("udon", "うどん"),
          new DatabaseRecord("meal set", "ていしょく"),
          new DatabaseRecord("miso soup", "みそしる"),
          new DatabaseRecord("soba", "そば"),
          new DatabaseRecord("iced coffee", "アイスコーヒー"),
          new DatabaseRecord("salad", "サラダ"),
          new DatabaseRecord("tempura", "てんぷら"),
          new DatabaseRecord("ice cream", "アイスクリーム"),
          new DatabaseRecord("black tea", "こうちゃ", "紅茶"),
          new DatabaseRecord("rice ball", "おにぎり"),
          new DatabaseRecord("a bit", "すこし", "少し")
      );
    }
  }

  static class DbPopS2 {
    public static List<DatabaseRecord> u01() {
      return listOf(
          new DatabaseRecord("to swim", "およぎます", "泳ぎます"),
          new DatabaseRecord("yoga", "ヨガ"),
          new DatabaseRecord(expl("game", "videogame"), "ゲーム"),
          new DatabaseRecord("study", "べんきょう", "勉強"),
          new DatabaseRecord("job", "しごと", "仕事"),
          new DatabaseRecord("party", "パーティー"),
          new DatabaseRecord("judo", "じゅうどう"),
          new DatabaseRecord("karate", "からて"),
          new DatabaseRecord("tennis", "テニス"),
          new DatabaseRecord("sports", "スポーツ"),
          new DatabaseRecord("saturday", "どようび", "土曜日"),
          new DatabaseRecord("sunday", "にちようび", "日曜日"),
          new DatabaseRecord("weekday", "へいじつ", "平日"),
          new DatabaseRecord("weekend", "しゅうまつ", "週末"),
          new DatabaseRecord("day before yesterday", "おととい", "一昨日"),
          new DatabaseRecord("yesterday", "きのう", "昨日"),
          new DatabaseRecord("every night", "まいばん", "毎晩"),
          new DatabaseRecord("friend", "ともだち", "友達"),
          new DatabaseRecord("to talk", "はなします", "話します"),
          new DatabaseRecord("to buy", "かいます", "買います"),
          new DatabaseRecord("to go out", "でかけます", "出かけます"),
          new DatabaseRecord("to hang out", "あそびます", "遊びます"),
          new DatabaseRecord("drama", "ドラマ"),
          new DatabaseRecord("video", "どうが"),

          new DatabaseRecord("um", "ええと"),
          new DatabaseRecord("oh", "あ"),
          new DatabaseRecord("okay then", "じゃあ"),
          new DatabaseRecord("cafe", "カフェ"),
          new DatabaseRecord("ticket gate", "かいさつ"),
          new DatabaseRecord("elevator", "エレベーター"),
          new DatabaseRecord("phone", "でんわ", "電話"),
          new DatabaseRecord("platform", "ホ-ム"),
          new DatabaseRecord("outlet", "コンセント"),
          new DatabaseRecord("trash can", "ゴミばこ"),
          new DatabaseRecord("restroom", "おてあらい"),
          new DatabaseRecord("exit", "でぐち"),
          new DatabaseRecord("transfer", "のりかえ"),
          new DatabaseRecord("taxi", "タクシ-"),
          new DatabaseRecord("stair", "かいだん"),
          new DatabaseRecord("storage locker", "コインロッカ-"),
          new DatabaseRecord("vending machine", "じはんき"),
          new DatabaseRecord("underground", "ちか"),
          new DatabaseRecord("over there", "あそこ"),
          new DatabaseRecord(expl("to have", "inanimate"), "あります"),
          new DatabaseRecordAdjectivePair("close", "ちかい", Kanji.of("近い")),
          new DatabaseRecordAdjectivePair("far", "とおい", Kanji.of("遠い")),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u02() {
      return listOf(
          new DatabaseRecord("next week", "らいしゅう", "来週"),
          new DatabaseRecord("every week", "まいしゅう", "毎週"),
          new DatabaseRecord("always", "いつも"),
          new DatabaseRecord(expl("to take", "a picture"), "とります", "撮ります"),
          new DatabaseRecord("photo", "しゃしん", "写真"),
          new DatabaseRecord("trip", "りょこう", "旅行"),
          new DatabaseRecord("newspaper", "しんぶん", "新聞"),
          new DatabaseRecord("radio", "ラジオ"),
          new DatabaseRecord("email", "メ-ル"),
          new DatabaseRecord("pasta", "パスタ"),
          new DatabaseRecord("to get up", "おきます", "起きます"),
          new DatabaseRecord("to run", "はしります", "走ります"),
          new DatabaseRecord("to sleep", "ねます", "寝ます"),
          new DatabaseRecord("tomorrow", "あした", "明日"),
          new DatabaseRecord("to make", "つくります", "作ります"),
          new DatabaseRecord(expl("to take", "a shower"), "あびます", "浴びます"),
          new DatabaseRecord("shower", "シャワ-"),
          new DatabaseRecord(expl("nice to meet you", "first time meeting"), "はじめまして"),
          new DatabaseRecord("to be named", "いいます", "言います"),
          new DatabaseRecord("girlfriend", "かのじょ", "彼女"),
          new DatabaseRecord("boyfriend", "かれし"),
          new DatabaseRecord("this way", "こちら"),
          new DatabaseRecord("hobby", "しゅみ"),
          new DatabaseRecord("horror", "ホラ-"),
          new DatabaseRecord("fantasy", "ファンタジー"),
          new DatabaseRecord("action", "アクション"),
          new DatabaseRecord("mystery", "ミステリ-"),
          new DatabaseRecord("comedy", "コメディ"),
          new DatabaseRecord("romance", "れんあい"),
          new DatabaseRecordAdjectivePair("liked", "すき", "な"),
          new DatabaseRecord("vietnam", "ベトナム"),
          new DatabaseRecord("china", "ちゅうごく"),
          new DatabaseRecord("korea", "かんこく", "韓国"),
          new DatabaseRecord("to be able", "できます"),
          new DatabaseRecord("what kind of", "どんな"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u03() {
      return listOf(
          new DatabaseRecord(expl("to move", "house"), "ひっこします"),
          new DatabaseRecord("apartment", "アパ-ト"),
          new DatabaseRecordAdjectivePair("spacious", "ひろい", "広い"),
          new DatabaseRecord(expl("kitchen", "modern"), "キッチン"),
          new DatabaseRecord("air conditioner", "エアコン"),
          new DatabaseRecord("still", "まだ"),
          new DatabaseRecord("washing machine", "せんたくき", "洗濯機"),
          new DatabaseRecord("vacuum cleaner", "そうじき", "掃除機"),
          new DatabaseRecord("bookshelf", "ほんだな", "本棚"),
          new DatabaseRecord("this week", "こんしゅう", "今週"),
          new DatabaseRecord("window", "まど", "窓"),
          new DatabaseRecord("bathroom", "トイレ"),
          new DatabaseRecord("cat", "ねこ", "猫"),
          new DatabaseRecord("dog", "いぬ", "犬"),
          new DatabaseRecord(expl("to have", "living thing"), "います"),
          new DatabaseRecord("train", "でんしゃ", "電車"),
          new DatabaseRecord(expl("to go", "away"), "いきます", "行きます"),
          new DatabaseRecord("next", "つぎ", "次"),
          new DatabaseRecord("about how long", "どのぐらい"),
          new DatabaseRecord(expl("to take", "time"), "かかります"),
          new DatabaseRecord(expl("about", "approximately"), "ぐらい"),
          new DatabaseRecord("house", "いえ", "家"),
          new DatabaseRecord("desk", "つくえ", "机"),
          new DatabaseRecord("microwave", "でんしレンジ"),
          new DatabaseRecord("futon", "ふとん", "布団"),
          new DatabaseRecordAdjectivePair("cramped", "せまい", "狭い"),
          new DatabaseRecordAdjectivePair("well lit", "kitchen", "あかるい", "キッチン"),
          new DatabaseRecord("fridge", "れいぞうこ", "冷蔵庫"),
          new DatabaseRecord("chair", "いす", "椅子"),
          new DatabaseRecord("perhaps", "たぶん"),
          new DatabaseRecord("living room", "リビング"),
          new DatabaseRecord("shelf", "だな", "棚"),
          new DatabaseRecord("bed", "ベッド"),
          new DatabaseRecord(expl("when", "what time"), "いつ"),
          new DatabaseRecordAdjectivePair("fast", "はやい", Kanji.of("速い")),
          new DatabaseRecord("to come", "きます", "来ます"),
          new DatabaseRecordAdjectivePair("long", "ながい", Kanji.of("長い")),
          new DatabaseRecord("bus", "バス"),
          new DatabaseRecord("final stop", "しゅうてん"),
          new DatabaseRecord("soon", "もうすぐ"),
          new DatabaseRecord("park", "こうえん", "公園"),
          new DatabaseRecord("coach", "コ-チ"),
          new DatabaseRecord("english", "えいご"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u04() {
      return listOf(
          new DatabaseRecord("truth", "ほんとう", "本当"),
          new DatabaseRecord("shrine", "じんじゃ"),
          new DatabaseRecord("postcard", "ポストカ-ド"),
          new DatabaseRecordAdjectivePair("lovely", "すてき", "な"),
          new DatabaseRecord("that one over there", "あれ"),
          new DatabaseRecord("all right", "だいじょうぶ"),
          new DatabaseRecord("condition", "ぐあい"),
          new DatabaseRecordAdjectivePair("bad", "わるい", Kanji.of("悪い")),
          new DatabaseRecord("ambulance", "きゅうきゅうしゃ"),
          new DatabaseRecord(expl("to need", "I need help please"), "おねがいします"),
          new DatabaseRecord("phone number", "でんわばんごう"),
          new DatabaseRecord("number", "ばんごう"),
          new DatabaseRecord("allergy", "アレルギ-"),
          new DatabaseRecordAdjectivePair("tall", "mountain", "たかい", "", "やま", "高い"),
          new DatabaseRecord("mountain", "やま", "山"),
          new DatabaseRecordAdjectivePair("pretty", "flower", "きれい", "な", "はな"),
          new DatabaseRecord("flower", "はな", "花"),
          new DatabaseRecord("building", "たてもの", "建物"),
          new DatabaseRecord("temple", "おてら"),
          new DatabaseRecord("dessert", "デザ-ト"),
          new DatabaseRecord("snack", "おかし"),
          new DatabaseRecord("souvenir", "おみやげ", "お土産"),
          new DatabaseRecord("shop", "や"),
          new DatabaseRecord("place", "ところ"),
          new DatabaseRecordAdjectivePair("dangerous", "あぶない", "な"),
          new DatabaseRecord("today", "きょう", "今日"),
          new DatabaseRecord(expl("parents", "formal"), "ごりょうしん"),
          new DatabaseRecord(expl("parents", "informal"), "りょうしん", "両親"),
          new DatabaseRecord("hospital", "びょういん", "病院"),
          new DatabaseRecord("police", "けいさつ"),
          new DatabaseRecord("to rest", "やすみます", "休みます"),
          new DatabaseRecord(expl("family", "formal"), "ごかぞく"),
          new DatabaseRecord("medicine", "くすり"),
          new DatabaseRecord("make sure", "ちゃんと"),
          new DatabaseRecord("to sit", "すわります", "座ります"),
          new DatabaseRecordAdjectivePair("hard", "たいへん", "な"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u05() {
      return listOf(
          new DatabaseRecord("weather", "てんき", "天気"),
          new DatabaseRecord("rain", "あめ", "雨"),
          new DatabaseRecord("sunny", "はれ", "晴れ"),
          new DatabaseRecord("sunny day", "はれのひ"),
          new DatabaseRecordAdjectivePair("nice", "weather", "いい", "てんき"),
          new DatabaseRecord("snow", "ゆき", "雪"),
          new DatabaseRecord("snowy day", "ゆきのひ", "雪の日"),
          new DatabaseRecordAdjectivePair("warm", "あたたかい"),
          new DatabaseRecord("every year", "まいとし", "毎年"),
          new DatabaseRecord("every month", "まいつき", "毎月"),
          new DatabaseRecord("siblings", expl("きょうだい", "兄弟姉妹"), "兄弟"),
          new DatabaseRecord("chinese", "ちゅうごくご", "中国語"),
          new DatabaseRecord("australia", "オーストラリア"),
          new DatabaseRecord("japanese", "にほんご", "日本語"),
          new DatabaseRecord(expl("mother", "other's"), "おかあ", "お母"),
          new DatabaseRecord(expl("father", "other's"), "おとう", "お父"),
          new DatabaseRecordAdjectivePair("good health", "げんき", "な"),
          new DatabaseRecord("welcome back", "おかえりなさい"),
          new DatabaseRecord("he", "かれ", "彼"),
          new DatabaseRecord(expl("older sister", "other's"), "おねえ"),
          new DatabaseRecord(expl("older brother", "other's"), "おにい", "お兄"),
          new DatabaseRecord("pool", "プ-ル"),
          new DatabaseRecord("firework", "はなび"),
          new DatabaseRecord("concert", "コンサ-ト"),
          new DatabaseRecord("break", "やすみ", "休み"),
          new DatabaseRecord("autumn", "あき", "秋"),
          new DatabaseRecordAdjectivePair("hot", "あつい", Kanji.of("熱い")),
          new DatabaseRecord("spring", "はる", "春"),
          new DatabaseRecord("winter", "ふゆ", "冬"),
          new DatabaseRecord("cocoa", "ココア"),
          new DatabaseRecord("day", "ひ", "日"),
          new DatabaseRecord("summer", "なつ", "夏"),
          new DatabaseRecord("cloud", "くも", "雲"),
          new DatabaseRecord("cloudy", "くもり", "曇り"),
          new DatabaseRecord("cloudy day", "くもりのひ"),
          new DatabaseRecordAdjectivePair("cold", "さむい", "寒い"),
          new DatabaseRecord("korean", "かんこくご", "韓国語"),
          new DatabaseRecord("taiwan", "たいわん"),
          new DatabaseRecord("seoul", "ソウル"),
          new DatabaseRecord(expl("child", "own"), "こども", "子供"),
          new DatabaseRecord(expl("child", "other's"), "おこ", "子"),
          new DatabaseRecord("malaysia", "マレ-シア"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u06() {
      return listOf(
          new DatabaseRecord("after", "あと"),
          new DatabaseRecord("chore", "かじ"),
          new DatabaseRecord("to help", "てつだいます"),
          new DatabaseRecord("homework", "しゅくだい"),
          new DatabaseRecord("rest day", "やすみのひ", "休みの日"),
          new DatabaseRecord("gardening", "ガ-デニング"),
          new DatabaseRecord("next month", "らいげつ", "来月"),
          new DatabaseRecord("france", "フランス"),
          new DatabaseRecord("foreign language", "ごが"),
          new DatabaseRecord("zoo", "どうぶつえん", "動物園"),
          new DatabaseRecord("stretch", "ストレッチ"),
          new DatabaseRecord(expl("bath", "formal"), "おふろ"),
          new DatabaseRecord(expl("bath", "informal"), "ふろ", "風呂"),
          new DatabaseRecord(expl("who", "informal"), "だれ", "誰"),
          new DatabaseRecordAdjectivePair("fun", "たのしい"),
          new DatabaseRecord("and then", "そして"),
          new DatabaseRecord("to return", "かえります", "帰ります"),
          new DatabaseRecord("home", "うち"),
          new DatabaseRecord(expl("to take", "a bath"), "はいります", "入ります"),
          new DatabaseRecord("laundry", "せんたく", "洗濯"),
          new DatabaseRecordAdjectivePair("various", "いろいろ", "な", Kanji.of("色々")),
          new DatabaseRecord("cleaning", "そうじ", "掃除"),
          new DatabaseRecord("cooking", "りょうり", "料理"),
          new DatabaseRecord("suitcase", "スーツケース"),
          new DatabaseRecord(expl("ticket", "sports games"), "チケット"),
          new DatabaseRecord("airplane", "ひこうき", "飛行機"),
          new DatabaseRecord("plaza", "ひろば"),
          new DatabaseRecord("lion", "ライオン"),
          new DatabaseRecord("meat", "にく", "肉"),
          new DatabaseRecord("art museum", "びじゅつかん"),
          new DatabaseRecord("to meet", "あいます", "会います"),
          new DatabaseRecord("painting", "え", "絵"),
          new DatabaseRecord("like", "すき", "好き"),
          new DatabaseRecord(expl("night", "not the rice one"), "よる", "夜"),
          new DatabaseRecord(expl("night", "the rice one"), "ばん", "夜"),
          new DatabaseRecord("week", "しゅう", "週"),
          new DatabaseRecord("month", "つき", "月"),
          new DatabaseRecord("year", "とし", "年"),
          new DatabaseRecord("hot spring", "おんせん"),
          new DatabaseRecord("school", "がっこう", "学校"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u07() {
      return listOf(
          new DatabaseRecord("friday", "きんようび", "金曜日"),
          new DatabaseRecord("castle", "しろ"),
          new DatabaseRecord("bullet train", "しんかんせん"),
          new DatabaseRecord("look forward to", "たのしみ"),
          new DatabaseRecord("monday", "げつようび", "月曜日"),
          new DatabaseRecord("tuesday", "かようび", "火曜日"),
          new DatabaseRecord(expl("love", "like a lot"), "だいすき", "大好き"),
          new DatabaseRecord("matcha", "まっちゃ"),
          new DatabaseRecord("cheesecake", "チ-ズケ-キ"),
          new DatabaseRecord("donut", "ド-ナツ"),
          new DatabaseRecord("chocolate", "チョコレ-ト"),
          new DatabaseRecord("pie", "パイ"),
          new DatabaseRecord("which", expl("どの", "物")),
          new DatabaseRecord("garden", "にわ", "庭"),
          new DatabaseRecordAdjectivePair("short", "みじかい"),
          new DatabaseRecord("sightseeing", "かんこう"),
          new DatabaseRecord(expl("to ride", "train"), "のります"),
          new DatabaseRecord("to wait", "まちます", "待ちます"),
          new DatabaseRecord("miso pork cutlet", "みそかつ"),
          new DatabaseRecordAdjectivePair("convenient", "べんり", "な"),
          new DatabaseRecord("lobby", "ロビ-"),
          new DatabaseRecord("strawberry", "いちご"),
          new DatabaseRecord("cookie", "クッキ-"),
          new DatabaseRecordAdjectivePair("green", "みどりいろ", "の", Kanji.of("緑色")),
          new DatabaseRecord("cupcake", "カップケ-キ"),
          new DatabaseRecordAdjectivePair("sweet", "あまい", Kanji.of("甘い")),
          new DatabaseRecord("stuff", "もの"),
          new DatabaseRecord("seat", "せき"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u08() {
      return listOf(
          new DatabaseRecord("soy sauce", "しょうゆ", "醬油"),
          new DatabaseRecord("fish", "さかな", "魚"),
          new DatabaseRecord("class", "じゅぎょう"),
          new DatabaseRecordAdjectivePair("interesting", "class", "おもしろい", "じゅぎょう"),
          new DatabaseRecord(expl("to end", "finishes"), "おわります"),
          new DatabaseRecord("to ask", expl("ききます", "しつもん"), "聞きます"),
          new DatabaseRecord("tofu", "とうふ"),
          new DatabaseRecord("egg", "たまご"),
          new DatabaseRecord("pork cutlet", "とんかつ"),
          new DatabaseRecord("thursday", "もくようび", "木曜日"),
          new DatabaseRecord("cola", "コ-ラ"),
          new DatabaseRecord("beef bowl", "ぎゅうどん"),
          new DatabaseRecord("pork", "ぶたにく"),
          new DatabaseRecord("pig", "ぶた"),
          new DatabaseRecord("beer", "ビ-ル"),
          new DatabaseRecord("salt", "しお", "塩"),
          new DatabaseRecord("more", "もっと"),
          new DatabaseRecord("to use", "つかいます", "使います"),
          new DatabaseRecord("raw", "なま"),
          new DatabaseRecord("supermarket", "ス-パ-"),
          new DatabaseRecord("this night", "こんばん", "今晩"),
          new DatabaseRecord("together", "いっしょ", "一緒"),
          new DatabaseRecord("but", "でも"),
          new DatabaseRecord("sauce", "ソ-ス"),
          new DatabaseRecord("free", "ひま"),
          new DatabaseRecordAdjectivePair("salty", "しょっぱい"),
          new DatabaseRecord("table", "テ-ブル"),
          new DatabaseRecord("what day", "なんようび", "何曜日"),
          new DatabaseRecord("wednesday", "すいようび", "水曜日"),
          new DatabaseRecord("test", "テスト"),
          new DatabaseRecord("lot of", "たくさん"),
          new DatabaseRecord("question", "しつもん"),
          new DatabaseRecord("early", "はやく"),
          new DatabaseRecord("classroom", "きょうしつ"),
          new DatabaseRecord("deadline", "しめきり"),
          new DatabaseRecord("project", "プロジェクト"),
          new DatabaseRecord("spain", "スペイン"),
          new DatabaseRecord("spanish", "スペインご"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u09() {
      return listOf(
          new DatabaseRecord(expl("to wear", "lower body"), "はきます"),
          new DatabaseRecord("to wash", "あらいます", "洗います"),
          new DatabaseRecord("exercise", "うんどう"),
          new DatabaseRecord("driving", "うんてん"),
          new DatabaseRecord("translation", "ほんやく"),
          new DatabaseRecord("pro", "プロ"),
          new DatabaseRecord("gym", "ジム"),
          new DatabaseRecord("player", "せんしゅ"),
          new DatabaseRecord("team", "チ-ム"),
          new DatabaseRecord("entrance", "いりぐち"),
          new DatabaseRecord("event", "イベント"),
          new DatabaseRecord("entrance fee", "にゅうじょうりょう"),
          new DatabaseRecord("roller coaster", "ジェットコースター"),
          new DatabaseRecord("mascot", "キャラクタ-"),
          new DatabaseRecord("face", "かお"),
          new DatabaseRecord("flavor", "あじ"),
          new DatabaseRecord("camera", "カメラ"),
          new DatabaseRecord("dictionary", "じしょ"),
          new DatabaseRecord("size", "サイズ"),
          new DatabaseRecord("show", "ショ-"),
          new DatabaseRecord("go-kart", "ゴ-カ-ト"),
          new DatabaseRecord("attraction", "アトラクション"),
          new DatabaseRecord("theme park", "ゆうえんち"),
          new DatabaseRecord("museum", "はくぶつかん"),
          new DatabaseRecord("a.m.", "ごぜん", "午前"),
          new DatabaseRecord("p.m.", "ごご", "午後"),
          new DatabaseRecordAdjectivePair("orange", "オレンジいろ", "の"),
          new DatabaseRecordAdjectivePair("pink", "ピンクいろ", "の"),
          new DatabaseRecordAdjectivePair("yellow", "きいろい", Kanji.of("黄色い")),
          new DatabaseRecord("library", "としょかん"),
          new DatabaseRecord("company", "かいしゃ", "会社"),
          new DatabaseRecordAdjectivePair("scary", "こわい"),
          new DatabaseRecord("photographer", "しゃしんか"),
          new DatabaseRecord("driver", "うんてんしゅ"),
          new DatabaseRecord("translator", "ほんやくか"),
          new DatabaseRecord("manager", "マネージャー"),
          new DatabaseRecord("coworker", "どうりょう"),
          new DatabaseRecord("mint chocolate chip", "チョコミント"),
          new DatabaseRecord("vanilla", "バニラ"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u10() {
      return listOf(
          new DatabaseRecord("documentary", "ドキュメンタリ-"),
          new DatabaseRecord("fiction", "フィクション"),
          new DatabaseRecord("non-fiction", "ノンフィクション"),
          new DatabaseRecord("anime music", "アニソン"),
          new DatabaseRecord(expl("really", "don't really read"), "あまり"),
          new DatabaseRecordAdjectivePair("difficult", "むずかしい"),
          new DatabaseRecordAdjectivePair("boring", "つまらない"),
          new DatabaseRecord("story", "はなし", "話"),
          new DatabaseRecord("gps", "ナビ"),

          new DatabaseRecord("section", "コ-ナ-"),
          new DatabaseRecord("sale", "セ-ル"),

          new DatabaseRecord("poster", "ポスタ-"),
          new DatabaseRecord("card game", "カ-ドゲ-ム"),
          new DatabaseRecord("puzzle", "パズル"),
          new DatabaseRecord("band", "バンド"),
          new DatabaseRecord("album", "アルバム"),

          new DatabaseRecord("actor", "はいゆう"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u11() {
      return listOf(
          new DatabaseRecord("french　fries", "フライドポテト"),
          new DatabaseRecord("front desk", "うけつけ"),
          new DatabaseRecord("printer", "プリンター"),
          new DatabaseRecord("fried rice", "チャ-ハン"),
          new DatabaseRecord("until", "まで"),
          new DatabaseRecord(expl("from", "time"), "から"),
          new DatabaseRecord("meeting", "ミーティング"),
          new DatabaseRecord("client", "クライアント"),
          new DatabaseRecord(expl("training", "job-related"), "トレーニング"),
          new DatabaseRecord("presentation", "プレゼン"),
          new DatabaseRecord("computer", "パソコン"),
          new DatabaseRecord("cafeteria", "しょくどう", "食堂"),
          new DatabaseRecord("last", "さいご"),
          new DatabaseRecord("karaoke", "カラオケ"),
          new DatabaseRecord("to sing", "うたいます", "歌います"),
          new DatabaseRecord("lunch break", "ひるやすみ", "ひる休み"),
          new DatabaseRecord("bar", "バ-"),

          new DatabaseRecord("badminton", "バドミントン"),
          new DatabaseRecord("piano", "ピアノ"),
          new DatabaseRecord("instrument", "がっき"),
          new DatabaseRecord("hiragana", "ひらがな"),
          new DatabaseRecord("tonight", "こんや"),
          new DatabaseRecord("kanji", "かんじ"),
          new DatabaseRecord(expl("game", "match"), "しあい"),
          new DatabaseRecord("to begin", "はじまります"),
          new DatabaseRecord("lesson", "レッスン"),
          new DatabaseRecord("practice", "れんしゅう", "練習"),
          new DatabaseRecord("post", "きじ"),
          new DatabaseRecord("fashion", "ファッション"),
          new DatabaseRecord("blog", "ブログ"),
          new DatabaseRecord("to dance", "おどります"),
          new DatabaseRecord("to write", "かきます", "書きます"),
          new DatabaseRecord("guitar", "ギター"),
          new DatabaseRecord(expl("to play", "an instrument"), "ひきます", "弾きます"),
          new DatabaseRecord("performance", "パフォーマンス"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u12() {
      return listOf(
          new DatabaseRecord("shopping", "かいもの", "買い物"),
          new DatabaseRecord("name", "なまえ", "名前"),
          new DatabaseRecord("let's eat", "いただきます"),
          new DatabaseRecord("thank you for the meal", "ごちそうさまでした"),
          new DatabaseRecord("milk", "ぎゅうにゅう", "牛乳"),
          new DatabaseRecord("apple", "りんご"),
          new DatabaseRecord("well then", "では"),
          new DatabaseRecord("exactly", "ちょうど"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u13() {
      return listOf(
          new DatabaseRecord("which school year", "なんねんせい", "何年生"),
          new DatabaseRecord(expl("kitchen", "older"), "だいどころ", "台所"),
          new DatabaseRecord("bedroom", "しんしつ", "寝室"),
          new DatabaseRecord("sofa", "ソファー"),
          new DatabaseRecord("room", "へや", "部屋"),
          new DatabaseRecord("midnight", "れいじ", "零時"),
          new DatabaseRecord("puppy", "こいぬ", "子犬"),
          new DatabaseRecord("kitten", "こねこ", "子猫"),
          new DatabaseRecord("bird", "とり", "鳥"),
          new DatabaseRecord("pet", "ペット"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u14() {
      return listOf(
          new DatabaseRecord("foreigner", "がいこくじん", "外国人"),
          new DatabaseRecord("to be called", "もうします", "申します"),
          new DatabaseRecord("high school", "こうこう", "高校"),
          new DatabaseRecord("middle school", "ちゅうがく", "中学"),
          new DatabaseRecord("elementary school", "しょうがく", "小学"),
          new DatabaseRecord("studying abroad", "りゅうがく", "留学"),
          new DatabaseRecord("foreign exchange student", "りゅうがくせい", "留学生"),
          new DatabaseRecord("difference", "ちがい", "違い"),
          new DatabaseRecord("that is not the case", "ちがいます", "違います"),
          new DatabaseRecord("that's right", "そうです"),
          new DatabaseRecord("zero", "ゼロ", "〇"),
          new DatabaseRecord("mood", "ちょうし", "調子"),
          new DatabaseRecord("how are you", "ちょうしはいかがですか", "調子はいかがですか"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u15() {
      return listOf(
          new DatabaseRecord("brothers", expl("きょうだい", "兄弟"), "兄弟"),
          new DatabaseRecord("sisters", "しまい", "姉妹"),
          new DatabaseRecord("steak", "ステーキ"),
          new DatabaseRecord("menu", "メニュー"),
          new DatabaseRecord("ten thousand", "まん", "万"),
          new DatabaseRecordAdjectivePair("disliked", "きらい", "な", Kanji.of("嫌い")),
          new DatabaseRecordAdjectivePair("bad tasting", "tea", "まずい", "おちゃ"),
          new DatabaseRecordAdjectivePair("spicy", "からい"),
          new DatabaseRecord("she", expl("かのじょ", "pronoun")),
          new DatabaseRecord(expl("I", "male"), "ぼく", "僕"),
          new DatabaseRecord("you", "あなた"),
          new DatabaseRecord("they", "かれら", "彼ら"),
          new DatabaseRecord("noon", "ひる", "昼"),
          new DatabaseRecord("day after tomorrow", "あさって", "明後日"),
          new DatabaseRecordAdjectivePair("freezing", "つめたい", Kanji.of("冷たい")),
          new DatabaseRecord("ballet", "バレイ"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u16() {
      return listOf(
          new DatabaseRecord("to work", "はたらきます", "働きます"),

          new DatabaseRecord("upper left", "ひだりうえ", "左上"),
          new DatabaseRecord("lower left", "ひだりした", "左下"),
          new DatabaseRecord("upper right", "みぎうえ", "右上"),
          new DatabaseRecord("lower right", "みぎした", "右下"),

          new DatabaseRecord("left", "ひだり", "左"),
          new DatabaseRecord("right", "みぎ", "右"),
          new DatabaseRecord("above", "うえ", "上"),
          new DatabaseRecord("below", "した", "下"),
          new DatabaseRecord("before", "まえ", "前"),
          new DatabaseRecord("behind", "うしろ", "後ろ"),
          new DatabaseRecord("beside", "よこ", "横"),
          new DatabaseRecord("between", "あいだ", "間"),
          new DatabaseRecord("next door", "となり", "隣"),
          new DatabaseRecord("inside", "なか", "中"),
          new DatabaseRecord("outside", "そと", "外"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u17() {
      return listOf(
          new DatabaseRecord("housework", "いえのそうじ", "家の掃除"),
          new DatabaseRecord("corner", "かたすみ", "片隅"),
          new DatabaseRecordAdjectivePair("low", "chair", "ひくい", "", "いす", "低い"),
          new DatabaseRecord("to turn on", "つけます"),
          new DatabaseRecord("immediately", "すぐ"),
          new DatabaseRecord(expl("to open", "window"), "あけます", "開けます"),
          new DatabaseRecord("mirror", "かがみ", "鏡"),
          new DatabaseRecordAdjectivePair("dirty", "きたない", "汚い"),
          new DatabaseRecord("electricity", "でんき", "電気"),
          new DatabaseRecord(expl("to close", "window"), "しめます", "閉めます"),
          new DatabaseRecord("from then on", "それから"),
          new DatabaseRecord("to stand　up", "たちます", "立ちます"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u18() {
      return listOf(
          new DatabaseRecord("song", "うた", "歌"),
          new DatabaseRecord("to learn", "ならいます", "習います"),
          new DatabaseRecord("stroll", "さんぽ", "散歩"),
          new DatabaseRecord("letter", "てがみ", "手紙"),
          new DatabaseRecord(expl("wife", "formal"), "おくさん", "奥さん"),
          new DatabaseRecord(expl("husband", "formal"), "ごしゅじん", "ご主人"),
          new DatabaseRecord("parent", "おや", "親"),
          new DatabaseRecord("relative", "しんせき", "親戚"),
          new DatabaseRecord("cousin", "いとこ"),
          new DatabaseRecord("uncle", "おじ"),
          new DatabaseRecord("aunt", "おば"),
          new DatabaseRecord("grandfather", "そふ", "祖父"),
          new DatabaseRecord("grandmother", "そぼ", "祖母"),
          new DatabaseRecord("grandchild", "まご", "孫"),
          new DatabaseRecord("granddaughter", "まごむすめ", "孫娘"),
          new DatabaseRecord("grandson", "まごむすこ", "孫息子"),
          new DatabaseRecord("to resemble", "にます", "似ます"),
          new DatabaseRecord("to draw", "かきます", "描きます"),
          new DatabaseRecord("being home", "ざいたく", "在宅"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u19() {
      return listOf(
          new DatabaseRecord("sweater", "セーター"),
          new DatabaseRecord(expl("to wear", "head"), "かぶります", "被ります"),
          new DatabaseRecord("car", "くるま", "車"),
          new DatabaseRecord("bicycle", "じてんしゃ", "自転車"),
          new DatabaseRecord("to walk", "あるきます", "歩きます"),
          new DatabaseRecordAdjectivePair("slow", "おそい", Kanji.of("遅い")),
          new DatabaseRecordAdjectivePair("brown", "ちゃいろ", "の", Kanji.of("茶色")),
          new DatabaseRecord(expl("to wear", "upper body"), "きます", "着ます"),
          new DatabaseRecord("to take off", "ぬぎます", "脱ぎます"),
          new DatabaseRecord("pants", "ズボン"),
          new DatabaseRecord("underwear", "パンツ"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u20() {
      return listOf(
          new DatabaseRecord("movie theater", "えいがかん", "映画館"),
          new DatabaseRecord("this morning", "けさ", "今朝"),
          new DatabaseRecord("to fall", "ふります", "降ります"),
          new DatabaseRecordAdjectivePair("strong", "つよい", Kanji.of("強い")),
          new DatabaseRecordAdjectivePair("weak", "よわい", Kanji.of("弱い")),
          new DatabaseRecord("wind", "かぜ", "風"),
          new DatabaseRecord("this month", "こんげつ", "今月"),
          new DatabaseRecord("week after next", "さらいしゅう", "再来週"),
          new DatabaseRecord("to teach", "おしえます", "教えます"),
          new DatabaseRecord(expl("to make a call", "with a phone"), "かけます"),
          new DatabaseRecord("last month", "せんげつ", "先月"),
          new DatabaseRecord("last night", "ゆうべ", "夕べ"),
          new DatabaseRecord("to blow", "ふきます", "吹きます"),
          new DatabaseRecord("evening", "ゆうがた", "夕方"),
          new DatabaseRecord("daytime", "ひるま", "昼間"),
          new DatabaseRecordAdjectivePair("dark", "weather", "くらい", "", "てんき", "暗い"),
          new DatabaseRecordAdjectivePair("bright", "weather", "あかるい", "", "てんき", "明るい"),
          new DatabaseRecord("sky", "そら", "空"),

          new DatabaseRecord("", "")
      );
    }
  }

  static class DbPopS3 {
    public static List<DatabaseRecord> u01() {
      return listOf(
          new DatabaseRecord("not sure", "さあ"),
          new DatabaseRecord(expl("not at all", "formal"), "まったく", "全く"),
          new DatabaseRecord(expl("not at all", "informal"), "ぜんぜん", "全然"),
          new DatabaseRecordAdjectivePair("many", "おおい", Kanji.of("多い")),
          new DatabaseRecord("beverage", "のみもの", "飲み物"),
          new DatabaseRecord("alcohol", "おさけ", "お酒"),
          new DatabaseRecord("fruit", "くだもの", "果物"),
          new DatabaseRecord("sugar", "さとう", "砂糖"),
          new DatabaseRecord("supper", "ゆうはん", "夕飯"),
          new DatabaseRecord("mint", "ミント"),
          new DatabaseRecord("all of them", "ぜんぶ", "全部"),
          new DatabaseRecord("food", "たべもの", "食べ物"),
          new DatabaseRecord("I'm fine", "けっこう", "結構"),
          new DatabaseRecord("drink", "のみもの", "飲み物"),
          new DatabaseRecordAdjectivePair("a little", "すくない", Kanji.of("少ない")),
          new DatabaseRecord("terribly", "たいへん", "大変"),

          new DatabaseRecord("which way", "どちら"),
          new DatabaseRecord("in what way", "どうやって"),
          new DatabaseRecord("bank", "ぎんこう", "銀行"),
          new DatabaseRecord("that way", "そちら"),
          new DatabaseRecord("over that way", "あちら"),
          new DatabaseRecord("path", "みち", "道"),
          new DatabaseRecord("street", "とおり", "通り"),
          new DatabaseRecord("to leave", "でます", "出ます"),
          new DatabaseRecord("to enter", "はいります", "入ります"),
          new DatabaseRecord("across", "むこう", "向こう"),
          new DatabaseRecord("north", "きた", "北"),
          new DatabaseRecord("north-east", "ほくとう", "北東"),
          new DatabaseRecord("north-west", "ほくせい", "北西"),
          new DatabaseRecord("south", "みなみ", "南"),
          new DatabaseRecord("south-east", "なんとう", "南東"),
          new DatabaseRecord("south-west", "なんせい", "南西"),
          new DatabaseRecord("east", "ひがし", "東"),
          new DatabaseRecord("west", "にし", "西"),
          new DatabaseRecord("to get off", "おります", "降ります"),
          new DatabaseRecord("proximity", "そば"),
          new DatabaseRecord("to pass by", "とおります", "通ります"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u02() {
      return listOf(
          new DatabaseRecord("this year", "ことし", "今年"),
          new DatabaseRecord("next year", "らいねん", "来年"),
          new DatabaseRecord("last year", "きょねん", "去年"),
          new DatabaseRecord("year after next", "さらいねん", "再来年"),
          new DatabaseRecord("year before last", "おととし", "一昨年"),
          new DatabaseRecord("congratulations", "おめでとう"),
          new DatabaseRecord("birthday", "たんじょうび", "誕生日"),
          new DatabaseRecord("birth", "たんじょう", "誕生"),
          new DatabaseRecord("plate", "さら", "皿"),
          new DatabaseRecord("cup", "カップ"),
          new DatabaseRecord("chopstick", "はし", "箸"),
          new DatabaseRecord("to be hungry", "おなかがすきました", "お腹がすきました"),
          new DatabaseRecord("to become empty", "すきます", "空きます"),
          new DatabaseRecord("stomach", "おなか", "お腹"),
          new DatabaseRecord("knife", "ナイフ"),
          new DatabaseRecord("spoon", "スプーン"),
          new DatabaseRecord("bowl", "ボウル"),
          new DatabaseRecord("fork", "フォーク"),
          new DatabaseRecord("rice bowl", "ちゃわん", "茶碗"),
          new DatabaseRecord("half", "はんぶん", "半分"),
          new DatabaseRecord("glass", "グラス"),
          new DatabaseRecord("favourite food", "こうぶつ", "好物"),
          new DatabaseRecord("wine", "ワイン"),
          new DatabaseRecord("lemon", "レモン"),
          new DatabaseRecord("grape", "ぶどう"),
          new DatabaseRecord("soup", "スープ"),
          new DatabaseRecordAdjectivePair("sour", "すっぱい"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u03() {
      return listOf(
          new DatabaseRecord("money", "おかね", "お金"),
          new DatabaseRecord("clock", "とけい", "時計"),
          new DatabaseRecord("watch", "うでどけい", "腕時計"),
          new DatabaseRecord("luggage", "にもつ", "荷物"),
          new DatabaseRecord("to receive", "もらいます"),
          new DatabaseRecord("other", "ほか"),
          new DatabaseRecord("different", "ちがう", "違う"),
          new DatabaseRecord("same", "おなじ", "同じ"),
          new DatabaseRecord("this kind of", "こんな"),
          new DatabaseRecordAdjectivePair("heavy", "おもい", Kanji.of("重い")),
          new DatabaseRecordAdjectivePair("light", "かるい", Kanji.of("軽い")),
          new DatabaseRecordAdjectivePair("sturdy", "じょうぶ", Kanji.of("丈夫")),
          new DatabaseRecord("to put in", "いれます", "入れます"),
          new DatabaseRecord("to take out", "だします", "出します"),
          new DatabaseRecord("to give", "あげます"),
          new DatabaseRecord("for someone", "にとって"),
          new DatabaseRecord("bakery", "パンや", "パン屋"),
          new DatabaseRecord("cashier", "かいけい", "会計"),
          new DatabaseRecord("how about", "いかが"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u04() {
      return listOf(
          new DatabaseRecord("female", "おんな", "女"),
          new DatabaseRecord("magnificent", "りっぱ", "立派"),
          new DatabaseRecord(expl("who", "formal"), "どなた"),
          new DatabaseRecord(expl("person", "formal"), "かた", "方"),
          new DatabaseRecord("adult female", "おんなのひと", "女の人"),
          new DatabaseRecord("adult male", "おとこのひと", "男の人"),
          new DatabaseRecord("child female", "おんなのこ", "女の子"),
          new DatabaseRecord("child male", "おとこのこ", "男の子"),
          new DatabaseRecord(expl("everyone", "formal"), "みなさん", "皆さん"),
          new DatabaseRecord(expl("everyone", "informal"), "みんな", "皆"),
          new DatabaseRecord("to summon", "よびます", "呼びます"),
          new DatabaseRecord("crowd", "おおぜい", "大勢"),
          new DatabaseRecord("marriage", "けっこん", "結婚"),
          new DatabaseRecord("divorce", "りこん", "離婚"),
          new DatabaseRecord("young", "わかい", "若い"),
          new DatabaseRecord("adult", "おとな", "大人"),
          new DatabaseRecord("baby", "あかちゃん", "赤ちゃん"),
          new DatabaseRecord("to die", "しにます", "死にます"),
          new DatabaseRecord("to be born", "うまれます", "生まれます"),
          new DatabaseRecord("to pass away", "なくなります", "亡くなります"),
          new DatabaseRecord("single", "どくしん", "独身"),
          new DatabaseRecord("to break up", "わかれます", "別れます"),
          new DatabaseRecord("date", "デート"),
          new DatabaseRecord("lover", "こいびと", "恋人"),
          new DatabaseRecord("intention", "つもり"),
          new DatabaseRecord("cool", "すずしい", "涼しい"),
          new DatabaseRecord(expl("to hold up", "umbrella"), "?????", "????"),
          new DatabaseRecord("however", "しかし"),
          new DatabaseRecord("handle it with care", "たいせつにしてね"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u05() {
      return listOf(
          new DatabaseRecordAdjectivePair("tight", "きつい"),
          new DatabaseRecordAdjectivePair("loose", "ゆるい"),
          new DatabaseRecord("socks", "くつした", "靴下"),
          new DatabaseRecordAdjectivePair("gray", "はいいろ", "の", Kanji.of("灰色")),
          new DatabaseRecord("ash", "はい", "灰"),
          new DatabaseRecord("glove", "てぶくろ", "手袋"),
          new DatabaseRecord("straight", "まっすぐ"),
          new DatabaseRecord("to advance", "すすみます", "進みます"),
          new DatabaseRecord("corner", "かど", "角"),
          new DatabaseRecord("which　way", "どっち"),
          new DatabaseRecord("that way over there", "あっち"),
          new DatabaseRecord("that way", "そっち"),
          new DatabaseRecord("this way", "こっち"),
          new DatabaseRecord("to turn", "まがります", "曲がります"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u06() {
      return listOf(
          new DatabaseRecord("to turn off", "けします", "消します"),
          new DatabaseRecord("early morning", "あさはやく", "朝早く"),
          new DatabaseRecord("quickly", "はやく", "早く"),
          new DatabaseRecord("to work for", "つとめます", "勤めます"),
          new DatabaseRecord("door", "ドア"),
          new DatabaseRecord("cell phone", "けいたいでんわ", "携帯電話"),
          new DatabaseRecord("to possess", "もちます", "持ちます"),
          new DatabaseRecord("slowly", "ゆっくり"),

          new DatabaseRecord("to bloom", "さきます", "咲きます"),
          new DatabaseRecord("to fly", "とびます", "飛びます"),
          new DatabaseRecord("deer", "しか", "鹿"),
          new DatabaseRecord("fox", "キツネ"),
          new DatabaseRecord("monkey", "サル"),
          new DatabaseRecord("pigeon", "ハト"),
          new DatabaseRecord("horse", "うま", "馬"),
          new DatabaseRecord("cow", "うし", "牛"),
          new DatabaseRecord("bear", "くま", "熊"),
          new DatabaseRecord("animal", "どうぶつ", "動物"),
          new DatabaseRecord("voice", "こえ", "声"),
          new DatabaseRecord(expl("to make a sound", "animals"), "鳴きます", "なきます"),
          new DatabaseRecord("pond", "いけ", "池"),
          new DatabaseRecord("river", "かわ", "川"),
          new DatabaseRecord("sea", "うみ", "海"),
          new DatabaseRecord("to climb", "のぼります", "登ります"),
          new DatabaseRecord("tree", "き", "木"),

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u07() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u08() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u09() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u10() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u11() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u12() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u13() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u14() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u15() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u16() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u17() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u18() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u19() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u20() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u21() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u22() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u23() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u24() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u25() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u26() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u27() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u28() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u29() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u30() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u31() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u32() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u33() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u34() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u35() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u36() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u37() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u38() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u39() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
    public static List<DatabaseRecord> u40() {
      return listOf(

          new DatabaseRecord("", "")
      );
    }
  }
}