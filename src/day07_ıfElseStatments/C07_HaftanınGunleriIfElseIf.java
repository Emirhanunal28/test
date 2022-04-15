package day07_ıfElseStatments;

import java.util.Scanner;

public class C07_HaftanınGunleriIfElseIf {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // eger kullanici gun ismini yanlis girerse "Yanlis giris" yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ısmı gırınız");
        String gunIsmı= scan.next().toLowerCase();

        // hatali girisleri de yazdirmak icin
        // olasiliklari 3'e cikardim
        // hafta sonu - hafta ici - yanlis giris

        if (gunIsmı.equals("cumartesi") || gunIsmı.equals("pazar")){

            System.out.println("Girdiğiniz gün haftasonu");

        } else if (gunIsmı.equals("pazartesi") || gunIsmı.equals("salı") || gunIsmı.equals("çarşamba") ||
        gunIsmı.equals("perşembe") || gunIsmı.equals("cuma")){
            System.out.println("Girdiğiniz gün haftaiçi");
        } else {
            System.out.println("Lutfen geçerli gun giriniz");
        }






















    }
}
