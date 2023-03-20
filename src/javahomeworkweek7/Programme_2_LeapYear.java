package javahomeworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYear {
    //Method to check leap year
    public static void checkLeapYear(int year){
        //find leap year using nested if / else
        if (year % 400 == 0){
            System.out.println(year + " is a leap year.");
        }else if (year % 100 == 0){
            System.out.println(year + " is not a leap year .");
        }else if (year % 4 == 0){
            System.out.println(year + " is a leap year.");

        }else{
            System.out.println(year + " is a leap year .");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create a scanner object
        System.out.println("Enter a year to check :");
        int year = scanner.nextInt();//Read user input from command line
        checkLeapYear(year);
    }
}
