package day14_strıngManıpulatıon;

public class Soru {
    public static void main(String[] args) {

        String str=" Java ogrenmek123 Cok guzel@ ";

        str=str.replaceAll("123","");
        str=str.replaceAll("@","");
        System.out.println(str);


        //Kullanicidan isim isteyin. Eger
        //- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        //- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        //- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin


        String ısım="Zeynep";

        if (ısım.contains("a")){
            System.out.println("Girdiğiniz isim a harfi içeriyor");
        }else if (ısım.contains("Z")){
            System.out.println("Girdiğiniz isim Z harfi içeriyor");
        }else if ((!ısım.contains("a"))){
            System.out.println("Girdiğiniz isim a  veya Z harfi içermiyor: " + ısım);
        }












    }
}
