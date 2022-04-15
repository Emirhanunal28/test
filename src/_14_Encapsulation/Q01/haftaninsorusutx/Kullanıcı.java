package _14_Encapsulation.Q01.haftaninsorusutx;

import java.time.LocalDateTime;

public class Kullanıcı {

    String name;
    LocalDateTime kayitZamani;


    public Kullanıcı(){

    }

    public Kullanıcı(String name, LocalDateTime kayitZamani) {//p'li cons
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}
