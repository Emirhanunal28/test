package day10_Switch_StringManipulatıon;

import java.util.Scanner;

public class SwitchDeney2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sayı gırınız");
        int sayı= scan.nextInt();

        switch (sayı){

            case 10:
                System.out.println("2 basamaklı en kucuk sayı");
                break;

            case 100:
                System.out.println("3 basamaklı en kucuk sayı");
                break;

            case 1000:
                System.out.println("4 basamaklı en kucuk sayı");
                break;

            default:
                System.out.println("Girdiğin sayıyı değiştir");
        }






























    }
}
