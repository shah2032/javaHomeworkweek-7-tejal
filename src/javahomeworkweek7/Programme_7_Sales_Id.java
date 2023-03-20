package javahomeworkweek7;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme_7_Sales_Id {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales ID :");
        String salesId = sc.next();
        System.out.println("Enter Sales amount : ");

        double amount = sc.nextDouble();
        double salesCommission = 0;
        //Sales amount >= 50,000 35%
        if (amount >= 50000) {
            salesCommission = calculateCommission(amount, 35);
            //Sales amount >= 30,000 20%
        } else if (amount >= 30000) {
            salesCommission = calculateCommission(amount, 20);
            //Sales amount >= 20,000 10%
        } else if (amount >= 20000) {
            salesCommission = calculateCommission(amount, 10);
            //Sales amount >= 10,000 5%
        } else if (amount >= 10000) {
            salesCommission = calculateCommission(amount, 5);
            //Sales amount <= 10,000
        } else if (amount <= 10000) {
            salesCommission = calculateCommission(amount, 2);
        }

        System.out.print("Commission amount =" + salesCommission);


    }
    static double calculateCommission(double x , int y){
        return x*y/100;
    }
}
