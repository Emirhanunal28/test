package day33_varargs_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok guzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 length : " + sb1.length());//0
        System.out.println("sb1 capacity : " + sb1.capacity());//16

        System.out.println("sb2 length : " + sb2.length());//14
        System.out.println("sb2 capacity : " + sb2.capacity());//30

        System.out.println("sb3 length : " + sb3.length());//0
        System.out.println("sb3 capacity : " + sb3.capacity());//10

        // append method'u ile sb'a ekleme yapabiliriz

        sb1.append("Java").append(" ").append("Cok").append(" ").append("Guzel");
        System.out.println("sb1 length : " + sb1.length());//14
        System.out.println("sb1 capacity : " + sb1.capacity());//16

        sb1.append(3);
        System.out.println(sb1);//Java Cok Guzel3
        sb1.append(true);
        System.out.println(sb1);//Java Cok Guzel3true

        System.out.println("sb1 length : " + sb1.length());//19
        System.out.println("sb1 capacity : " + sb1.capacity());//34

        sb1.append("Tum dersler java olsa");
        System.out.println("sb1 length : " + sb1.length());//40
        System.out.println("sb1 capacity : " + sb1.capacity());//70
        //capacity ve length'i trimToSize ile eşitleyebiliriz
        sb1.trimToSize();
        System.out.println("sb1 length : " + sb1.length());//40
        System.out.println("sb1 capacity : " + sb1.capacity());//40

        StringBuilder sb=new StringBuilder(5 + 7 + "Java" + 4 + 5);
        String isim="Mesut";
        sb.append(isim,2,4);
        sb.delete(4,6);
        System.out.println(sb);



    }
}
