package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileinputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day41_exception/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {//FileNotFoundException
            e.printStackTrace();
        } catch (IOException e) {//IOException
            e.printStackTrace();
        }


    }
}
