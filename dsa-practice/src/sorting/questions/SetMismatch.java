package sorting.questions;

import sorting.CyclicSort;

import java.util.Arrays;

// 645. Set Mismatch
// https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        CyclicSort.cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
