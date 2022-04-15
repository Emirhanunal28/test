package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocaleDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-03-31T22:35:28.269061400

        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        //2025-06-11T03:42:29.937224200



    }
}
