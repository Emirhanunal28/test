package day37_inheritance;

import day36_inheritnce.Parent;

public class Child extends Parent {

    Child(){
        super();
        System.out.println("Child class parametresiz cons");
    }
    Child(int s){

        System.out.println("Child class parametreli cons");
    }

    Child(int sayi1, int sayi2){
        //eger parent class dan parametresiz consu degil de
        //baska bir consu calistirmak isterseniz
        //bunu Child class daki consun ILK SATIRINA yazmalısınız
        super(sayi1,sayi2);
        System.out.println("iki parametreli constructor");
    }

    public static void main(String[] args) {
        Child child=new Child(5,8);
    }
}
