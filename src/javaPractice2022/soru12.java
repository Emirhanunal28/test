package javaPractice2022;

import java.util.Scanner;

public class soru12 {
    static int toplam;
    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments

        Scanner scan=new Scanner(System.in);
        int sayi=1;
        while (sayi>0){
            System.out.println("isteiğin kadar sayi gir:"+"\nSayilarin toplami icin 0 a basınız");
            sayi= scan.nextInt();
            sayiToplama(sayi);
        }

    }
    private static void sayiToplama(int...sayi){
         toplam=0;
        for (int each:sayi) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
}
