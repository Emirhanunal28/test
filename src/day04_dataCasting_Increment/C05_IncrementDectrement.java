package day04_dataCasting_Increment;

public class C05_IncrementDectrement {

    public static void main(String[] args) {

        int sayi=20;

        System.out.println(sayi+10); //30

        System.out.println(sayi); //20

        sayi=sayi+10;

        System.out.println(sayi); //30

        System.out.println(sayi=sayi+=10); //40

        System.out.println(sayi); //40

        System.out.println(sayi+=10); //50
        System.out.println(sayi); //50


        System.out.println("30.satir : "+ sayi++);  //50
        System.out.println("31.satir : "+ sayi);  //51


        System.out.println("34.satir : "+ ++sayi); //52
        System.out.println("35.satir : "+ sayi);  //52









    }
}
