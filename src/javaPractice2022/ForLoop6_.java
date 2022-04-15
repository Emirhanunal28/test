package javaPractice2022;

import java.util.Scanner;

public class ForLoop6_ {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("satir sayisi giriniz");
        int satirSayisi= scan.nextInt();

        System.out.println("sutun sayisi giriniz");
        int sutunSayisi= scan.nextInt();


        for (int i = 1; i <=satirSayisi ; i++) {

            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();




    }
}
