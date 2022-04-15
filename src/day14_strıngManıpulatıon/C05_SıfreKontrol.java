package day14_strıngManıpulatıon;

public class C05_SıfreKontrol {
    public static void main(String[] args) {


        //Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmali

        String sifre="Asdf12345a";

        boolean ilkHarf= false;

        if (sifre.charAt(0)>= 'A' && sifre.charAt(0)<='Z'){
            ilkHarf=true;
        }else {
            System.out.println("sifrenizin ilk harfi buyuk olmalı");
        }



        boolean sonHarf=false;

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmalı");
        }


        boolean bosluk=false;

        if (!sifre.contains(" ")){
            bosluk=true;
        }else {
            System.out.println("Sifre bosluk içermemeli");
        }


        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;
        }else {
            System.out.println("sifre en az 8 karakter olmalı");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("Sifreniz basarılı bir şekilde kaydedildi");
        }















    }
}
