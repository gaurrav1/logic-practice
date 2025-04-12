package Day2;

import java.util.HashMap;

/**
 * A utility class to solve the Two Sum problem.
 * Given an array of integers and a target value, this class
 * returns the indices of the two numbers that add up to the target.
 */
public class TwoSum {
    /**
     * Finds indices of two distinct numbers in the array that sum up to the given target.
     *
     * @param numbers The array of integers.
     * @param targetSum The target sum to find.
     * @return An array containing the indices of the two numbers.
     * @throws IllegalArgumentException If no valid pair is found (though the problem assumes one solution always exists).
     */
    public static int[] findTwoSum(int[] numbers, int targetSum) {
        HashMap<Integer, Integer> numberToIndexMap = new HashMap<>();

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            int currentNumber = numbers[currentIndex];
            int requiredNumber = targetSum - currentNumber;

            // Check if the required complement already exists in the map
            if (numberToIndexMap.containsKey(requiredNumber)) {
                // Return the index of the complement and the current index
                return new int[] { numberToIndexMap.get(requiredNumber), currentIndex };
            }

            // Store the current number with its index
            numberToIndexMap.put(currentNumber, currentIndex);
        }

        // If no pair found (should not happen based on the problem's constraints)
        throw new IllegalArgumentException("No two sum solution exists.");
    }
}

