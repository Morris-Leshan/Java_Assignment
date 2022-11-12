package task1;

import java.util.Scanner; //importing Scanner

public class QuestionTwo {

    //this method calculates the avg
    static double findAverage(double unitA, double unitB, double unitC, double unitD, double unitE) {

        // finding the avg
        double avg;
        avg = (unitA + unitB + unitC + unitD + unitE) / 5;

        // rounding the avg
        var AVG = Math.round(avg * 100.0) / 100.0;

        return AVG;
    }

    //main method
    public static void main(String[] args) {

        // my scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for the units of last semester :");

        // getting the marks in each unit
        System.out.println("Unit 1 : ");
        double unit_1;
        unit_1 = input.nextDouble();
        System.out.println("Unit 2 : ");
        double unit_2;
        unit_2 = input.nextDouble();
        System.out.println("Unit 3 : ");
        double unit_3;
        unit_3 = input.nextDouble();
        System.out.println("Unit 4 : ");
        double unit_4;
        unit_4 = input.nextDouble();
        System.out.println("Unit 5 : ");
        double unit_5;
        unit_5 = input.nextDouble();

        // calling findAverage method and putting the return value in variable avg
        double avg = findAverage(unit_1, unit_2, unit_3, unit_4, unit_5);

        System.out.println("\nYour avg mark is : " + avg);
    }
}
