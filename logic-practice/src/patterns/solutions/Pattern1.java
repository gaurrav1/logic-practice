package patterns.solutions;

public class Pattern1 {

    public static void printPattern(int totalRow) {
        for (int row = 1; row <= totalRow; row++) {
            for (int rowElement = 1; rowElement <= totalRow; rowElement++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
