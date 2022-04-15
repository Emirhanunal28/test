package javaPractice2022;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class soru11 {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    // zoneID Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdtLocal =ZonedDateTime.now();

        DateTimeFormatter format= DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("zdt="+ zdt.format(format));//zdt=04.04.2022 16:43

        System.out.println("zdtLocal="+ zdtLocal.format(format));//zdtLocal=04.04.2022 23:43
    }
}
