package day12_StringManıpulatıon;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";

        //bu cumledeki boşluk dışındaki karakter sayısını bulunuz

        System.out.println("space hariç karakter sayısı: " + str.replace(" ","").length());

        //atama yapılmadığı sürece orijinal string kalıcı olarak değişmez
        //sadece o satır için değişiklik yapılıp sonuc yazdırılmış olur

        System.out.println("orijinal str karakter sayısı: " + str.length());

        //str da kalıcı degısıklık yapalım
        //bugun yerine yarın
        //ogrendik yerine ogrenecegız

        str=str.replace("Bugun","Yarın");
        str=str.replace("ogrendik","ogreneceğiz");

        System.out.println("kalıcı degişiklikten sonra : " + str);

        str=str.replace("ne cok", "ne az");
        System.out.println(str);










    }
}
