package day18_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        //// bilgisayara 1 ile 100 arasinda bir sayi tutturun
        //    // kullanicidan bu sayiyi tahmin etmesini isteyin
        //    // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        //    // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();

        int rand=rnd.nextInt(100);
        int num=0;
        int tahmin=0;
        while(num!=rand) {
            System.out.println("1-100 arasindaki tahmininizi giriniz");
            num=scan.nextInt();
            //System.out.println(rand); kopya çekmek isteyenler için
            tahmin++;
            if(num<rand) {
                System.out.println("sayiyi büyüt");
                //continue;
            }else if(num>rand) {
                System.out.println("sayiyi kücült");
                //continue;
            }else{
                System.out.println("aferin köfte ");
            }
            System.out.println("tahmin=" + tahmin);
        }








    }
}
