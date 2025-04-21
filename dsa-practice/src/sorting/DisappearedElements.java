package sorting;

import java.util.ArrayList;
import java.util.List;

// 448. Find All Numbers Disappeared in an Array - Google question.
//  Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//  Example 1:
//  Input: nums = [4,3,2,7,8,2,3,1]
//  Output: [5,6]
//
//  Example 2:
//  Input: nums = [1,1]
//  Output: [2]
public class DisappearedElements {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        CyclicSort.cyclicSort(nums);
        List<Integer> disappeared = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                disappeared.add(i + 1);
            }
        }
        return disappeared;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
