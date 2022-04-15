package day43_Garbage_abstractClass;

public class C01_Final {

    final static double piSayisi=3.14;
    final static String okulIsmi="Yidiz Koleji";

    public static void main(String[] args) {

        final int sayi=10;
        // okulIsmi="Java Koleji";  final olarak isaretlendigi icin degistirilemez



    }

    public static final void method1(){
        System.out.println("parent class final method1");

    }
}
