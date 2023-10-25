package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
class DatabasePopulator {
  @Bean
  Database database() {
    return new Database()
        .setAnimal(animals())
        .setNumber(numbers())
        .setFood(foods())
        .setJob(jobs())
        .setEmotion(emotions())
        .setPoliteness(politeness())
        .setCountry(country())
        .setPlace(place())
        .setClothing(clothing())
        .setColor(color())
        .setFamily(family())
        .setPointer(pointer())
        .setThingy(thingy())
        .setAction(action())
        .setActionable(actionable())
        .setDaytime(daytime())
        .setSport(sport())
        .setGenre(genre())
        .setName(name())
        .setEverythingElse(random());
  }

  private List<DatabaseRecord> name() {
    return List.of(
        new DatabaseRecord("ken", "けん", null),
        new DatabaseRecord("hana", "はな", null),
        new DatabaseRecord("naomi", "なおみ", null),
        new DatabaseRecord("daniel", "", null),
        new DatabaseRecord("andrew", "アンドリュ", null),
        new DatabaseRecord("erika", "エリカ", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> random() {
    return List.of(
        new DatabaseRecord("no", "いいえ", null),
        new DatabaseRecord("yes", "はい", null),
        new DatabaseRecord("um", "ええと", null),
        new DatabaseRecord("oh", "あ", null),
        new DatabaseRecord("okay then", "じゃあ", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> action() {
    return List.of(
        new DatabaseRecord("watch", "みます", "見る"),
        new DatabaseRecord("do", "します", "為る"),
        new DatabaseRecord("read", "よみます", "読む"),
        new DatabaseRecord("listen", "ききます", "聞く"),
        new DatabaseRecord("eat", "たべます", "食べる"),
        new DatabaseRecord("drink", "のみます", "飲む"),
        new DatabaseRecord("swim", "およぎます", null),
        new DatabaseRecord("hang out", "あそびます", null),
        new DatabaseRecord("buy", "かいます", "買います"),
        new DatabaseRecord("go out", "でかけます", null),
        new DatabaseRecord("talk", "はなします", "話します"),
        new DatabaseRecord("have", "inanimate", "あります", null),
        new DatabaseRecord("there is", "living thing", "います", null),
        new DatabaseRecord("get up", "おきます", null),
        new DatabaseRecord("run", "はしります", null),
        new DatabaseRecord("named", "いいます", null),
        new DatabaseRecord("take", "a picture", "とります", null),
        new DatabaseRecord("make", "つくります", null),
        new DatabaseRecord("sleep", "ねます", null),
        new DatabaseRecord("take", "a shower", "あびます", null),
        new DatabaseRecord("live", "すんでいます", null),
        new DatabaseRecord("move", "house", "ひっこします", null),
        new DatabaseRecord("go", "somewhere", "いきます", "行きます"),
        new DatabaseRecord("take", "time", "かかります", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> actionable() {
    return List.of(
        new DatabaseRecord("game", "ゲーム", null),
        new DatabaseRecord("work", "しごと", "仕事"),
        new DatabaseRecord("study", "べんきょう", "勉強"),
        new DatabaseRecord("party", "パーティー", null),
        new DatabaseRecord("shower", "シャワ-", null),
        new DatabaseRecord("like", "すき", "好き"),
        new DatabaseRecord("picture", "しゃしん", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> sport() {
    return List.of(
        new DatabaseRecord("yoga", "ヨガ", null),
        new DatabaseRecord("soccer", "サッカー", null),
        new DatabaseRecord("basketball", "バスケットボール", null),
        new DatabaseRecord("baseball", "やきゅう", null),
        new DatabaseRecord("sports", "スポーツ", null),
        new DatabaseRecord("tennis", "テニス", null),
        new DatabaseRecord("judo", "じゅうどう", null),
        new DatabaseRecord("hobby", "しゅみ", null),
        new DatabaseRecord("volleyball", "バレ-ボ-ル", null),
        new DatabaseRecord("karate", "からて", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> genre() {
    return List.of(
        new DatabaseRecord("action", "アクション", null),
        new DatabaseRecord("horror", "ホラ-", null),
        new DatabaseRecord("drama", "ドラマ", null),
        new DatabaseRecord("romance", "れんあい", null),
        new DatabaseRecord("comedy", "コメディ", null),
        new DatabaseRecord("fantasy", "ファンタジー", null),
        new DatabaseRecord("mystery", "ミステリ-", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> thingy() {
    return List.of(
        new DatabaseRecord("anime", "アニメ", null),
        new DatabaseRecord("book", "ほん", "本"),
        new DatabaseRecord("tv", "テレビ", null),
        new DatabaseRecord("movie", "えいが", null),
        new DatabaseRecord("music", "おんがく", null),
        new DatabaseRecord("magazine", "ざっし", null),
        new DatabaseRecord("manga", "まんが", null),
        new DatabaseRecord("passport", "パスポート", null),
        new DatabaseRecord("smartphone", "スマホ", null),
        new DatabaseRecord("ticket", "きっぷ", null),
        new DatabaseRecord("ticket gate", "かいさつ", null),
        new DatabaseRecord("floor", "かい", null),
        new DatabaseRecord("first floor", "いっかい", null),
        new DatabaseRecord("second floor", "にかい", null),
        new DatabaseRecord("elevator", "エレベーター", null),
        new DatabaseRecord("underground", "ちか", null),
        new DatabaseRecord("friends", "ともだち", null),
        new DatabaseRecord("video", "どうが", null),
        new DatabaseRecord("storage locker", "コインロッカ-", null),
        new DatabaseRecord("vending machine", "じはんき", null),
        new DatabaseRecord("exit", "でぐち", null),
        new DatabaseRecord("cafe", "カフェ", null),
        new DatabaseRecord("stair", "かいだん", null),
        new DatabaseRecord("phone", "でんわ", null),
        new DatabaseRecord("outlet", "コンセント", null),
        new DatabaseRecord("taxi", "タクシ-", null),
        new DatabaseRecord("transfer", "のりかえ", null),
        new DatabaseRecord("trash can", "ゴミばこ", null),
        new DatabaseRecord("platform", "ホ-ム", null),
        new DatabaseRecord("newspaper", "しんぶん", "新聞"),
        new DatabaseRecord("radio", "ラジオ", null),
        new DatabaseRecord("hobby", "しゅみ", null),
        new DatabaseRecord("travel", "りょこう", null),
        new DatabaseRecord("email", "メ-ル", null),
        new DatabaseRecord("apartment", "アパ-ト", null),
        new DatabaseRecord("kitchen", "キッチン", null),
        new DatabaseRecord("air conditioner", "アイコン", null),
        new DatabaseRecord("washing machine", "せんたくき", null),
        new DatabaseRecord("bookshelf", "ほんだな", null),
        new DatabaseRecord("window", "まど", null),
        new DatabaseRecord("bathroom", "といれ", null),
        new DatabaseRecord("house", "いえ", null),
        new DatabaseRecord("living room", "リビング", null),
        new DatabaseRecord("bed", "ベット", null),
        new DatabaseRecord("vacuum cleaner", "そうじき", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> pointer() {
    return List.of(
        new DatabaseRecord("this one", "これ", null),
        new DatabaseRecord("that one", "それ", null),
        new DatabaseRecord("which one", "どれ", null),
        new DatabaseRecord("this", "この", null),
        new DatabaseRecord("that", "その", null),
        new DatabaseRecord("here", "ここ", null),
        new DatabaseRecord("there", "そこ", null),
        new DatabaseRecord("where", "どこ", null),
        new DatabaseRecord("how", "どう", null),
        new DatabaseRecord("these ones", "これら", null),
        new DatabaseRecord("those ones", "それら", null),
        new DatabaseRecord("that over there", "あの", null),
        new DatabaseRecord("that one over there", "あれ", null),
        new DatabaseRecord("over there", "あそこ", null),
        new DatabaseRecord("close", "ちかい", null),
        new DatabaseRecord("far", "とおい", null),
        new DatabaseRecord("what kind of", "どんな", null),
        new DatabaseRecord("this way", "こちら", null),
        new DatabaseRecord("next", "つぎ", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> family() {
    return List.of(
        new DatabaseRecord("younger sister", "いもうと", null),
        new DatabaseRecord("older sister", "あね", null),
        new DatabaseRecord("younger brother", "おとうと", null),
        new DatabaseRecord("older brother", "あに", null),
        new DatabaseRecord("mother", "はは", "母"),
        new DatabaseRecord("father", "ちち", "父"),
        new DatabaseRecord("son", "むすこ", null),
        new DatabaseRecord("daughter", "むすめ", null),
        new DatabaseRecord("wife", "つま", null),
        new DatabaseRecord("husband", "おっと", null),
        new DatabaseRecord("family", "かぞく", null),
        new DatabaseRecord("girlfriend", "かのじょ", "彼女"),
        new DatabaseRecord("boyfriend", "かれし", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> daytime() {
    return List.of(
        new DatabaseRecord("saturday", "どようび", "土曜日"),
        new DatabaseRecord("weekday", "へいじつ", "平日"),
        new DatabaseRecord("yesterday", "きのう", "昨日"),
        new DatabaseRecord("day before yesterday", "おととい", null),
        new DatabaseRecord("weekend", "しゅうまつ", null),
        new DatabaseRecord("hour", "じ", null),
        new DatabaseRecord("half", "はん", "半"),
        new DatabaseRecord("about", "time", "ごろ", null),
        new DatabaseRecord("now", "いま", "今"),
        new DatabaseRecord("years old", "さい", null),
        new DatabaseRecord("what time", "なんじ", null),
        new DatabaseRecord("often", "よく", null),
        new DatabaseRecord("sometimes", "ときどき", null),
        new DatabaseRecord("every", "まい", null),
        new DatabaseRecord("every day", "まいにち", null),
        new DatabaseRecord("every morning", "まいあさ", null),
        new DatabaseRecord("morning", "あさ", null),
        new DatabaseRecord("every night", "まいばん", null),
        new DatabaseRecord("every week", "まいしゅう", null),
        new DatabaseRecord("next week", "らいしゅう", null),
        new DatabaseRecord("always", "いつも", null),
        new DatabaseRecord("tomorrow", "あした", null),
        new DatabaseRecord("still", "まだ", null),
        new DatabaseRecord("this week", "こんしゅう", null),
        new DatabaseRecord("minute", "ぶん", "分"),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> color() {
    return List.of(
        new DatabaseRecord("red", "あかい", null),
        new DatabaseRecord("white", "しろい", null),
        new DatabaseRecord("purple", "むらさき", "紫"),
        new DatabaseRecord("color", "いろ", "色"),
        new DatabaseRecord("blue", "あおい", null),
        new DatabaseRecord("black", "くろい", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> clothing() {
    return List.of(
        new DatabaseRecord("coat", "コート", null),
        new DatabaseRecord("hat", "ぼうし", null),
        new DatabaseRecord("umbrella", "かさ", null),
        new DatabaseRecord("shoe", "くつ", null),
        new DatabaseRecord("map", "ちず", null),
        new DatabaseRecord("bag", "かばん", null),
        new DatabaseRecord("skirt", "スカート", null),
        new DatabaseRecord("shirt", "シャツ", null),
        new DatabaseRecord("wallet", "さいふ", null),
        new DatabaseRecord("clothes", "ふく", null),
        new DatabaseRecord("dress", "ドレス", null),
        new DatabaseRecord("necktie", "ネクタイ", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> place() {
    return List.of(
        new DatabaseRecord("hotel", "ホテル", null),
        new DatabaseRecord("bus stop", "バスてい", null),
        new DatabaseRecord("train station", "えき", null),
        new DatabaseRecord("convenience store", "コンビニ", null),
        new DatabaseRecord("department store", "デパート", null),
        new DatabaseRecord("subway", "ちかてつ", null),
        new DatabaseRecord("airport", "くうこう", null),
        new DatabaseRecord("town", "まち", null),
        new DatabaseRecord("city", "とし", null),
        new DatabaseRecord("university", "だいがく", null),
        new DatabaseRecord("store", "みせ", null),
        new DatabaseRecord("restaurant", "レストラン", null),
        new DatabaseRecord("restroom", "おてあらい", null),
        new DatabaseRecord("train", "でんしゃ", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> country() {
    return List.of(
        new DatabaseRecord("america", "アメリカ", null),
        new DatabaseRecord("canada", "カナダ", null),
        new DatabaseRecord("brazil", "ブラジル", null),
        new DatabaseRecord("britain", "イギリス", null),
        new DatabaseRecord("japan", "にほん", "日本"),
        new DatabaseRecord("from", "しゅっしん", null),
        new DatabaseRecord("vietnam", "ベトナム", null),
        new DatabaseRecord("china", "ちゅうごく", null),
        new DatabaseRecord("korea", "かんこく", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> politeness() {
    return List.of(
        new DatabaseRecord("please", "ください", null),
        new DatabaseRecord("hello", "こんにちは", null),
        new DatabaseRecord("good evening", "こんばんは", null),
        new DatabaseRecord("see you tomorrow", "またあした", null),
        new DatabaseRecord("bye", "じゃね", null),
        new DatabaseRecord("excuse me", "すみません", null),
        new DatabaseRecord("good morning", "おはようございます", null),
        new DatabaseRecord("welcome", "ようこそ", null),
        new DatabaseRecord("nice to meet you", "first time meeting", "はじめまして", null),
        new DatabaseRecord(
            "nice to meet you", "treat me well", List.of("どうぞよろしく", "よろしくおねがいします"), null),
        new DatabaseRecord("how much", "いくら", null),
        new DatabaseRecord("thank you", "ありがとうございます", null),
        new DatabaseRecord("really", "ほんとうですか", null),
        new DatabaseRecord("about how long", "どのぐらい", null),
        new DatabaseRecord("about", "approximately", "ぐらい", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> emotions() {
    return List.of(
        new DatabaseRecord("nice", "a nice person", "やさしい", null),
        new DatabaseRecord("cool", "かっこいい", null),
        new DatabaseRecord("famous", "ゆうめい", null),
        new DatabaseRecord("quiet", "しずか", null),
        new DatabaseRecord("clean", "きれい", null),
        new DatabaseRecord("tasty", "おいしい", null),
        new DatabaseRecord("cheerful", "person", "あかるい", null),
        new DatabaseRecord("funny", "おもしろい", null),
        new DatabaseRecord("lively", "にぎやか", null),
        new DatabaseRecord("big", "おおきい", "大きい"),
        new DatabaseRecord("small", "ちいさい", "小さい"),
        new DatabaseRecord("cute", "かわいい", null),
        new DatabaseRecord("busy", "いそがしい", null),
        new DatabaseRecord("very", "とても", null),
        new DatabaseRecord("smart", "あたまがいい", null),
        new DatabaseRecord("fashionable", "おしゃれ", null),
        new DatabaseRecord("new", "あたらしい", "新しい"),
        new DatabaseRecord("wanting", "ほしい", null),
        new DatabaseRecord("old", "ふるい", "古い"),
        new DatabaseRecord("hideous", "ダサイ", null),
        new DatabaseRecord("lovely", "すてき", null),
        new DatabaseRecord("cheap", "やすい", null),
        new DatabaseRecord("expensive", "たかい", null),
        new DatabaseRecord("nice", "a nice thing", "いい", null),
        new DatabaseRecord("a bit", "すこし", null),
        new DatabaseRecord("spacious", "ひろい", null),
        new DatabaseRecord("cramped", "せまい", null),
        new DatabaseRecord("well lit", "place", "あかるい", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> jobs() {
    return List.of(
        new DatabaseRecord("doctor", "いしゃ", null),
        new DatabaseRecord("teacher", "せんせい", null),
        new DatabaseRecord("lawyer", "べんごし", null),
        new DatabaseRecord("student", "がくせい", null),
        new DatabaseRecord("person", "ひと", "人"),
        new DatabaseRecord("nurse", "かんごし", null),
        new DatabaseRecord("engineer", "エンジニア", null),
        new DatabaseRecord("office worker", "かいしゃいん", null),
        new DatabaseRecord("warrior", "ぶし", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> foods() {
    return List.of(
        new DatabaseRecord("sushi", "すし", null),
        new DatabaseRecord("green tea", "おちゃ", null),
        new DatabaseRecord("rice", "ごはん", null),
        new DatabaseRecord("water", "みず", "水"),
        new DatabaseRecord("curry", "カレー", null),
        new DatabaseRecord("ramen", "ラーメン", null),
        new DatabaseRecord("pizza", "ピザ", null),
        new DatabaseRecord("cake", "ケーキ", null),
        new DatabaseRecord("coffee", "コーヒー", null),
        new DatabaseRecord("vegetable", "やさい", null),
        new DatabaseRecord("bread", "パン", null),
        new DatabaseRecord("sandwich", "サンドイッチ", null),
        new DatabaseRecord("breakfast", "あさごはん", null),
        new DatabaseRecord("lunch", "ひるごはん", null),
        new DatabaseRecord("boxed lunch", "べんとう", null),
        new DatabaseRecord("dinner", "ばんごはん", null),
        new DatabaseRecord("udon", "うどん", null),
        new DatabaseRecord("miso soup", "みそしる", null),
        new DatabaseRecord("soba", "そば", null),
        new DatabaseRecord("iced coffee", "アイスコーヒー", null),
        new DatabaseRecord("black tea", "こうちゃ", null),
        new DatabaseRecord("ice cream", "アイスクリーム", null),
        new DatabaseRecord("salad", "サラダ", null),
        new DatabaseRecord("rice ball", "おにぎり", null),
        new DatabaseRecord("meal set", "ていしょく", null),
        new DatabaseRecord("tempura", "てんぷら", null),
        new DatabaseRecord("pasta", "パスタ", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> numbers() {
    return List.of(
        new DatabaseRecord("one", "いち", "一"),
        new DatabaseRecord("two", "に", "二"),
        new DatabaseRecord("three", "さん", "三"),
        new DatabaseRecord("four", "よん", "四"),
        new DatabaseRecord("five", "ご", "五"),
        new DatabaseRecord("six", "ろく", "六"),
        new DatabaseRecord("seven", List.of("しち", "なな"), "七"),
        new DatabaseRecord("eight", "はち", "八"),
        new DatabaseRecord("nine", "きゅう", "九"),
        new DatabaseRecord("ten", "じゅう", "十"),
        new DatabaseRecord("hundred", "ひゃく", "百"),
        new DatabaseRecord("yen", "えん", null),
        new DatabaseRecord("thousand", "せん", "千"),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }

  private List<DatabaseRecord> animals() {
    return List.of(
        new DatabaseRecord("dog", "いぬ", "犬"),
        new DatabaseRecord("cat", "ねこ", "猫"),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null),
        new DatabaseRecord("", "", null));
  }
}
