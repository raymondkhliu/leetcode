package com.examples.leetcode.tree_easy;

/** https://leetcode.com/problems/single-number/ */
public class L136SingleNumber {
    public int singleNumber(int[] nums) {
        int[] count = new int[60002];
        for (int num : nums) {
            ++count[num + 30000];
        }
        for (int i = 0; i < count.length; ++i) {
            if (count[i] == 1) {
                return i - 30000;
            }
        }
        return 0;
    }

    public int singleNumber2(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            sum ^= nums[i];
        }
        return sum;
    }
}
