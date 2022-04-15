package javaPractice2022;

import java.util.Scanner;

public class WhileLoop1 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi= scan.nextInt();

        basamakToplamaDoWhile(sayi);
        basamakToplama(sayi);
        System.out.println(basamakToplama(sayi));
    }

    public static int basamakToplamaDoWhile(int sayi) {
        int toplam=0;
        do {
            toplam+=sayi%10;
            sayi=sayi/10;

        }while (sayi>0);
        System.out.println("Do While ile toplam = "+ toplam);

        return toplam;
    }






    public static int basamakToplama(int sayi) {

        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        return toplam;
    }




 }
