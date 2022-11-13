package QuestionThree.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class Triangle {

    static double baseOfTheTriangle, heightOfTheTriangle, area;

    // input the baseOfTheTriangle and the heightOfTheTriangle
    void inputData() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base of the triangle: ");
        baseOfTheTriangle = input.nextDouble(); // store the input in baseOfTheTriangle
        System.out.println("Enter the height of the triangle: ");
        heightOfTheTriangle = input.nextDouble(); // store the input in heightOfTheTriangle
    }

    // find the area of the rectangle
    void findArea() {
        area = 1/2 * baseOfTheTriangle * heightOfTheTriangle;
    }

    // method to output area
    void outputResults() {
        System.out.println("The area of the triangle is: " + area);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static methods
        Triangle classObj = new Triangle();
        classObj.inputData();
        classObj.findArea();
        classObj.outputResults();
    }
}
