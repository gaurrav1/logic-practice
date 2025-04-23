package array.questions;

/*
 * Leetcode: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 * Question: Find Smallest Letter Greater Than Target
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
 * Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
 *
 * Example 1:
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 * Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
 *
 * Example 2:
 * Input: letters = ["x","x","y","y"], target = "z"
 * Output: "x"
 * Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 */
public class SmallestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // If the char don't exist in array, start will always be ended up at letters.length and we have to reposition it to [0] index.
        // Not that if start get ended up in the middle of array, applying modulo will return same result.
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'v', 'x', 'y', 'y'};
        System.out.println(nextGreatestLetter(letters, 'z'));
    }
}
