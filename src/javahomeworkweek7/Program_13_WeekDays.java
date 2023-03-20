package javahomeworkweek7;

import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Program_13_WeekDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int day = scanner.nextInt();
        scanner.close();
       //using switch
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                //number is not of selection then Print message "week contains 1 to 7 days
                System.out.println("Week contains 1 to 7 days ");
        }

    }
}
