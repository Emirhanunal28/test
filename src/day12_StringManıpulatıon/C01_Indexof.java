package day12_StringManıpulatıon;

import day10_Switch_StringManipulatıon.SwitchDeney;

import java.util.Scanner;

public class C01_Indexof {
    public static void main(String[] args) {

       // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
          //      - Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.


        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanım=cumle.indexOf(kelime);//-1 veya index
        int ikinciKullanım=cumle.indexOf(kelime,ilkKullanım+1);


        if (ilkKullanım==(-1)){
            System.out.println("Girilen kelime cumlede kullanılmamış");
        }else if (ikinciKullanım==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }






























    }
}
