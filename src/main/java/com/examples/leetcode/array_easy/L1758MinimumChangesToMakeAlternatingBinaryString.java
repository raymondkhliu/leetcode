package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/ */
public class L1758MinimumChangesToMakeAlternatingBinaryString {
    public int minOperations(String s) {
        char[] nums = s.toCharArray();
        int zero = 0;
        int one = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] == '1') {
                ++one;
            } else {
                ++zero;
            }
        }
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] == '0') {
                ++one;
            } else {
                ++zero;
            }
        }
        return Math.min(zero, one);
    }
}
