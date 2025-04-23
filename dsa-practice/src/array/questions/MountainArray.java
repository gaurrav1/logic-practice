package array.questions;

import array.BinarySearch;

/** Question 1: Find peak index in mountain array.
 *  Question 2: Find target element in mountain array.
 */
public class MountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start < end ) {
            int mid = start + (end - start) /2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int searchInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);

        int firstTry = BinarySearch.binarySearchInRange(arr, target, 0, peak, true);
        if (firstTry != -1) return firstTry;

        return BinarySearch.binarySearchInRange(arr, target, peak + 1, arr.length - 1, false);

    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 13, 56, 34, 1};
        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(searchInMountainArray(arr, 7));
    }
}
