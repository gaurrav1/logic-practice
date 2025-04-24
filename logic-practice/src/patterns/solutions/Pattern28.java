package patterns.solutions;

public class Pattern28 {
    public static void printPattern(int totalRow) {
        for (int row = 1; row <= 2*totalRow-1; row++) {

            int totalCol = row < totalRow ? row : (totalRow-(row%totalRow));

            for (int space = 1; space <= totalRow-totalCol; space++) {
                System.out.print(" ");
            }

            for (int rowElement = 1; rowElement <= totalCol; rowElement++) {
                System.out.print(rowElement + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
