package javaPractice2022;

import java.util.Scanner;

public class ForLoop4_ {
     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!
 */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.println("kelime giriniz");
         String kelime= scan.next();

         String sesliHarfler="aeıuoiüö";

         for (int i = 0; i <sesliHarfler.length() ; i++) {
             if (sesliHarfler.contains(kelime.substring(0,1))){
                 System.out.println("girdiğiniz harf sesli harf");
                 break;
             }else {
                 System.out.println("sessiz harf");
                 break;
             }
         }










     }
}
