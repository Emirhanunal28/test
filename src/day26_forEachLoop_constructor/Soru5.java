package day26_forEachLoop_constructor;

import java.util.ArrayList;

public class Soru5 {
    public static void main(String[] args) {

        /* GÖREV:
         * Dizi { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 } ise
         * öğeleri {3, 5+1, 2+7+9, 2+3+5+7} gibi yeni bir dizi oluşturmak için bir program yazın.
         * hale dizi elemanları toplam hesaplanalayan bir yöntemi oluşturma ediniz.
         */

        int arr[]={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        System.out.println(ardisikTopla(arr));
    }

    private static ArrayList<Integer> ardisikTopla(int[] arr) {
        ArrayList<Integer> toplananSayilarlisti=new ArrayList<>();
        int count=0;
        int toplananSayiAdedi=1;

        while (arr.length-toplananSayiAdedi>=count){//sayılar bitene actıon
            int toplam=0;

            for (int i = 0; i <=count ; i++) {
                toplam+=arr[toplananSayiAdedi-1+i];

            }

            count++;
            toplananSayiAdedi+=count;
            toplananSayilarlisti.add(toplam);


        }
        return toplananSayilarlisti;
    }
}
