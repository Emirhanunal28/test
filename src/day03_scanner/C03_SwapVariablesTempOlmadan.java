package day03_scanner;

public class C03_SwapVariablesTempOlmadan {

    public static void main(String[] args) {

        int sayi1= 30;
        int sayi2=20;

        System.out.println("Swaptan önce sayi1 :"  + sayi1 + " " + "sayi2: " + sayi2);
        sayi1= sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("Swaptan sonra sayi1 : " + sayi1 + " " + "sayi2: " + sayi2);


        int sayı3=43;
        int sayı4=87;

        System.out.println("Swaptan once sayı3 : " + sayı3 + " sayı4:" + sayı4);

        sayı3=sayı3+sayı4;
        sayı4=sayı4-sayı3;
        sayı3=sayı3-sayı4;

        System.out.println("Swaptan sonra sayı3: " + sayı3 + " Sayı4:" + sayı4);
















    }









}
