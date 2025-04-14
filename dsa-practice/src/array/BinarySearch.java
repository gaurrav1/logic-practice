package array;

public class BinarySearch {

    public static boolean isAscending(int[] arr) {
        return arr[0] < arr[arr.length - 1];
    }

    public static int binarySearch(int[] arr, int target, boolean isAscending) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // If you do: (start + end) / 2, Int may exceed range

            if (arr[mid] == target) {
                return mid;
            }
            if(isAscending) {
                if (arr[mid] > target) {
                    end = mid - 1;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                }
                if (arr[mid] > target) {
                    start = mid + 1;
                }
            }

        }
        return Integer.MIN_VALUE;
    }


    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        boolean isAscending = isAscending(arr);
        return binarySearch(arr, target, isAscending);
    }

    public static void main(String[] args) {
        int[] arr = {167, 64, 34, 11, 0, -1, -3, -16, -18, -110};
        System.out.println(orderAgnosticBinarySearch(arr, 11));
    }
}
