package day08_IfElseIfStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yazınız " +
                "\nKadın için K \nErkek için E harfini giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasınızı giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet== 'K'){

            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiğiniz yas değerini kontrol ediniz");
            }else if (yas<60){
                System.out.println(" Emekli olamazsın \nDaha "+ (60-yas) + " yıl calışman gerekir");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else if (cinsiyet=='E'){

            if (yas<0 || yas>120){
                System.out.println(" lutfen girdiğiniz yas değerini konrtol ediniz");
            }else if (yas<65){
                System.out.println(" Emekli olamazsın \nDaha " +  (65-yas) + " yıl çalışman gerekir ");
            }else {
                System.out.println(" Emekli olabilirsin ");
            }
        }






















    }
}
