package day36_inheritnce;

public class Memur extends Muhasebe{


    public static void main(String[] args) {


        Memur memur1 = new Memur();
        //memur1 objesi memur classının objesi olmasına ragmen
        //ınherit ettigi muhasebe ve onun da parenti olan
        //personel classlarındaki tum datalari alabilir


        memur1.personelNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125756595";

        //muhasebe classından

        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);


        Memur memur2=new Memur();
        memur2.personelNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2);




    }
    @Override
    public String toString() {
        return "Memur:" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' ;
    }
}

