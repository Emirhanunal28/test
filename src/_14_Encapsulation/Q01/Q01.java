package _14_Encapsulation.Q01;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
 (büyük/küçük harf duyarlılığı olmadan)
 Örn: giriş : Java'yı seviyorum
 Çıktı: "Ters cümle: avaJ evol I
 Bu bir palindrom değil"
		 */

        StringBuilder sb1=new StringBuilder("Javayı sevmeyen kalmasın");
        System.out.println(sb1.reverse());
    }
}
