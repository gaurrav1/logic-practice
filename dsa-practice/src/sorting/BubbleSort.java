package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {

        int length = arr.length;
        for (int pass=0; pass<length; pass++) {
            boolean swapped = false;
            for (int index=1; index<length-pass; index++) {
                if (arr[index] < arr[index-1]) {
                    int temp = arr[index];
                    arr[index] = arr[index-1];
                    arr[index-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-5, -34, 0, 56, 1, 340};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
