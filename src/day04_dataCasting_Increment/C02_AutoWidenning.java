package day04_dataCasting_Increment;

public class C02_AutoWidenning {

    public static void main(String[] args) {

        boolean dogruMu=true;



        byte sayi1= 44;


        System.out.println(sayi1); //44




        short sayi2= sayi1; //esitliğin solu short saği ise byte olmasına ragmen java itiraz etmiyor

                            //değer olarak atanan data turu variable data turunden kucuk olduğu için java sorun yapmaz

                            //Auto Widening



        System.out.println(sayi2); //44

      double sayi3=sayi2;

        System.out.println(sayi3); //44.0









    }
}
