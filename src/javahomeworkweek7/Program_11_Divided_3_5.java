package javahomeworkweek7;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Program_11_Divided_3_5 {
    public static void main(String[] args) {
        System.out.print("\nDivided by 3 : ");
      //  print the numbers between 1 to 100 which divided by 3 using for loop
        for (int i = 1; i < 100; i++)
            if (i % 3 == 0) {
                System.out.println(i + "  ");
            }

        System.out.print("\n\nDivided by 5: ");
        //  print the numbers between 1 to 100 which divided by 5 using for loop
        for (int i = 1; i < 100; i++)
            if (i % 5 == 0) {
                System.out.println(i + "   ");
            }
        System.out.println("\n\nDivided by 3 & 5: ");
        //  print the numbers between 1 to 100 which divided by3& 5 using for loop
        for (int i = 1; i < 100; i++)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + "  ");
            }
            System.out.println("\n");

        }
    }



