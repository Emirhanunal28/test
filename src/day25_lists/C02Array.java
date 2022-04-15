package day25_lists;

import java.util.Arrays;

public class C02Array {
    public static void main(String[] args) {
        //verilen bir arrayden istenen elementi(kac tane varsa) silip
        //kalanları yeni bir array olarak yazdıran bir method olustur


        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;
        istenmeyenElementiSil(arr,istenmeyenEleman);
        
    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenmeyenEleman){
                sayac++;
            }
        }
        //2- yeni arrayi oluşturalim
        int arrYeni[]=new int[arr.length-sayac];


        // 3- eski arry'den uygun elementleri yeniye tasi

        int index=0;
        //3- eski arrayden uygun elementleri yeniye tasi
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != istenmeyenEleman){
               arrYeni[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arrYeni));
    }
}
