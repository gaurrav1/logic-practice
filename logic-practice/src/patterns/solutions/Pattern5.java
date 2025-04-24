package patterns.solutions;

public class Pattern5 {
    public static void printPattern(int totalRow) {
        for (int row = 1; row <= 2*totalRow-1; row++) {

            int totalCol = row < totalRow ? row : (totalRow-(row%totalRow));

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
