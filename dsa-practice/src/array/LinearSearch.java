package array;

public class LinearSearch {

    public static boolean isNotEmpty(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return false;
        }
        return true;
    }

    public static boolean isNotEmpty(int[][] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return false;
        }
        return true;
    }

    public static boolean linearSearchForArray(int[] arr, int target) {

        if (isNotEmpty(arr)){
            for (int element : arr) {
                if (element == target) {
                    return true;
                }
            }
        }

        return false; // Target not found
    }

    public static boolean linearSearchForString(String str, char target) {
        if (str == null || str.isEmpty()) {
            System.out.println("Array is empty or null.");
            return false;
        }
        for (char element : str.toCharArray()) {
            if (element == target) {
                return true;
            }
        }
        return false; // Target not found
    }

    public static boolean linearSearchForArrayInRange(int[] arr, int target, int start, int end) {
        if (isNotEmpty(arr)) {
            for (int index = start; index < end; index++) {
                int element = arr[index];
                if (element == target) {
                    return true;
                }
            }
        }
        return false; // Target not found
    }

    public static int linearSearchMinInArray(int[] arr) {

        if (isNotEmpty(arr)){
            int minimum = Integer.MAX_VALUE;
            for (int element : arr) {
                if (element < minimum) {
                    minimum = element;
                }
            }
            return minimum;
        }
        return Integer.MIN_VALUE;
    }

    public static boolean linearSearchIn2DArray(int[][] arr, int target) {

        if (isNotEmpty(arr)){
            for (int[] row : arr) {
                for (int element : row) {
                    if (element == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
