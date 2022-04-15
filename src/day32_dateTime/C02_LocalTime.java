package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);//22:09:55.158875800

        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz
        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);//22:14:20.068292500

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        // ileri veya geriye gidebiliriz
        System.out.println("işlem " + (nano2-nano1) + " nano saniyede bitti");


        System.out.println(tm.plusMinutes(1000));//14:59:53.277628400

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz

    }
}
