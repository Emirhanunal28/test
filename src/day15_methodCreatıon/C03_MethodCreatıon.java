package day15_methodCreatıon;

import java.util.Scanner;

import static day15_methodCreatıon.C04.ucHarfiTersineCevir;

public class C03_MethodCreatıon {
    public static void main(String[] args) {

        //kullanıcıdan bir kelıme isteyın
        //eger kelıme 3 harften kısa ıse "kelıme cok kısa" yazdırın
        //eger kelıme 3 ,4 veya 5 harflı ıse harf sayısını ve
        //kelımenın tersten yazılışını yazdırın
        //eger 5 harften uzunsa "kelıme cok uzun" yazdırın"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bır kelıme gırınız");
        String kelıme = scan.next();
        int harfSayısı = kelıme.length();

        if (harfSayısı < 3) {
            System.out.println("kelıme cok kısa");
        } else if (harfSayısı == 3) {
          ucHarfiTersineCevir(kelıme);
        } else if (harfSayısı == 4) {
            dortHarfiTersineCevir(kelıme);
        } else if (harfSayısı == 5) {
            besHarfiTersineCevir(kelıme);
        } else {
            System.out.println("kelıme cok uzun");
        }


    }


    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime= kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 5" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
    // 1- method olusturmak icin method'un adini yazariz
    // 2- method'a giderken goturmem gerek variable varsa, bunu method'a eklemeliyim
    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }



}

