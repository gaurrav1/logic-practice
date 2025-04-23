package array.questions;

//Question:  Search the element in infinite array.(Assume you dont know the length of the array)
public class InfiniteArraySearch {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            if (end > arr.length-1) {
                end = arr.length - 1;
            } // Note that in real interview question there would be API for infinite array, and since we dont have infinite array, we need to handle ArrayIndexOutOfBound, There is no role of arr.length here in solution.
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 7, 10, 15, 20, 40, 56, 78, 101, 156, 167, 200, 267, 500, 1000, 2025};
        System.out.println(search(arr, 2025));
    }
}
