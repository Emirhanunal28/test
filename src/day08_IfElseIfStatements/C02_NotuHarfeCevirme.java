package day08_IfElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double notSayı= scan.nextDouble();

        if (notSayı<0 ||notSayı>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        }
        else if (notSayı<50){
            System.out.println("Notunuz D");
        } else if (notSayı<60){
            System.out.println("Notunuz C");
        } else if (notSayı<80){
            System.out.println("Notunuz B");
        } else {
            System.out.println("Notunuz A");
        }




















    }
}
