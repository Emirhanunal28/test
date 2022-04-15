package javaPractice2022;

import java.util.Scanner;

public class DoWhileLoop2 {
    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String word="";

        do {
            System.out.println("bir string giriniz");
            word = scan.nextLine();
            if (word.length() < 3) {
                System.out.println("kelime 3 den kisa");
            }
            if (word.length() % 2 == 1 && word.length() >= 3) {
                System.out.println("stringin ortasındaki harf " + word.charAt(word.length() / 2));
            } else {
                System.out.println("string deki karakter sayisi cift");
            }
        } while (!(word.length()%2==1 && word.length()>=3));








    }
}
