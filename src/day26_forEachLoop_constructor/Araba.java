package day26_forEachLoop_constructor;

public class Araba {
    /* Java'da her class olusturdugumuzda
      Java o class'dan ileride objeler uretmek gerekecegını bilir
       ve biz ozellikle belirtmesek de Java
       her olusturdugu class'a construactor koyar

       Java'nin class olustururken class'a koydugu construactor'a
       DEFAULT CONSTRUACTOR denir ve bu construactor gorunmez

       Eger biz gorunur construactor'imiz olsun istersek
       default construactor ile ayni gorevi yapan bir construactor olusturabiliriz
       veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
       farkli ozelliklerde construactorlar da olusturabiliriz

       construactor'lari birbirinden farklilastiran tek ayricalik
       kullanılan parametre sayisi ve parametre data turudur
     */

    public Araba(){
        System.out.println("parametresiz construactor calisti");
    }
    /*bir kod blogunun method veya construactor olmasından emin olmak istiyorsaniz

    iki seye dikkat etmelisiniz
    1-Construactorlar'in ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar
    2-Construacrlar'ın return type'i olmaz

    ozetle : construactor'in adi class adi ile ayni olmali ve
            return type'i olmamali
     */

    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }

    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }

    public Araba(int yil, String renk){
        System.out.println(yil + " model " + renk + " renginde bir araba uretildi");
    }












}

