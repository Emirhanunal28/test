package _14_Encapsulation.Q01.haftaninsorusutx;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {

     List<Kullanıcı> kisiler=new ArrayList<>();//bos list creat edildi kayitAl()method bu liste element atayacak


    public  List<Kullanıcı> kayıtAl(){
        Scanner scan=new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String isim= scan.nextLine();
        Kullanıcı k1=new Kullanıcı(isim, LocalDateTime.now());//kullanıcı classtan p'li cons ile obje create edildi
        kisiler.add(k1);//kullanıcı classtan p'li cons ile create edilen obj kisiler listine eklendi



        return kisiler;
    }

    public  void sansliKullanici(List<Kullanıcı>kll){

        for (Kullanıcı k:kll) {//kayıAl() methodundan creat edilen her bir kullanıcı donguye sokuldu
            if (k.kayitZamani.getSecond()<10){//her bir kullanıcının kayıtZamanındaki saniye if sartına sokuldu
                System.out.println("sansli kisisiniz " + k.name+ " agam 5 kilo bal kazandın");
            }else System.out.println("maalesef " +k.name+" ballar balını buldunuz ");
        }

    }
    public void listele(List<Kullanıcı> kullanıcılar){
        for (Kullanıcı k:kullanıcılar) {//kayıtAl() methodundan gelen kişiler listini donguye sokuyor
            System.out.println("adi :"+k.name+" kayıt zamnı: "+k.kayitZamani);//listedeki her bir kullanıcının adı ve kayıt zamanını yazdıracagız


        }
    }



}
