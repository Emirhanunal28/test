package day11_stringManıpulatıon;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz ?  \nEvet veya Hayır yazınız" );
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız : " + cevap + " derse katılımınız onaylanmıştır");
        }else if (cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız " + cevap + " sonraki derslerimize bekleriz");

        }else {
            System.out.println("yanlış cevap ");
        }






















    }
}