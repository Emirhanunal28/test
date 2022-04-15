package day36_inheritnce;

public class SurekliIsciler extends Isci {



    public static void main(String[] args) {
        SurekliIsciler surIc1=new SurekliIsciler();
        surIc1.personelNo=5001;
        surIc1.isim="Cem";
        surIc1.soyisim="Akay";
        surIc1.statu="Isci";
        surIc1.saatUcreti=11;
        surIc1.maas=surIc1.maasHesapla();
        System.out.println(surIc1);

    }
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ",\n saatUcreti=" + saatUcreti +
                ",\n statu='" + statu + '\'' +
                ",\n maas=" + maas +
                ",\n personelNo=" + personelNo +
                ",\n isim='" + isim + '\'' +
                ",\n soyisim='" + soyisim + '\'' +
                ",\n adres='" + adres + '\'' +
                ",\n tel='" + tel + '\'' +
                '}';
    }
}
