package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) { // N-2
            for (int j = i+1; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {87, 3, 67, 101, 11, 34, 1, -56};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
