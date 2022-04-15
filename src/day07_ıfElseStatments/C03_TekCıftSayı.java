package day07_ıfElseStatments;

import java.util.Scanner;

public class C03_TekCıftSayı {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girdiğniz sayı çift sayıdır");
        }

        if (sayi%2!=0){
            System.out.println("Girdiğiniz sayı tek sayıdır");
        }

        // normalde bir tamsayi ya tektir veya cifttir, ucuncu bir durum yoktur
        // o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        // if else ile tek statement'da yapmak daha guzel olur
        // ======== if else ile cozum=======

        if (sayi%2==0){
            System.out.println("Girdiğiniz sayı çift sayıdır");
        } else {
            System.out.println("Girdiğiniz sayı tek sayıdır");
        }

    }
}
