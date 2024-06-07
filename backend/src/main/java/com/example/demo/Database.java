package com.example.demo;

import com.example.demo.DatabaseTematicPopulator.DbPopCount;
import com.example.demo.DatabaseTematicPopulator.DbPopHiraKata;
import com.example.demo.DatabaseTematicPopulator.DbPopS1;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@Component
public class Database {
//  private List<DatabaseRecord> hiras = DbPopHiraKata.hira();
//  private List<DatabaseRecord> katas = DbPopHiraKata.kata();
//
//  private List<DatabaseRecord> countTime = DbPopCount.time();
//  private List<DatabaseRecord> countMinute = DbPopCount.minute();
  private List<DatabaseRecord> countHour = DbPopCount.hour();
//  private List<DatabaseRecord> countCalendarDay = DbPopCount.calendarDay();
//  private List<DatabaseRecord> countMonth = DbPopCount.month();
//  private List<DatabaseRecord> countTimeLength = DbPopCount.timeLength();
//  private List<DatabaseRecord> countAny = DbPopCount.anything();
//  private List<DatabaseRecord> countAnyFormed = DbPopCount.anythingFormed();
//  private List<DatabaseRecord> countPerson = DbPopCount.person();
//  private List<DatabaseRecord> countPolitePerson = DbPopCount.politePerson();
//  private List<DatabaseRecord> countFloor = DbPopCount.floor();
//  private List<DatabaseRecord> countAge = DbPopCount.age();
//  private List<DatabaseRecord> countMachine = DbPopCount.machineFurnitureCake();
//  private List<DatabaseRecord> countLegwear = DbPopCount.legwear();
//  private List<DatabaseRecord> countPair = DbPopCount.pair();
//  private List<DatabaseRecord> countCylinder = DbPopCount.cylinder();
//  private List<DatabaseRecord> countFlat = DbPopCount.flat();
//  private List<DatabaseRecord> countBird = DbPopCount.bird();
//  private List<DatabaseRecord> countBook = DbPopCount.book();
//  private List<DatabaseRecord> countSmallAnimal = DbPopCount.smallAnimal();

