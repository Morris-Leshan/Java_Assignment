package QuestionOne.methods_in_java.methods;

import java.util.Scanner; //Scanner import

public class Methods {

    // main method
    public static void main(String[] args) {

        // variables
        double firstnumber, secondnumber, thirdnumber, smallnum, largenum;

        Scanner input = new Scanner(System.in);// scanner object

        
        System.out.println("\nEnter the first number: ");
        firstnumber = input.nextInt(); // input first number
        System.out.println("Enter the second number: ");
        secondnumber = input.nextInt(); // input second number
        System.out.println("Enter the third number: ");
        thirdnumber = input.nextInt(); // input third number

        // get return values fom the methods
        smallnum = smallNum(firstnumber, secondnumber, thirdnumber);
        largenum = largeNum(firstnumber, secondnumber, thirdnumber);

        // output
        System.out.println("\nThe smallest number: " + smallnum);
        System.out.println("The largest number: " + largenum);
        System.out.println(largenum + " is your largest and " + smallnum + " is the smallest number.");
    }

    // get the smallest number
    static double smallNum(double num_1, double num_2, double num_3) {

        if (num_1 < num_2) {
            if (num_1 < num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 < num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    // get largest number
    static double largeNum(double num_1, double num_2, double num_3) {

        // get largest number
        if (num_1 > num_2) {
            if (num_1 > num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 > num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    
}
