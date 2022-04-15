package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru3 {
    public static void main(String[] args) {
        /* GÖREV:
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsız
         * sayilardan olusan bir dizi haline eden bir kod create ediniz.
         *
         * GİRİŞ : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * ÇIKIŞ : [1,2,3,4,5,6,7,8,9]
         */

        int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        List<Integer> tekrarsiz = new ArrayList<>();
        for (Integer s:arr) {
            if (!tekrarsiz.contains(s)){//eleman yoksa add ile tekrarsiz liste ekle varsa geç
                tekrarsiz.add(s);
            }

        }

        Collections.sort(tekrarsiz);
        int tekrarsizArray[]=new int[tekrarsiz.size()];
        for (int i = 0; i <tekrarsiz.size() ; i++) {
            tekrarsizArray[i]=tekrarsiz.get(i);

        }

        System.out.println(Arrays.toString(tekrarsizArray));










    }
}
