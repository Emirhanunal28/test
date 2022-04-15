package day09_ternary_Switch;

public class TernarySoru {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alın sayı pozitifse
        //sayı pozitif yazdırın negatifse sayının karesini yazdırın

        int sayı=145;

        System.out.println(sayı>0? " Sayı pozitif " : (sayı*sayı));


        //Kullanıcıdan bir tam sayı alın ve sayının tek veya cift oldugunu yazdırın

        int sayı2=2368;

        System.out.println(sayı2%2==0? " Çift sayı" : " Tek sayı");

        //Kullanıcıdan iki sayı alın ve küçük olanı yazdırın


        System.out.println(sayı>sayı2? (sayı2) : (sayı));








    }
}
