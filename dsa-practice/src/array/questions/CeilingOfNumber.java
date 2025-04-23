package array.questions;

/**
 * Problem: Ceiling of the target number in given sorted array.
 * The ceiling of a number is the smallest integer that is greater than or equal to that number.
 * Examples:
 *      The ceiling of 4.3 is 5
 *      The ceiling of 7 is 7 (because it’s already an integer)
 *      The ceiling of -2.8 is -2 (still the smallest integer ≥ -2.8)
 */
public class CeilingOfNumber {
    public static int ceilingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }

            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;

            }
        }

        return arr[start];
    }

    public static int floreOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[start]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            }

            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;

            }
        }

        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {4, 67, 78, 98, 101};
        System.out.println(ceilingOfNumber(arr, 1));
        System.out.println(floreOfNumber(arr, 111));
    }
}
