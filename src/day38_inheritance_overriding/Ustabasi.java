package day38_inheritance_overriding;

public class Ustabasi extends Isci{
    public String statu="Ustabasi";
    public String haklar="Ustabasi haftada 1 gun ekstra tatil hakkına sahiptir";

    public void mesai(){
        System.out.println("Arıza varsa ustabasi ekstra ucret almadan calisir");

    }

    public void maasHesapla(){
        System.out.println("Ustabasi 30 * 8 saat * 12 euro = " + (30*8*12) + "euro maas alir");
    }

    public static void main(String[] args) {
         /*
          Icinde oldugumuz Class'dan klasik haliyle bir obje olusturursak
          o obje ile cagirdigimiz variable ve method'larda
          Java once icinde bulundugumuz class'a bakar
          aradigimiz class uyesi, icinde oldugumuz class'da varsa
          bize onu getirir
          YOKSA,
          parent class(lar)a bakar, ilk buldugunu getirir
         */
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//Ustabasi haftada 1 gun ekstra tatil hakkına sahiptir
        System.out.println(yasin.ikramiye);//Isciler yılda bir ikramiye alır
        System.out.println(yasin.izin);//Tum personel yılda 4 hafta ızın kullanabılır
        yasin.maasHesapla();
        yasin.mesai();
        /*
            Eger isci olarak ozelliklerini gormek istersek
            Class adini (Data Turu) Isci seceriz
         */
        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//Isciler kıdem tazminati alirlar
        System.out.println(ahmet.ikramiye);//Isciler yılda bir ikramiye alır
        System.out.println(ahmet.izin);//Tum personel yılda 4 hafta ızın kullanabılır
        ahmet.maasHesapla();//Ustabasi 30 * 8 saat * 12 euro = 2880euro maas alir
        ahmet.mesai();//Arıza varsa ustabasi ekstra ucret almadan calisir

        /*
        Siz bir objeyi hangi class'dan tanimlarsaniz o class'a ait ozelliklere sahip olur
         */
        Personel adem=new Ustabasi();
        System.out.println(adem.statu);//Personel
        System.out.println(adem.haklar);//Tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye);//CTE
        System.out.println(adem.izin);//Tum personel yılda 4 hafta ızın kullanabılır
        adem.maasHesapla();//Ustabasi 30 * 8 saat * 12 euro = 2880euro maas alir
        adem.mesai();//Arıza varsa ustabasi ekstra ucret almadan calisir
        /*
        Personel adem=new Ustabasi(); Bu bir Ustabasi objesidir
        Ustabasi 30 gun * 8 saat * 12 euro = 2880 Euro maas alir
        Ariza varsa Ustabasi ekstra ucret almadan calisir
        Personel adem=new Personel(); Bu Personel objesidir
         */
    }
}
