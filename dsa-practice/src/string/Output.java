package string;

import java.util.Arrays;

public class Output {

    public static void main(String[] args) {

        // All println have different types(int, string, etc) to print using function overloading.
        // Underlying it uses .toString() method.
        System.out.println(56);
        System.out.println("Gaurav");
        System.out.println(Arrays.toString(new int[] {4, 5, 6}));

        String name = null;
        System.out.println(name);
    }
}
