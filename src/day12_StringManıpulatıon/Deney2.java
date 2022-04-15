package day12_StringManıpulatıon;

import java.util.Scanner;

public class Deney2 {
    public static void main(String[] args) {

        String cumle="Büs büyük gözlerin yere değiyor dizlerin";
        String kelime1="büyük";
        String kelime2="küçük";


        if (cumle.contains(kelime1)){
            System.out.println(cumle.toUpperCase());
        }else if (cumle.contains(kelime2)){
            System.out.println(cumle.toLowerCase());
        }else {
            System.out.println("cümle küçük yada büyük kelimesi içermiyor");
        }

        String isim="EbubekirsıddıkbakiZ";
        String harf1="a";
        String harf2="Z";

        if (isim.contains(harf1 + harf2)){
            System.out.println("Girdiğiniz isim a ve z harfi içeriyor");
        }else if (isim.contains(harf2)){
            System.out.println("Girdiğiniz isim Z harfi içeriyor");
        }else if (isim.contains(harf1)){
            System.out.println("girdiğiniz isim  a harfi içeriyor");
        }else {
            System.out.println("Girdiğiniz isim olumsuz");
        }




















    }
}
