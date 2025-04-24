package patterns.solutions;

public class Pattern17 {
    public static void printPattern(int totalRow) {
        for (int row = 1; row <= 2*totalRow-1; row++) {

            int col = (row < totalRow) ? row : (totalRow-(row%totalRow));
            for (int space = 1; space <= totalRow-col; space++) {
                System.out.print("  ");
            }
            for (int rowElement = col; rowElement >= 1; rowElement--) {
                System.out.print(rowElement+" ");
            }
            for (int rowElement = 2; rowElement <= col; rowElement++) {
                System.out.print(rowElement+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(6);
    }
}
