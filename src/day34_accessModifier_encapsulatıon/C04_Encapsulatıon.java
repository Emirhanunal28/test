package day34_accessModifier_encapsulatıon;

public class C04_Encapsulatıon {

    public static void main(String[] args) {


        C03 obj=new C03();

        System.out.println(obj.getSayi());//0

        obj.setStr("Java Java Java");

        System.out.println(obj.getStr());//Java Java Java

        System.out.println(obj);//C03{sayi=0, str=Java Java Java
    }
}
