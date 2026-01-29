package basic;

import java.util.ArrayList;
import java.util.List;

/**
 * The Fibonacci series is a sequence of numbers where each number (a "Fibonacci number") is the sum of the two preceding ones,
 * typically beginning with 0 and 1
 */
public class FibonacciTest {

    public static List<Integer> displayFibonacciSeriesForgivenNumber(int n, int firstTerm, int secondTerm) {

        System.out.println("Fibonacci series till " + n + " term");

        List<Integer> fibList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println(firstTerm + ", ");
            fibList.add(firstTerm);

            //compute the next term (sum of first 2)
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return fibList;


    }
    //TODO Que check if array is Fibonacci series or not

    public static void main(String[] args) {

//        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        System.out.println(displayFibonacciSeriesForgivenNumber(10, 0, 1));
    }
}
