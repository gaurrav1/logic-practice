package sorting.questions;

import java.util.ArrayList;
import java.util.List;

// 287. Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/description/

// 442. Find All Duplicates in an Array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class DuplicateElement {

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            if (nums[i] != i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int index=0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                res.add(nums[index]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 4, 3, 1, 2};
        System.out.println(findDuplicates(arr));
    }
}
