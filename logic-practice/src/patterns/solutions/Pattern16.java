package patterns.solutions;

public class Pattern16 {
    public static void printPattern(int totalRow) {
        for (int row = 1; row <= totalRow; row++) {

            for (int space = 1; space <= totalRow-row; space++) {
                System.out.print(" ");
            }

            int element = 1;
            for (int rowElement = 1; rowElement <= row; rowElement++) {
                System.out.print(element+" ");
                element = element * (row-rowElement) / rowElement;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
