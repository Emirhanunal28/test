package day39_overriding;

public class Corolla extends Toyota{

    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";


    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir");

    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        /*
        Data turu ve constructor farkli oldugunda
        Constructor calistigi icin obje
        Constructor'in oldugu class ozelliklerini tasir
        ancak Data turu Parent class secildigi icin
        variable'lar data turunun secildigi class ve
        onun parent class'larindan deger alabilir
        Method'lar icin ise yine Data turunun oldugu class'a gideriz
        ancak direk method'u calistirmadan once
        method Override edilmis mi diye kontrol ederiz
         */

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//Arabala
        System.out.println(arb1.hiz);//Corolla
        System.out.println(arb1.yakit);//Corolla
        System.out.println(arb1.marka);//Toyata Classından alır
        System.out.println(arb1.sirketMerkezi);//Toyata class
        System.out.println(arb1.model);//Corolla classından corolla
        arb1.motor();//Corolla classından
        arb1.garanti();//Toyata classından

        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//Araba Classından
        System.out.println(arb2.hiz);//Toyata classından
        System.out.println(arb2.yakit);//Araba classından
        System.out.println(arb2.marka);//Toyata Classından alır
        System.out.println(arb2.sirketMerkezi);//Toyata classından
        //System.out.println(arb2.model);//
        arb2.motor();//Corolla classından
        arb2.garanti();//Toyata classından
        arb2.yakitTuketimi();//Corolla classından
        //arb2.vitesSayisi();CTE verir data turu Toyata oraya gider vites sayisi
                            //methodunu arar bulamayınca parent class a gider
                            // orda da bulamayınca geri dönemiyeceği için CTE

        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//Arabala
        System.out.println(arb3.hiz);//Araba classından
        System.out.println(arb3.yakit);//Araba classından
        System.out.println(arb3.marka);//Toyata Classından alır
        //System.out.println(arb3.sirketMerkezi);//CTE
        //System.out.println(arb3.model);//CTE

        //Data turunde olan class da kontrol eder lakin overriding
        //varsa bulundugu classta belirlien methodu yazdırır
        arb3.yakitTuketimi();//Corolla classından
        arb3.motor();//Corolla classından
        //arb3.garanti();CTE
        //arb3.vitesSayisi();//CTE


    }

}


    //Corolla araclar cevreci motor kullanir
    //Corolla 5.6 lt yakit tuketir
    //Corolla 5 viteslidir