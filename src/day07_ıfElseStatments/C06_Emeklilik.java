package day07_ıfElseStatments;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsın köpek git çalış");
            System.out.println(65-yas + " sene daha çalış");
        }

        // if else statement'larda iki durumdan sadece ve sadece biri calisir
        // ikisinin birden calisma ihtimali ====> YOK
        // ikisinin de calismama ihtimali =====> YOK











    }
}
