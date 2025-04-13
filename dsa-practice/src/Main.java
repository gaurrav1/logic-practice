import array.*;
public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 7, 1, 9},
                {45, 76, 13},
                {100, 200, 300, 400, 500}
        };
        boolean isFound = LinearSearch.linearSearchIn2DArray(arr, 12);
        if (isFound){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    }
}