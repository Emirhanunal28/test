package javapractise;

import java.util.Scanner;

public class deney {
    public static void main(String[] args) {

        //TASK kullanıcıdan aldıgınız kooedinat

        Scanner scan=new Scanner(System.in);

        System.out.println("X ve Y degerlerliniz giriniz : ");
        int x= scan.nextInt();
        int y= scan.nextInt();

        if (x>0 && y>0){
            System.out.println("girdiğiniz değerler 1.bolgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiğiniz degerler 2. bolgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiğiniz degerler 3. bolgeye ait");
        }else if (x>0 && y<0){
            System.out.println("girdiğiniz degerler 4. bolgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiğiniz değerler x ekseni uzerinde");
        }else if (x==0 && y!=0){
            System.out.println("girdiğiniz degerler y ekseni uzerinde");
        }else {
            System.out.println("girdiğiniz değerler orjın uzerinde");
        }































    }

}
