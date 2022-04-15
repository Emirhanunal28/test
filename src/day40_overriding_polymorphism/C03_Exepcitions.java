package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exepcitions {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int kontrol=0;
        while (kontrol!=2){
            System.out.println("Bolmek istediginiz sayiyi yaziniz");
            int sayi1= scan.nextInt();


            System.out.println("Kaca Bolmek istediginiz sayiyi yaziniz");
            int sayi2= scan.nextInt();

            try {
                System.out.println("sonuc = " + sayi1/sayi2);
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.println("Girdiginiz sayilarda sorun var");
            }

            System.out.println("devam etmek icin 1\nbitirmek icin 2 ye basınız");
            kontrol= scan.nextInt();
        }


        /*
        Sayi2 0 oldugunda sayi1/0 tanimsiz olucagından Java bu durumla
        karsılasınca exception verir
        Javanin yazdigi mesajda exception ne tur bir sorun oldugu
        neden kaynaklandigi
        ve hangi satirda olustugu yazar
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:17)

          bunu cozmek icin sayi2'yi if ile kontrol ederiz

         */

        /*
        if (sayi2==0){
            System.out.println("sayi / 0 tanimsizdir");
        }else {
            System.out.println("sonuc = " + sayi1/sayi2);
        }


         */

    }
}