package javahomeworkweek7;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program_12_AlphaDigitSymbol {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value : ");
        char ch= in.next().charAt(0);
      //  char ch = 'z';
        if((ch>='a' && ch<='z') || (ch>='A' && ch<'Z')){
            System.out.println("Alphabet");
        } else if (ch>='1' && ch<='9') {
            System.out.println("Digit");

        }else{
            System.out.println("Special Character");


        }


    }
}
