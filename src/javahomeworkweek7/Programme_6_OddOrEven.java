package javahomeworkweek7;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6_OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        //find odd and even number by using if/else
        if (num % 2 == 0) {
            System.out.println(num + " is even");

        } else{
            System.out.println(num + " is odd");
        }
    }
}