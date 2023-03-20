package javahomeworkweek7;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Program_17_String_Array {
    public static void main(String[] args) {
        int[] my_array1 = {
                183,343,235,567,231,345,897,342};
        String [] my_array2={
                "java" , "Python","C++","C Programming"};
        System.out.println("Original numeric array :" + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " +Arrays.toString(my_array1));
        System.out.println("Original string array :" + Arrays.toString(my_array2));
        Arrays.sort(my_array1);
        System.out.println("Sorted string array : " +Arrays.toString(my_array2));

    }
    }

