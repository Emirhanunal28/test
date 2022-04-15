package day33_varargs_stringBuilder;

public class C04_StrıngBuılder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yasasın Java");
        sb1.insert(0,"S");
        System.out.println(sb1);


        System.out.println(sb1.indexOf("Java"));//8

        System.out.println(sb1.lastIndexOf("s"));//4
        System.out.println(sb1.indexOf("s"));//2

        System.out.println(sb1.replace(0,7,"Ne guzel"));//Ne guzel Java

        System.out.println(sb1);//Ne guzel Java
        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA

        //toString yaparak String e cevirdik o yuzden mutable ozelliğni kaybetti
        System.out.println(sb1);//Ne guzel Java

        //delete yaparak ıstedıgımız iki ındex arasında ki elemanları sıldı
        System.out.println(sb1.delete(0,3));//guzel Java

        System.out.println(sb1.deleteCharAt(5));//guzelJava


    }
}
