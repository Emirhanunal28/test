package day13_stringManıpulatıon;

public class C02_substring {
    public static void main(String[] args) {

        //1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayısı 100'den cok ise
        //super az ise "az sonuc bulundu"

        String str="1-48 of 104 results for \"nutella\"";

        int ilkSpace=str.indexOf(" ");//4
        int ikiciSpace=str.indexOf(" ",ilkSpace+1);
        int ücüncüSpace= str.indexOf(" ",ikiciSpace+1);

        String aramaSonucSayısıStr= str.substring(ikiciSpace+1,ücüncüSpace);

        int aramaSonucSayısıInt=Integer.valueOf(aramaSonucSayısıStr);

        if (aramaSonucSayısıInt>100){
            System.out.println("Super");
        }else {
            System.out.println("az sonuc bulundu");
        }
















    }
}
