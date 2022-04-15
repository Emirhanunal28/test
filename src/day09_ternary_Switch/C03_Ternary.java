package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {


        int sayı=220;

        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun


        String sonuc=sayı>100? " Sayı 3 basamaklı veya daha fazla" : "Sayı negatif veya 3 basamaklı değil";

        // Ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun bir variable'a  atama yapabiliriz


        System.out.println("girdiğiniz sayı analizi" + (sonuc));


















    }
}
