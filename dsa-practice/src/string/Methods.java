package string;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Gaurav Vasani Hiii Hahahahahaha :)";
        System.out.println(Arrays.toString(name.toCharArray()));
        name.length();
        name.toLowerCase();
        name.indexOf('g');
        System.out.println("    G   a   u  rav".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
