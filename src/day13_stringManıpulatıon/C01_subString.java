package day13_stringManıpulatıon;

public class C01_subString {
    public static void main(String[] args) {

        String str= "Java ile IT çok guzel";

        System.out.println(str.substring(5));//ile IT çok guzel
        //yukardaki String'i Mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca " + str.substring(5));

        System.out.println(str.substring(9));//yazılan index inclusive

        //Eğer bir indexten sona kadar olan parçayı değil
        //belirli bir parçayı almak istersek
        //2 parametre yazmak gerekiyor str.substring(baslangıcIndexi, bitisIndexi)
        // baslangıc indexi ==>inclusive/dahil
        //bitis indexi==> eclusive/haric

        System.out.println(str.substring(0,5));//Java

        System.out.println(str.substring(0,1));//J
        String harf=str.substring(5,6);//bana 6.karakter String olarak bulun
        System.out.println(harf);

        str="Java gun geçtikce guzelleşiyor";
        System.out.println(str.substring(7,7));//hiçlik dondurur

        //System.out.println(str.substring(5,2));//bitiş index'i baslangıc indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1));//son harfi verir (r)
        System.out.println(str.substring(str.length()-5));//son 5 harf
        System.out.println(str.substring(str.length()));//son harften sonraki kısmı yani hıclık








    }
}
