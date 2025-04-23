package array.questions;

import java.util.Arrays;

public class RepeatingRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        result[0] = continuousBinarySearch(nums, target, true);
        if (result[0] != -1) {
            result[1] = continuousBinarySearch(nums, target, false);
        }
        return result;
    }

    public static int continuousBinarySearch(int[] arr, int target, boolean isSearchLeft) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isSearchLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 6, 6, 6, 6, 10 };
        System.out.println(Arrays.toString(searchRange(arr, 6)));
    }
}
