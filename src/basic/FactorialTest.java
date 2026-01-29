package basic;

/**
 * Negative Numbers: Factorials are undefined for negative integers.
 * Base Cases:0!=1 &
 * 1!=1.
 * first 15-16 natural factorial is good using int but further no is failing due to int limit, sometime it return 0 or negative no -288522240
 */
// \(n!=n\times (n-1)\times (n-2)\times ...\times 1\)
public class FactorialTest {

    //finding factorial
    public static int findFactorialOf(int n) {
        if (n == 1) {
            return 1;
        }
        return n * findFactorialOf(n - 1);
    }

    public static int findFactorialOfWithLoop(int n) {

        if (n <= 1) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
//            fact= fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {

//        System.out.println(findFactorialOf(10));
        System.out.println(findFactorialOfWithLoop(16));
        System.out.println(findFactorialOfWithLoop(17)); //& above not efficient due int limit return 0;

        //TODO then use big integer


    }
}
