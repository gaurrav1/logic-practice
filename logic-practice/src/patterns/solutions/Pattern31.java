package patterns.solutions;

//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4
public class Pattern31 {

//    public static void printPattern(int totalRow) {
//        for (int row = 1; row <= 2*totalRow-1; row++) {
//            int col = (row < totalRow) ? row : (totalRow-(row%totalRow));
//            for (int rowElement = 1; rowElement < col; rowElement++) {
//                System.out.print(rowElement + " ");
//            }
//            for (int rowElement = 2; rowElement <= 2 * (totalRow-col+1) - 1; rowElement++) {
//                System.out.print(col + " ");
//            }
//            for (int rowElement = col; rowElement >= 1; rowElement--) {
//                System.out.print(rowElement + " ");
//            }
//            System.out.println();
//        }
//    }

    public static void printPattern(int totalRow) {
        int originalRow = totalRow;
        totalRow = totalRow * 2;
        for (int row = 0; row <= totalRow; row++) {
            for (int col = 0; col <= totalRow; col++) {
                int atEveryIndex = originalRow - Math.min(Math.min(row, col), Math.min(totalRow - row, totalRow - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
