package day12_StringManıpulatıon;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //kullanıcıdan isim soyısım bılgısı alıp
        //butun harfleri * yapalım

       // Scanner scan=new Scanner(System.in);
        //System.out.println("Lutfen ısmınızı ve soyısmınızı yazın  ");
        //String isimSoyısım= scan.nextLine();

        //System.out.println(isimSoyısım.replaceAll("\\S"," "));



        String str=" Java ogrenmek123 Cok guzel@ ";

        str=str.replace("123","");
        str=str.replace("@","");
        System.out.println(str);


















    }
}
