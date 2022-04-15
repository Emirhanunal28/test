package javaPractice2022;

import java.util.Scanner;

public class DoWhileLoop_1 {
     /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         String okunan="";

         do {
             System.out.println("harf giriniz");
             okunan= scan.next();
             System.out.println("program calisiyor");
         }while (!okunan.equalsIgnoreCase("x"));
         System.out.println("program bitti");
         scan.close();









     }
}
