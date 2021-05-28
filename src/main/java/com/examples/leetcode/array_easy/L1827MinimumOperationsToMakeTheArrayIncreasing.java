package com.examples.leetcode.array_easy;

public class L1827MinimumOperationsToMakeTheArrayIncreasing {
    public int minOperations(int[] nums) {
        int count = 0;
        int expected = nums[0] + 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < expected) {
                count += expected - nums[i];
                expected++;
            } else {
                expected = nums[i] + 1;
            }
        }
        return count;
    }
}
