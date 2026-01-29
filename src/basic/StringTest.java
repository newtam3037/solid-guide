package basic;

public class StringTest {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));

        }
        return sb.toString();
    }

    public static boolean checkIfStringIsPalindrome(String str) {

        return str.contentEquals(reverseString(str));
    }

    public static void main(String[] args) {

        System.out.println("Reverse string" + reverseString("Ashish"));
        System.out.println("Is Palindrome " + checkIfStringIsPalindrome("MADAM"));
    }
}
