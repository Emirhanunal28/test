package day41_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {
        /*
        Bir kod yazılırken olası exceptiıns lar ongorulup
        exceptions olustugunda Java'nin ne yapmasını istedigimiz
        belirtilmelidir.


         */

        String dosyaYolu="src/day41_exception/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }







    }
}
