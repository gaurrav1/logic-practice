package array;

import java.util.Arrays;

/**
 * Question: Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * Return `k` after placing the final result in the first k slots of nums.
 * Example: Input - nums = [0, 1, 1, 1, 2, 2, 3]
 *          Output - 4
 */

public class RemoveDuplicate {

    // Approach - 1: Brute-Force Approach using Hash-Table.
    // Space Complexity: O(n)

    /**
     * Approach - 2: Two-Pointer Approach
     *      Space Complexity: O(1)
     *      Time Complexity : O(n)
     */
    public static int removeDuplicates(int[] nums) {
        // Numbers before `nums[prev]` will always be unique.
        int prev = 0;

        // `next` pointer traverse through sorted array.
        for (int next = 1; next < nums.length; next++) {
            // Prevent `prev` pointer from incrementing in case of non-unique number and swap nums[prev+1] and nums[next] in case of uniqueness.
            if (nums[prev] != nums[next]) {
                int temp = nums[prev+1];
                nums[prev+1] = nums[next];
                nums[next] = temp;
                prev++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return prev+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 4, 6, 7, 8, 10, 10, 10};
        System.out.println(removeDuplicates(nums));
    }
}
