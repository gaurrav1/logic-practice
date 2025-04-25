package string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);
        // This is same as after few steps: "a" + "1".
        // int will be converted to the Integer, that will call toString().

        System.out.println("Gaurav" + new ArrayList<Integer>());
        // '+' in Java is only applicable for primitives and String. At least one of expression should be String.
        // Ex. System.out.println("Gaurav" + new ArrayList<Integer>());
        // '+' is being overloaded for String concatenation.
    }
}
