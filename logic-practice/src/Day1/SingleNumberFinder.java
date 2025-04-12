package Day1;

public class SingleNumberFinder {

    /**
     * Finds the single number in an array where every other number appears twice.
     *
     * @param nums The input array.
     * @return The single number.
     */
    public static int findSingleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // XOR each number
        }

        return result;
    }

}
