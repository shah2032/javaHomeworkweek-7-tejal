package javahomeworkweek7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme_10 {
    public static void main(String args[]) {
        //int first, second, add, subtract, multiply;
        // float devide;
        Scanner scanner = new Scanner(System.in);
        float num1, num2, res;
        char ch;

        System.out.print("Enter Two Numbers : ");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        System.out.println("Enter symbol ( +, - * , / :  ");
        ch = scanner.next().charAt(0);
        if (ch == '+') {
            res = num1 + num2;
        } else if (ch == '-') {
            res = num1 - num2;
        } else if (ch == '*') {
            res = num1 * num2;
        } else {
            System.out.println("\nInvalid Input");
            return;
        }
        System.out.println("\nResult = " + res);


    }

}