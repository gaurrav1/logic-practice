package recursion.theory;

public class BinarySearch {

    // Make sure you are returning while recursive calling. or else returned answer will not be considered to return it to parent call.
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        }
        if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -5, -3, 0, 1, 4, 17};
        System.out.println(binarySearch(arr, 1, 0, arr.length - 1));
    }
}
