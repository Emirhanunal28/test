package day19_dowhileLoop;

public class deney2 {
    public static void main(String[] args) {

        //ekrana 10 kez "Java Guzeldir" yazdırın


        for (int i = 1; i <=10 ; i++) {
            System.out.println("Java Guzeldir");
        }

        int sayi1=10;
        int sayi2=29;

        for (int i = sayi1; i <=sayi2 ; i++) {
            System.out.print(i + ", ");
            sayi1++;

        }

        System.out.println(30);


        int bas=100;
        int son=50;

        for (int i = bas; i >=son ; i--) {
            System.out.print(i + ", ");
        }


        int harf=69;

        for (int i = 1; i <=harf ; i++) {
            if (i%3==0){
                System.out.print(i + ", ");

            }
        }

        int sayi3=75;


        for (int i = 1; i <=sayi3 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print(i + ", ");
            }
        }



















    }
}
