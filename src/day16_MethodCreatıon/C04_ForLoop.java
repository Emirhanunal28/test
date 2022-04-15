package day16_MethodCreatıon;

public class C04_ForLoop {
    public static void main(String[] args) {

        //verilen stringi tersten yazdiran bir kod yaziniz


        String str="Valla bu Java cok zevkli";

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }













    }
}
