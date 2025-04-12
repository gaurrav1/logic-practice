package Day1;

public class PyramidPrinter {

    /**
     * Prints a centered pyramid pattern of stars (*) for the given number of rows.
     *
     * @param rows Number of rows in the pyramid.
     */
    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars: (2 * i - 1) stars per row
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
