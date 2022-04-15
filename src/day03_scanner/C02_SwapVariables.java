package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap'dan once sayi1: " +sayi1 + ", sayi2 : " + sayi2);

        //int temp=sayi1;

        sayi1=sayi2;

        //sayi2=temp;


        System.out.println("Swap'dan sonra sayi1: " +sayi1 + ", sayi2 : " + sayi2);


        int sayı3=45;
        int sayı4=22;

        System.out.println("Swaptan once sayı3:" +sayı3 +  " , sayı4 : " + sayı4);

        int temp=sayı3;
        sayı3=sayı4;
        sayı4=temp;

        System.out.println("Swaptan sonra: " +sayı3 + " , sayı4 : " + sayı4);





    }
}
