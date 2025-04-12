package Day1;

public class PalindromeChecker {

    /**
     * Checks if a given string is a valid palindrome after
     * removing non-alphanumeric characters and ignoring cases.
     *
     * @param input The input string.
     * @return true if it's a palindrome, false otherwise.
     */
    public static boolean isCleanPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            // Move left pointer to next valid character
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }

            // Move right pointer to previous valid character
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            // Compare characters in lowercase
            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

}
