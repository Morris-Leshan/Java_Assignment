package task1;

import java.util.Scanner; //importing Scanner

public class QuestionFive {
    // This method is to perform the calculations
    static void operations(double first_num, double second_num, char myOperator) {

        Double result; // for storing the results

        switch (myOperator) {
            // addition
            case '+':
                result = first_num + second_num;
                System.out.println("The result is: " + result);
                break;

            // subtraction
            case '-':
                result = first_num - second_num;
                System.out.println("The result is: " + result);
                break;

            // multiplication
            case '*':
                result = first_num * second_num;
                System.out.println("The result is: " + result);
                break;

            // division
            case '/':
                result = first_num / second_num;
                System.out.println("The result is: " + result);
                break;

            default:
                System.out.println("Seems you made a mistake somewhere. Try again.");
                break;
        }
    }

    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object

        System.out.println("Enter the first number");
        Double first_num;
        first_num = input.nextDouble(); // input first number

        // request the the myOperator from the user
        System.out.println("Enter one operator (such as: +, -, * or /): ");
        char myOperator;
        myOperator = input.next().charAt(0); // input the myOperator

        // request the second number from the user
        System.out.println("Enter second number");
        Double second_num;
        second_num = input.nextDouble(); // input second number

        operations(first_num, second_num, myOperator);
    }
}
