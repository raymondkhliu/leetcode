package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/number-of-equivalent-domino-pairs/ */
public class L1128NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] nums = new int[100];
        for (int[] dominoe : dominoes) {
            if (dominoe[0] > dominoe[1]) {
                ++nums[dominoe[0] * 10 + dominoe[1]];
            } else {
                ++nums[dominoe[1] * 10 + dominoe[0]];
            }
        }
        int count = 0;
        for (int num : nums) {
            if (num > 1) {
                count += num * (num - 1) / 2;
            }
        }
        return count;
    }
}
