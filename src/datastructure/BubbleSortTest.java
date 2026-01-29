package datastructure;

import java.util.Arrays;

/**
 * two nested loop to compare and swap each element to right most
 * if (arr[i] < arr[i + 1]) { //Descending
 * if (arr[i] > arr[i + 1]) { //Ascending
 */
//TODO optimize sorting using break
public class BubbleSortTest {

    public static int[] sortArrayUsingBubbleSort(int[] arr) {

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }
        return arr;
    }

    public static int[] sortArrayUsingBubbleSortDescending(int[] arr) {

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 5, 28, 9, 4, 1};
        System.out.println(Arrays.toString(sortArrayUsingBubbleSort(arr)));
        System.out.println(Arrays.toString(sortArrayUsingBubbleSortDescending(arr)));


    }
}