  private List<DatabaseRecord> sec1un01 = DbPopS1.u01();
  private List<DatabaseRecord> sec1un02 = DbPopS1.u02();
  private List<DatabaseRecord> sec1un03 = DbPopS1.u03();
  private List<DatabaseRecord> sec1un04 = DbPopS1.u04();
  private List<DatabaseRecord> sec1un05 = DbPopS1.u05();
  private List<DatabaseRecord> sec1un06 = DbPopS1.u06();
  private List<DatabaseRecord> sec1un07 = DbPopS1.u07();
  private List<DatabaseRecord> sec1un08 = DbPopS1.u08();
  private List<DatabaseRecord> sec1un09 = DbPopS1.u09();
//  private List<DatabaseRecord> sec1un10 = DbPopS1.u10();
//
//  private List<DatabaseRecord> sec2un01 = DbPopS2.u01();
//  private List<DatabaseRecord> sec2un02 = DbPopS2.u02();
//  private List<DatabaseRecord> sec2un03 = DbPopS2.u03();
//  private List<DatabaseRecord> sec2un04 = DbPopS2.u04();
//  private List<DatabaseRecord> sec2un05 = DbPopS2.u05();
//  private List<DatabaseRecord> sec2un06 = DbPopS2.u06();
//  private List<DatabaseRecord> sec2un07 = DbPopS2.u07();
//  private List<DatabaseRecord> sec2un08 = DbPopS2.u08();
//  private List<DatabaseRecord> sec2un09 = DbPopS2.u09();
//  private List<DatabaseRecord> sec2un10 = DbPopS2.u10();
//  private List<DatabaseRecord> sec2un11 = DbPopS2.u11();
//  private List<DatabaseRecord> sec2un12 = DbPopS2.u12();
//  private List<DatabaseRecord> sec2un13 = DbPopS2.u13();
//  private List<DatabaseRecord> sec2un14 = DbPopS2.u14();
//  private List<DatabaseRecord> sec2un15 = DbPopS2.u15();
//  private List<DatabaseRecord> sec2un16 = DbPopS2.u16();
//  private List<DatabaseRecord> sec2un17 = DbPopS2.u17();
//  private List<DatabaseRecord> sec2un18 = DbPopS2.u18();
//  private List<DatabaseRecord> sec2un19 = DbPopS2.u19();
//  private List<DatabaseRecord> sec2un20 = DbPopS2.u20();
//  private List<DatabaseRecord> sec2unΔ = DbPopS2.udelta();
//
//  private List<DatabaseRecord> sec3un01 = DbPopS3.u01();
//  private List<DatabaseRecord> sec3un02 = DbPopS3.u02();
//  private List<DatabaseRecord> sec3un03 = DbPopS3.u03();
//  private List<DatabaseRecord> sec3un04 = DbPopS3.u04();
//  private List<DatabaseRecord> sec3un05 = DbPopS3.u05();
//  private List<DatabaseRecord> sec3un06 = DbPopS3.u06();
//  private List<DatabaseRecord> sec3un07 = DbPopS3.u07();
//  private List<DatabaseRecord> sec3un08 = DbPopS3.u08();
//  private List<DatabaseRecord> sec3un09 = DbPopS3.u09();
//  private List<DatabaseRecord> sec3un10 = DbPopS3.u10();
//  private List<DatabaseRecord> sec3un11 = DbPopS3.u11();
//  private List<DatabaseRecord> sec3un12 = DbPopS3.u12();
//  private List<DatabaseRecord> sec3un13 = DbPopS3.u13();
//  private List<DatabaseRecord> sec3un14 = DbPopS3.u14();
//  private List<DatabaseRecord> sec3un15 = DbPopS3.u15();
//  private List<DatabaseRecord> sec3un16 = DbPopS3.u16();
//  private List<DatabaseRecord> sec3un17 = DbPopS3.u17();
//  private List<DatabaseRecord> sec3un18 = DbPopS3.u18();
//  private List<DatabaseRecord> sec3un19 = DbPopS3.u19();
//  private List<DatabaseRecord> sec3un20 = DbPopS3.u20();
//  private List<DatabaseRecord> sec3un21 = DbPopS3.u21();
//  private List<DatabaseRecord> sec3un22 = DbPopS3.u22();
//  private List<DatabaseRecord> sec3un23 = DbPopS3.u23();
//  private List<DatabaseRecord> sec3un24 = DbPopS3.u24();
//  private List<DatabaseRecord> sec3un25 = DbPopS3.u25();
//  private List<DatabaseRecord> sec3un26 = DbPopS3.u26();
//  private List<DatabaseRecord> sec3un27 = DbPopS3.u27();
//  private List<DatabaseRecord> sec3un28 = DbPopS3.u28();
//  private List<DatabaseRecord> sec3un29 = DbPopS3.u29();
//  private List<DatabaseRecord> sec3un30 = DbPopS3.u30();
//  private List<DatabaseRecord> sec3un31 = DbPopS3.u31();
//  private List<DatabaseRecord> sec3un32 = DbPopS3.u32();
//  private List<DatabaseRecord> sec3un33 = DbPopS3.u33();
//  private List<DatabaseRecord> sec3un34 = DbPopS3.u34();
//  private List<DatabaseRecord> sec3un35 = DbPopS3.u35();
//  private List<DatabaseRecord> sec3un36 = DbPopS3.u36();
//  private List<DatabaseRecord> sec3un37 = DbPopS3.u37();
//  private List<DatabaseRecord> sec3un38 = DbPopS3.u38();
//  private List<DatabaseRecord> sec3un39 = DbPopS3.u39();
//  private List<DatabaseRecord> sec3un40 = DbPopS3.u40();

  public Iterator<DatabaseRecord> iterator(String cat) {
    List<DatabaseRecord> overall = new ArrayList<>();

    ReflectionUtils.doWithFields(
        Database.class,
        field -> {
          if (cat != null && !cat.equals(field.getName())) {
            return;
          }
          field.setAccessible(true);
          List<DatabaseRecord> list = (List<DatabaseRecord>) field.get(this);
          if (list == null) {
            return;
          }
//          overall.addAll(list);
          list.forEach(
              dr -> {
                dr.setCategory(field.getName());
                overall.add(dr);
              });
        });

    return overall.iterator();
  }
}
