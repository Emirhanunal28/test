package javaPractice2022;

public class Q06_Multiple {
     /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */

    public static void main(String[] args) {

        ortalamaBul("Ahmet",78,91,57,86,64,70);
        ortalamaBul("İrem",78,76,88,67);
        ortalamaBul("Hasan",78,80,69);
        ortalamaBul("Aylin",78,76,57,66,49);
    }

    public static void ortalamaBul(String isim ,int...notlar) {

        int toplam=0;
        for (int each:notlar) {
            toplam+=each;

        }
        System.out.println(isim+": Not ortalaması "+ toplam/ notlar.length);
    }
}
