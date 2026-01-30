package basic;

import java.util.Arrays;

public class CompareArrayTest {

    public static boolean compareArrayAfterSorting(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        // sort array
        sortArray(arr1);
        sortArray(arr2);

        System.out.println("After sorting array arr1" + Arrays.toString(arr1));
        System.out.println("After sorting array arr2" + Arrays.toString(arr2));

        //compare using sorted array
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {6, 5, 4, 3, 2, 1};
        System.out.println(compareArrayAfterSorting(arr1, arr2));
    }
}
