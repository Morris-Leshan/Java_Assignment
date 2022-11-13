package task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuestionFour {

    // main method
    public static void main(String[] args) {

        // This lis ot type Integer stores 71-150
        List<Integer> mainList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        mainList.add(150); // adding last item

        // calling my methods to print the output
        multiples2(mainList);
        multiples3(mainList);
        multiples7(mainList);
    }

    // This method returns a list of multiples of 2
    static void multiples2(List<Integer> mainList) {
        System.out.println("\n\n2 has the following multiples:");

        for (int i = 0; i <= mainList.size(); i++) {
            if (mainList.get(i) % 2 == 0) {
                System.out.println(mainList.get(i));
            }
             if (i == 150 - 71) {
                    break;
             }

        }
    }

    // This method returns a list of multiples of 3
    static void multiples3(List<Integer> mainList) {
        System.out.println("\n\n3 has the following multiples:");

        for (int i = 0; i <= mainList.size(); i++) {
            if (mainList.get(i) % 3 == 0) {
                System.out.println(mainList.get(i));
            }
             if (i == 150 - 71) {
                    break;
             }

        }
    }

    // This method returns a list of multiples of 7
    static void multiples7(List<Integer> mainList) {
        System.out.println("\n\n7  has the following multiples:");

        for (int i = 0; i <= mainList.size(); i++) {
            if (mainList.get(i) % 7 == 0) {
                System.out.println(mainList.get(i));
            }
            if (i == 150 - 71) {
                break;
            }
        }
    }
}
