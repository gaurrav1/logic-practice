package patterns.solutions;

public class Pattern3 {
    public static void printPattern(int totalRow) {
        for (int row = 1; row <= totalRow; row++) {
            for (int rowElement = 1; rowElement <= totalRow-row+1; rowElement++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
