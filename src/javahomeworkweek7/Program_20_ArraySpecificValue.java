package javahomeworkweek7;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Program_20_ArraySpecificValue {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {
                23,32,15,70,40,30,12,67};
        System.out.println(contains(array1, 20));
        System.out.println(contains(array1, 23));
    }
}
