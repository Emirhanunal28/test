package _14_Encapsulation.Q01.haftaninsorusutx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {
    public static void panel(){

        Scanner scan=new Scanner(System.in);


        Kayıt yeniKayit=new Kayıt();//obje ile method call yapilacak

        List<Kullanıcı> kisi=new ArrayList<>();
        boolean cikilsinMi=false;
        while (!cikilsinMi){
            System.out.println("lutfen \n1: Kayıt al\n2: şanslı kisi bul\n3: Kisileri listele\n4:cıkıs");
            System.out.println("isleminizi secin : ");
            int islem= scan.nextInt();
            switch (islem){

                case 1:
                    kisi=yeniKayit.kayıtAl();//kisi listi degerini yeni kayit objesi ile kayitAl() method call dan alacak
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;
                default:
                    System.out.println("hatalı veri girdiniz");
                    break;
            }
        }




    }
}
