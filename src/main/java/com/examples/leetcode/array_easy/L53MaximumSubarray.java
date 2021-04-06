package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-subarray/ */
public class L53MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int num : nums) {
            max = Math.max(count += num, max);
            if (count < 0) {
                count = 0;
            }
        }
        return max;
    }
}
