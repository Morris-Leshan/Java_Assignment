package task1;

//Sannner import
import java.util.Scanner;

public class QuestionThree {


        // the main method
        public static void main(String[] args) {

            // Scanner object
            Scanner input = new Scanner(System.in);
    
            int numToTest;
            // getting input
            System.out.println("Enter any number to test it's divisibility :");
            numToTest = input.nextInt();
    
            // calling the methods
            testDivisibilityBy0(numToTest);
            testDivisibilityBy1(numToTest);
            testDivisibilityBy2(numToTest);
            testDivisibilityBy3(numToTest);
            testDivisibilityBy4(numToTest);
            testDivisibilityBy5(numToTest);
            testDivisibilityBy6(numToTest);
            testDivisibilityBy7(numToTest);
            testDivisibilityBy8(numToTest);
            testDivisibilityBy9(numToTest);
        }

    // The method is for testing divisibility by 0
    static void testDivisibilityBy0(int inputNumber) {
        System.out.println(inputNumber + " cannot be divisible by 0.");
    }

    // The method is for testing divisibility by 1
    static void testDivisibilityBy1(int inputNumber) {
        System.out.println(inputNumber + " is divisible by 1.");
    }

    // The method is for testing divisibility by 2
    static void testDivisibilityBy2(int inputNumber) {
        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is divisible by 2.");
        } else {
            System.out.println(inputNumber + " is not divisible by 2.");
        }
    }

    // The method is for testing divisibility by 3
    static void testDivisibilityBy3(int inputNumber) {
        if ((inputNumber % 3) == 0) {
            System.out.println(inputNumber + " is divisible by 3");
        } else {
            System.out.println(inputNumber + " is not divisible by 3");
        }
    }

    // The method is for testing divisibility by 4
    static void testDivisibilityBy4(int inputNumber) {
        if ((inputNumber % 4) == 0) {
            System.out.println(inputNumber + " is divisible by 4");
        } else {
            System.out.println(inputNumber + " is not divisible by 4");
        }
    }

    // The method is for testing divisibility by 5
    static void testDivisibilityBy5(int inputNumber) {
        if ((inputNumber % 5) == 0) {
            System.out.println(inputNumber + " is divisible by 5");
        } else {
            System.out.println(inputNumber + " is not divisible by 5");
        }
    }

    // The method is for testing divisibility by 6
    static void testDivisibilityBy6(int inputNumber) {
        if ((inputNumber % 6) == 0) {
            System.out.println(inputNumber + " is divisible by 6");
        } else {
            System.out.println(inputNumber + " is not divisible by 6");
        }
    }

    // The method is for testing divisibility by 7
    static void testDivisibilityBy7(int inputNumber) {
        if ((inputNumber % 7) == 0) {
            System.out.println(inputNumber + " is divisible by 7");
        } else {
            System.out.println(inputNumber + " is not divisible by 7");
        }
    }

    // The method is for testing divisibility by 8
    static void testDivisibilityBy8(int inputNumber) {
        if ((inputNumber % 8) == 0) {
            System.out.println(inputNumber + " is divisible by 8");
        } else {
            System.out.println(inputNumber + " is not divisible by 8");
        }
    }

    // The method is for testing divisibility by 9
    static void testDivisibilityBy9(int inputNumber) {
        if ((inputNumber % 9) == 0) {
            System.out.println(inputNumber + " is divisible by 9");
        } else {
            System.out.println(inputNumber + " is not divisible by 9");
        }
    }


}
