package javahomeworkweek7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddOrEven {
    public static void main(String[] args) {
        //enter input by using scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        scanner.close();
        //odd or even using ternary operator
        String result = num % 2 ==0? "Even" : "odd";
        System.out.println(num + " is "  + result);


    }


}
