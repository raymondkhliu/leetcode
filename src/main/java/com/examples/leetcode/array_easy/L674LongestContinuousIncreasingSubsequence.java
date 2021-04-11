package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/longest-continuous-increasing-subsequence/ */
public class L674LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int largest = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] <= nums[i - 1]) {
                if (i - current > largest) {
                    largest = i - current;
                }
                current = i;
            }
        }
        return Math.max(largest, nums.length - current);
    }
}
