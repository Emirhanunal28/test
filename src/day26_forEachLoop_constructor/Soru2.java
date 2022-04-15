package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru2 {
    public static void main(String[] args) {

        /* GÖREV:
         * Giriş olarak verilen listtekilara eklenir
         * icinde 'a' harfi harfileri susturma bir kodu oluşturma ediniz.
         *
         * Gİrİş : list1={"Ali","Veli","Ayşe","Fatma","Ömer"}
         * ÇIKIŞ : [Veli,Ömer]
         */


        List<String> isimler=new ArrayList<>(Arrays.asList("Ali", "Veli", "Fatma", "Omer"));
        List<String> aOlmayanisimler=new ArrayList<String>();

        for (String w:isimler) {
            if (!w.toLowerCase().contains("a")){//a bulundurmayan isimler
                aOlmayanisimler.add(w);

            }

        }

        System.out.println("içinde a olmayan isimler : " + aOlmayanisimler);
        isimler.clear();
        isimler.addAll(aOlmayanisimler);
        System.out.println(isimler);

    }

}
