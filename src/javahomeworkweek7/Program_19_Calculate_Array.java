package javahomeworkweek7;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Program_19_Calculate_Array {
    public static void main(String[] args) {
        int[] numbers = new int[]{20,35,25,35,-16,97,-17};
        //calculate sum of all array elements
        int sum = 0;
        //using for loop
        for(int i=0; i<numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum /numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
