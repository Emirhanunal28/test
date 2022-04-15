package day40_overriding_polymorphism;

public class C02 extends C01 {

    private void method4(){
        System.out.println("Child method 4");

    }
    @Override
    protected String method3(){
        //Covariant icin yazildi
        return "Java";
    }
    @Override
    public void method2() {
        /*
        @Override notasyonu olverridden method ile overriding
        methodu birbirine baglar
        Farkinda olmadan overridden method silinirse veya signature
        degistirilirse
        bu iliski bozulacagi icin Java CTE verir

        Notasyon kullanılmazsa Java bunlari iliskisini bilir
        ama overridden method silinirse sesini cikarmaz
         */

        System.out.println("Child method2");
    }

    public static void main(String[] args) {


        C02 obj=new C02();

        obj.method1();//parent method 1 calisti
        obj.method2();//Child method2

        C01 obj2=new C02();
        obj2.method1();//parent method 1
        //obj2.method2();//Child method2

        C01 obj3=new C01();

        obj3.method1();//parent method 1 calisti
        //obj3.method2();//parent method 2 calisti


    }
}
