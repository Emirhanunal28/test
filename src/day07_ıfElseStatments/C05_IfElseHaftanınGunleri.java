package day07_ıfElseStatments;

import java.util.Scanner;

public class C05_IfElseHaftanınGunleri {
    public static void main(String[] args) {

//Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismi gir");
        String gunIsmı= scan.next().toUpperCase();

        if (gunIsmı.equals("PAZAR") || gunIsmı.equals("CUMARTESİ")){
            System.out.println("girdiğiniz gün hafta sonu");
        } else {
            System.out.println("girdiğiniz gun hafta içi");
        }




















    }
}
