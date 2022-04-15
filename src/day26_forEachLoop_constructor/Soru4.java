package day26_forEachLoop_constructor;

import java.util.Arrays;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

         /* Giriş olarak kullanıcıdan bir String almak ve bu dizede oluşan maximumCounts karakterini bulmak için bir Java programı yazın.
 (Büyük/küçük harf duyarlılığını yoksay)
 Kullanıcıdan aldiginiz bir dize icinde en cok tekrar eden karakteridiran kodu create ediniz.
 giriş : Java öğrenmek kolaydır
 output: maximumCounts oluşan karakter: a
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin gir");

        String arr[]=scan.nextLine().split("");//kullanıcıdan gelen metin "" e göre parcalanmalı
        System.out.println(Arrays.toString(arr));

        String enCokTekrarEden="";
        int sayac=1;
        int maxSayac=0;

        for (int i = 0; i <arr.length ; i++) {//karsılastırılan karakter kontrolu-->h
            for (int j = i+1; j <arr.length ; j++) {//karsılastıran karakter kontrolu-->a,y,a,t...
                if (arr[i].equalsIgnoreCase(arr[j])){
                    sayac++;

                }
            }
            if (sayac>maxSayac){
                maxSayac=sayac;
                enCokTekrarEden=arr[i];
            }else if (sayac==maxSayac){
                enCokTekrarEden+=", "+arr[i];
            }
            sayac=1;

        }

        System.out.println(" en cok tekrar eden " + enCokTekrarEden  + maxSayac + " tane");



    }
}
