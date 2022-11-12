package task1;

//Scanner import
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {

        //Scanner object
        Scanner input = new Scanner(System.in);

        String sir_name;
        String number_type;
        int age;
        int number_of_letters;

        //input data
        System.out.println("Enter your sir name :");
        sir_name = input.nextLine(); // input the name
        
        System.out.println("Enter your age :");
        age = input.nextInt(); // input the age

        // Finding number of letters in sir name
        number_of_letters = sir_name.length();

        // if age is even or odd... number_type
        if (age % 2 == 0) {
            number_type = "even";
        } else {
            number_type = "odd";
        }

        // Display output
        System.out.println("Your sir name has : " + number_of_letters + " characters");
        System.out.println("Your current age is an " + number_type + " number.");
    }
}