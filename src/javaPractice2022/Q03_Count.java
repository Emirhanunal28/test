package javaPractice2022;

import java.util.Scanner;

public class Q03_Count {
     /*
        Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.
       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
*/
     public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          System.out.println("sayiyi giriniz");
          int sayi = Math.abs(scan.nextInt());

          int i = 1;
          int sayac = 0;

          while (i <= sayi) {
               if (sayi % i == 0) {
                    sayac++;
                    System.out.print(i + " ");

               }
               i++;

          }
          System.out.println();
          System.out.println(" sayinin pozitif bolenlerinin sayisi:"+ sayac);
          System.out.println(" sayinin negatif bolenlerinin sayisi:"+ sayac);
          System.out.println(" sayinin toplam bolenlerinin sayisi:"+ 2*sayac);
     }
}
