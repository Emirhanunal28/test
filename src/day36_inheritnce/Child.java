package day36_inheritnce;

public class Child extends Parent{


    Child(){
        super();
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

        Child child=new Child();

    }
}
