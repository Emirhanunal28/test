package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {


        // verilen sayinin poztif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif sayi ise tek veya cift
        // negatif sayi ise -100'den buyuk veya kucuk
        // oldugunu belirleyen bir ternary yaziniz


        int sayı=-2222;

        if (sayı>0){
            if (sayı%2==0){
                System.out.println(" Sayı çift");
            }else {
                System.out.println(" Sayı tek");
            }
        }else {
            if (sayı<-100){
                System.out.println(" sayı negatif ve -100 den küçük");
            }else {
                System.out.println(" sayı negatif ve -100 den büyük");
            }
        }


       String sonuc=sayı>0?
               (sayı%2==0? " sayı pozitif çift" : " sayı pozitif tek"):
               (sayı<-100? " sayı negatif -100 den küçük" : " sayı negatif -100 den büyük");






















    }
}
