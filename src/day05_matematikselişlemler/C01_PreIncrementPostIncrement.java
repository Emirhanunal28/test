package day05_matematikselişlemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {

    int sayi=10;
    // bu sayiyi bir artırmak istersek
        sayi++;
        System.out.println(sayi); //11

        sayi++;
        System.out.println("pre-incrementten once "+ sayi); //12
        // eger 11. ve 12. satırda yaptıgım 2 islemi tek satırda yaparsam
        //java iki işlemden once hangisini yapacagını bilmek ister
        // once artırır sonra yazdırırsak java yeni degeri yazdırır
        // ama once yazdırır sonra artırırsak bu durumda eski deger yazdırılır.

        System.out.println("pre-increment satırında " + ++sayi); // 13 once artir sonra yazdir

        System.out.println("pre-incrementden sonra " +   sayi); //13

        System.out.println("post-increment satırında " + sayi++);//13 once yazdir sonra artir

        System.out.println("post-increment satırından sonra " + sayi); //14




    }

}
