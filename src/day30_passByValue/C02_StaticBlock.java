package day30_passByValue;

public class C02_StaticBlock {

    /*
        static olmayan bloklar ise obje olusturulurken calisir
        static bloklar sadece 1 kere en basta calisir ama
        static olmayan bloklar her obje olusturulurken yeniden calisir
         */
    {

        System.out.println("static olmayan block calisti");
    }

    static {
        System.out.println("static  block calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBlock obj1 =new C02_StaticBlock();
        C02_StaticBlock obj2 =new C02_StaticBlock();
    }
}
