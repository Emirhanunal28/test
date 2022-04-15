package day15_methodCreatıon;

public class C06_MethodCreatıon {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //iki varıable' ın degerlerını toplayan bir method olusturalım
        //1.adım: method adını yazalım
        //2.adım:methoda gondermem gereken arguman var mı?
        ikiSayıTopla(25,50);

        C04.dortHarfiTersineCevir("sema");


    }


    //bir methodu olusturmak calışması için yeterlı degıldır
    //method ancak cagırılırsa calısırız
    //aynı class veya farklı classda olmasının hıc bır onemı yoktur
    //Java maın method da yukarıdan asagıya dogru calısır
    //ve geldığı satırı calıstırır

    private static void ikiSayıTopla(int a, int b) {
        System.out.println("verilen iki sayının toplamı :" + (a+b));
    }
}
