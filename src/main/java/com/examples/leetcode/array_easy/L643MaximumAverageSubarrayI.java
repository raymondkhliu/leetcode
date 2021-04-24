package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-average-subarray-i/ */
public class L643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += nums[i];
        }
        int largest = sum;
        for (int i = k; i < nums.length; ++i) {
            sum += nums[i] - nums[i - k];
            largest = Math.max(largest, sum);
        }
        return largest / (double) k;
    }
}
