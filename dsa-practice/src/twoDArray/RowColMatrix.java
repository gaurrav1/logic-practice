package twoDArray;

import java.util.Arrays;

/*
    Question: Search in raw-wise and column-wise sorted matrix.
    Example:
    {   {10, 20, 30, 40},
        {15, 25, 35, 45},
        {28, 29, 37, 49},
        {33, 34, 38, 50}    }, target=37

*/

public class RowColMatrix {
    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length-1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if(matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(matrix, 45)));
    }
}
