package day07_ıfElseStatments;

import java.util.Scanner;

public class C04_HaftaıcıHaftaSonu {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmı= scan.next().toLowerCase();// kullanici nasil yazarsa yazsin
        // biz kucuk harfe ceviriyorz

        // String ifadelerde == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verebilir

        if (gunIsmı.equals("cumartesi") || gunIsmı.equals("pazar")){
            System.out.println("Girdiğiniz gün haftasonu");
        } else {
            System.out.println("Girdiğiniz gün hafta içi");
        }





















    }
}
