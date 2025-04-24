package string;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }
        // Problem with this is It is creating new object of String every time changes occurs.
        // ["a", "ab", "abc", "abcd", ...., "abcd..vwxy"] are get wasted, only last change we are using.
        // Waste of O(N2) memory.
        System.out.println(series);
    }
}
