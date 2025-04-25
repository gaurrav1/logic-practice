package string.questions;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z]", "");
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Gaurav Vasani Hiii"));
        System.out.println(isPalindrome("Abcddcba"));
    }
}
