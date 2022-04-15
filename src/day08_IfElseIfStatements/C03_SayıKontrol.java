package day08_IfElseIfStatements;

import java.util.Scanner;

public class C03_SayıKontrol {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse
        // “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        // sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayı gırınız");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,

        if (sayi1>0 && sayi2>0){
            System.out.println("Girdiğiniz iki sayıda pozitif olduğundan " +
                    "toplamları= " + (sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println(" Girdiğiniz iki sayıda negatif olduğundan çarpımları= " + (sayi1*sayi2) );
        }else if (sayi1*sayi2<0){
            System.out.println(" Farklı sayılarla işlem yapamazsın");
        }else {
            System.out.println(" sıfır çarpmaya göre yutan elemandır");
        }

















    }
}
