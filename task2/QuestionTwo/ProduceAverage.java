package QuestionTwo;

//importing Scanner
import java.util.Scanner;

public class ProduceAverage {

    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        double javaMarks, networkingMarks, mathMarks, average; // my variables

        System.out.println("Enter marks for : ");
        
        // input java marks
        System.out.println("Java Programming: ");
        javaMarks = input.nextInt(); 
        // input networking marks
        System.out.println("Networking: ");
        networkingMarks = input.nextInt(); 
        // input maths marks
        System.out.println("Maths: ");
        mathMarks = input.nextInt(); 

        // output
        System.out.println("\nMarks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathMarks);

        // compute the average
        average = (javaMarks + networkingMarks + mathMarks) / 3;

        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
