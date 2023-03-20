package javahomeworkweek7;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Program_18_SumOfArray {
    public static void main(String[] args) {
        //create an array
        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //getting array length
        int length = array.length;
        int sum = 0;
        //sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int sum1 = sum;
        System.out.println("Sum of array : " + sum1);
    }
}