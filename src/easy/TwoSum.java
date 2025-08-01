/**
 * Problem: 1 - Two Sum
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/two-sum/
 * 
 * Description:
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target. You may assume that each input would have exactly one
 * solution, and you may not use the same element twice.
 * 
 * Approach:
 * Use a HashMap to store the complement of each number as we iterate through the array.
 * For each number, check if its complement (target - current number) exists in the map.
 * If it exists, return the indices. If not, add the current number and its index to the map.
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(n) - HashMap can store up to n elements
 * 
 * @author IsfandiyorS
 * @date July 22, 2025
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if complement exists in the map
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            
            // Add current number and its index to the map
            numToIndex.put(nums[i], i);
        }
        
        // Should never reach here based on problem constraints
        return new int[]{};
    }
    
    // Test method
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Test Case 1: [2,7,11,15], target = 9
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "] Expected: [0, 1]");
        
        // Test Case 2: [3,2,4], target = 6
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "] Expected: [1, 2]");
        
        // Test Case 3: [3,3], target = 6
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "] Expected: [0, 1]");
        
        System.out.println("All test cases completed!");
    }
}
