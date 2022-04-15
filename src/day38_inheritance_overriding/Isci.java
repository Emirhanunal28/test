package day38_inheritance_overriding;

public class Isci extends Personel {
    public String statu="Isci";
    public String haklar="Isciler kıdem tazminati alirlar";
    public String ikramiye="Isciler yılda bir ikramiye alır";

    public void mesai(){
        System.out.println("Tum isciler haftalik 40 saat calisir");

    }

    public void maasHesapla(){
        System.out.println("Tum personel 30 * 8 saat * 11 euro = " + (30*8*11) + "euro maas alir");
    }

}
