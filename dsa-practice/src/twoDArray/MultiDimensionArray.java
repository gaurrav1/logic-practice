package twoDArray;
public class MultiDimensionArray {
    public static void multiDimensionalArray(int rows, int columns) {

        int[][] nums = new int[rows][columns];
         int[][] nums2 = {
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
         };

//       > Jagged array
        int[][] nums3 = new int[rows][];
        nums3[0] = new int[4];
        nums3[1] = new int[5];
        nums3[2] = new int[6];
        nums3[3] = new int[7];

        for (int raw=0; raw<rows; raw++) {
            for (int element=0; element<columns; element++) {
                nums[raw][element] = (int) (Math.random() * 100);
            }
            System.out.println();
        }

        for (int[] raw : nums) {
            for (int num : raw) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}