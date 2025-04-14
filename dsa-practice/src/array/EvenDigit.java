package array;

// Problem: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array
// Given an array nums of integers, return how many of them contain an even number of digits.
public class EvenDigit {

    // Checking in array that how many elements have even numbers of digits.
    public static int hasEvenNumberOfDigits(int[] arr) {
        if (arr != null && arr.length != 0){
            int count = 0;
            for (int element: arr) {
                if(isEvenDigits(element)){
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    // Checking number that it contains even number of digits or not.
    public static boolean isEvenDigits(int num) {
        num = Math.abs(num);
        if (num == 0) return false;

        int digit = 0;
        while (num > 0) {
            num /= 10;
            digit++;
        }
        return digit % 2 == 0;
    }

    public static void main(String[] args) {
        int[] arr = {12,3454,12,6,7896,22};
        int[] arr2 = {12,-345,2,6,-7896};
        int[] arr3 = {555,901,482,1771};
        System.out.println(hasEvenNumberOfDigits(arr));
        System.out.println(hasEvenNumberOfDigits(arr2));
        System.out.println(hasEvenNumberOfDigits(arr3));
    }
}
