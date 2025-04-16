package array;

public class RotatedArrayBinarySearch {

    public static int searchForPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; // No pivot means array is not rotated
    }

    public static int searchForPivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start++]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end--]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[mid] == arr[end] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // No pivot means array is not rotated
    }

    public static int searchInRotatedArray(int[] arr, int target) {
        int pivot = searchForPivot(arr);

        if (pivot == -1) {
            // Array is not rotated, do normal binary search
            return BinarySearch.binarySearchInRange(arr, target, 0, arr.length - 1, true);
        }

        if (arr[pivot] == target) return pivot;

        if (target >= arr[0]) {
            return BinarySearch.binarySearchInRange(arr, target, 0, pivot, true);
        }

        return BinarySearch.binarySearchInRange(arr, target, pivot + 1, arr.length - 1, true);
    }

    public static void main(String[] args) {
        int[] arr = {-5, 10, 34, 56, 65, 1094, -456, -321, -101, -50, -10};
        System.out.println(searchInRotatedArray(arr, -321));
    }
}
