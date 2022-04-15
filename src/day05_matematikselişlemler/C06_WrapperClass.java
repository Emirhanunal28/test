package day05_matematikselişlemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

         // verilen iki string'deki sayilari toplayin


        System.out.println(str1+str2); //1234523456

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));//35801

        //Integer.valueOf(str1) methodu sadece sayisal deger içeren Stringlerde kullanılabilir
        // bir tane bile sayi dışında karakter olursa Java hata verir

















    }
}
