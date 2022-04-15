package day34_accessModifier_encapsulatıon;

public class C01 {
    private static int sayi=10;
    private static String str="Java";
    static int acikSayi=20;//access modifier'ı default access modifier
    String acikString ="Hi";//access modifier'ı default access modifier
    public static int halkaAcikSayi=15;
    protected static int aileyeOzel=40;
    protected C01(){
        //bu constructorun access midifier'i default access modifierdir
        //dolayisiyla icinde oldugumuz paketten
    }
    private C01(int numara){
        System.out.println("Parametreli construactor calisti");
    }

    private void  method1(){

    }
}
