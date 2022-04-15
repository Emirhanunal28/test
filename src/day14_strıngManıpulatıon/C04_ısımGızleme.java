package day14_strıngManıpulatıon;

public class C04_ısımGızleme {
    public static void main(String[] args) {

        //Soru 7)
        // Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234


        String isim="oguzhan";
        String soyIsım="BALKAYA";
        String kKNo="1234567890123456";

        String yeniIsım=isim.substring(0,1).toUpperCase()+
                        isim.substring(1).replaceAll("\\S","*");

        String yenıSoyısım=soyIsım.substring(0,1).toUpperCase()+
                           soyIsım.substring(1).replaceAll("\\S","*");

        String yenıKKNo="**** **** **** " + kKNo.substring(12);
        System.out.println("isim-soyısım : " + yeniIsım+" " + yenıSoyısım+
                "\nKart No: " +  yenıKKNo );























    }
}
