package day40_overriding_polymorphism;

public class C04_Exceptions {

    public static void main(String[] args) {
        //String olarak verilen bir sayıyı Integer a cevirip
        //2 katını ekranda yazdiralim

        String str="12345a";


        //str icinde sayi olmayan bir karakter olursa
        //NumberFormatException.forInputString verir




        try {
            int sayi=Integer.parseInt(str);
            System.out.println("girilen sayinin 2 kati: " + 2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("girdiginiz String sayi olmayan elementler iceriyor");
        }

    }


}
