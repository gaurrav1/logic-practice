package twoDArray;

import java.util.Arrays;

/*
    Question: Search in sorted matrix.
    Example:  {{1,2,3},{4,5,6},{7,8,9}}, target=7

*/
public class SortedMatrix {

    public static int[] binarySearch(int[][] matrix, int row, int col_start, int col_end, int target) {
        while (col_start <= col_end ) {
            int mid = col_start + (col_end - col_start)/2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                col_start = mid+1;
            } else {
                col_end = mid-1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length; // Matrix might be empty

        if (row == 1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;
        while (rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }

        if(target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1 , target);
        }

        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]){
            return binarySearch(matrix, rStart, cMid+1, col-1, target);
        }

        if(target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }

        if(target <= matrix[rStart+1][cMid+1]){
            return binarySearch(matrix, rStart+1, cMid+1, col-1, target);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(matrix, 5)));
    }
}
