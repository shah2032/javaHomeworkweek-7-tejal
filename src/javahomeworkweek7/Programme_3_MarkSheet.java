package javahomeworkweek7;

import java.util.Scanner;

/**
 *Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|

 */
public class Programme_3_MarkSheet {
    String name;
    int roll,maths,science,english;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name :");
        String name = scanner.nextLine();
        System.out.println("Enter roll number :");
        int roll = scanner.nextInt();
        System.out.println("Enter maths marks :");
        int m = scanner.nextInt();
        System.out.println("Enter science marks :");
        int s = scanner.nextInt();
        System.out.println("Enter english marks :");
        int e = scanner.nextInt();
        // and find out total, percentage and result.
        int total = m + s + e;
        int percentage = (total*100)/300;

        //If he is pass or fail on basis of percentage (pass>=35)
        String result = "Fail";
        if(percentage >=35){
            result="Pass";
        }
        //and also give them grade if %> = 80 A+,
        //%> = 60 A, %> = 50 B, %> = 35 C
        String grade="C";
        if (percentage >= 80){

            grade="A+";
        }else if(percentage >= 60){
            grade="A";
        }else if(percentage >= 50){
            grade="B";
        }

        //And print Mark Sheet in following format
        String marksSheet =
                "_______________________________\n" +
                        "| |\n" +
                        "| Mark Sheet |\n" +
                        "|_______________________________|\n" +
                        "| Name : " + name + " |\n" +
                        "| Roll No: " + roll +  " |\n" +
                        "|_______________________________|\n" +
                        "| Subjects : Marks |\n" +
                        "|_______________________________|\n" +
                        "| Math : "  + m+  " |\n" +
                        "| Science : " + s  + " |\n" +
                        "| English : " + e + " |\n" +
                        "|_______________________________|\n" +
                        "| Total : " + total + " |\n" +
                        "|_______________________________|\n" +
                        "| Percentage : " + percentage + " |\n" +
                        "| Result : " + result + " |\n" +
                        "| Grade : " + grade + " |\n" +
                        "|_______________________________|";

        System.out.println(marksSheet);


    }
        }






