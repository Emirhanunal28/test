package day36_inheritnce;

public class UstaBasi extends Isci{


    public static void main(String[] args) {

        UstaBasi ustabasi1=new UstaBasi();
        ustabasi1.saatUcreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Gokcek";
        ustabasi1.maas=ustabasi1.maasHesapla();
        ustabasi1.statu="Isci";
        ustabasi1.isciStatu="Ustabasi";
        System.out.println(ustabasi1);

    }
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ",\n saatUcreti=" + saatUcreti +
                ",\n statu='" + statu + '\'' +
                ",\n maas=" + maas +
                ",\n personelNo=" + personelNo +
                ",\n isim='" + isim + '\'' +
                ",\n soyisim='" + soyisim + '\'' +
                ",\n adres='" + adres + '\'' +
                ",\n tel='" + tel + '\'' ;
    }
}
