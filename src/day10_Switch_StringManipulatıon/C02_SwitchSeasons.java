package day10_Switch_StringManipulatıon;

import java.util.Scanner;

public class C02_SwitchSeasons {
    public static void main(String[] args) {

        // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
        // switch olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kaçıncı ay olduğunu giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){

            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Hatalı");
        }



























    }
}
