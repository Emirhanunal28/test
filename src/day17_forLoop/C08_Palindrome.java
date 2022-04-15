package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol
        // eden bir method yazin.



        String input="Madam";
        palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);
        }
        System.out.println("Girdiğiniz kelimenin tersten yazilisi : " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiğiniz kelime palindrome");
        }else {
            System.out.println("Girdiğniz kelime palindrome degil");
        }








    }
}
