package day17_forLoop;

public class C09_Palindrome2 {
    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.

        String input="Madam";
        String terstenInput=tersineCevir(input);

        System.out.println("Girdiğiniz kelimenin tersten yazılısi : " +
                terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiğiniz kelime palindrome");
        }else{
            System.out.println("Girdiğiniz kelime palindrome değil");
        }



    }

    private static String tersineCevir(String input) {

        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);
        }
        return terstenInput;
    }
}
