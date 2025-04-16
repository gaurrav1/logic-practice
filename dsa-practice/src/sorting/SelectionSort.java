package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int length = arr.length;
        for (int step = 0; step < length; step++) {
            int lastIndex = length - step - 1;
            int maxIndex = findMax(arr, lastIndex + 1);
            swap(arr, maxIndex, lastIndex);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findMax(int[] arr, int lastIndex) {
        int maxIndex = 0;
        for (int i = 1; i < lastIndex; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {-5, -34, 0, 56, 1, 340};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
