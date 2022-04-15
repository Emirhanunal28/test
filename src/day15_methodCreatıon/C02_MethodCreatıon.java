package day15_methodCreatıon;

import java.util.Scanner;

public class C02_MethodCreatıon {
    public static void main(String[] args) {

        //kullanıcıdan bir kelıme isteyın
        //eger kelıme 3 harften kısa ıse "kelıme cok kısa" yazdırın
        //eger kelıme 3 ,4 veya 5 harflı ıse harf sayısını ve
        //kelımenın tersten yazılışını yazdırın
        //eger 5 harften uzunsa "kelıme cok uzun" yazdırın"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır kelıme gırınız");
        String kelıme= scan.next();
        String tersKelıme="";

        if (kelıme.length()<3){
            System.out.println("kelıme cok kısa");
        }else if (kelıme.length()<=5){
            if(kelıme.length()==3){
                tersKelıme=kelıme.substring(2)+
                        kelıme.substring(1,2)+
                        kelıme.substring(0,1);
            }else if (kelıme.length()==4){
                tersKelıme=kelıme.substring(3)+
                        kelıme.substring(2,3)+
                        kelıme.substring(1,2)+
                        kelıme.substring(0,1);
            }else {
                tersKelıme=kelıme.substring(4)+
                        kelıme.substring(3,4)+
                        kelıme.substring(2,3)+
                        kelıme.substring(1,2)+
                        kelıme.substring(0,1);
            }
            System.out.println("girdiğiniz kelımedeki harf sayısı : " + kelıme.length());
            System.out.println("kelımenın tersten yazılısı : " + tersKelıme);
        }else{
            System.out.println("kelıme cok uzun");
        }






















    }
}
