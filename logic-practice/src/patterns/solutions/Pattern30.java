package patterns.solutions;

//30.          1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5
public class Pattern30 {
    public static void printPattern(int totalRow) {
        for (int row = 1; row <= totalRow; row++) {

            for (int space = 1; space <= totalRow-row; space++) {
                System.out.print("\t");
            }
            for (int rowElement = row; rowElement >= 1; rowElement--) {
                System.out.print(rowElement+"\t");
            }
            for (int rowElement = 2; rowElement <= row; rowElement++) {
                System.out.print(rowElement+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(6);
    }
}
