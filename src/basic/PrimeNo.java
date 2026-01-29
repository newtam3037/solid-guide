package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Zero is neither prime nor composite.
 * Since any number times zero equals zero, there are an infinite number of factors for a product of zero.
 * A composite number must have a finite number of factors.
 * <p>
 * prime numbers are whole numbers greater than 1 that have exactly two distinct positive factors:
 * 1 and themselves, meaning they can't be divided evenly by any other number.
 * Examples include 2, 3, 5, 7, 11, and 13;
 * the number 2 is the only even prime number,
 * while 0 & 1 is neither prime nor composite.
 */
// WAP to find the prime no b/w 0-N
// WAP to find the composite no b/w 0-N (viz)
public class PrimeNo {

    public static boolean checkIfNoIsPrimeOrNot(int n) {


        // neither prime nor composite
        if (n == 0 || n == 1) return false;
        // only even prime no
        if (n == 2) {
//            System.out.println(n + " is a prime no");
            return true;
        }
        //check only half of the range in which n lies if it's divisible or not
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
//        System.out.println(n + " is a prime no");
        return true;
    }

    public static boolean checkIfNoIsComposite(int n) {
        // 0,1 neither prime nor composite & 2 i s even prime no hence it is also not composite
        if (n <= 2) return false;

        //check only half of the range in which n lies if it's divisible or not
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return true;
        }
        return false;
    }

    public static List<Integer> findAllDivisibleFactorNo(int n) {
//        int[] arr = new int[n / 2]; NOt sure the size of array
//        if (n == 1) {
//            return List.of(1);
//        }
        List<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                factorList.add(i);
            }

        }
        factorList.add(n);//self divisible
        return factorList;
    }

    public static void main(String[] args) {

        //check if no is prime or not
        for (int i = 0; i < 100; i++) {
            boolean primeOrNot = checkIfNoIsPrimeOrNot(i);
            if (primeOrNot) {
//                System.out.println(i + " is a prime no");
            }
        }

        //check if no is composite or not
        for (int i = 0; i < 100; i++) {
            boolean ifNoIsComposite = checkIfNoIsComposite(i);
            if (ifNoIsComposite) {
//                System.out.println(i + " is a composite no");
            }
        }
        // instead of re-writing we can reuse prime logic it will count 0,1 as composite which is false
        //WRONG APPROACH depending on prime no check
       /* for (int i = 0; i < 100; i++) {
            boolean ifNoIsPrimeOrNot = checkIfNoIsPrimeOrNot(i);
            if (!ifNoIsPrimeOrNot) {
                System.out.println(i + " is a composite no");
            }
        }*/
        for (int i = 0; i < 100; i++) {
            List<Integer> allDivisibleFactorNo = findAllDivisibleFactorNo(i);
            System.out.println(i + "factor's are " + allDivisibleFactorNo);
        }


    }
}
