package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/missing-number/ */
public class L268MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (nums.length * nums.length - 1) / 2 - sum;
    }

    public int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
