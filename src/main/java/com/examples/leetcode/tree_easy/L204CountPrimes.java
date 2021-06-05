package com.examples.leetcode.tree_easy;

public class L204CountPrimes {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        boolean[] nums = new boolean[n + 1];
        for (int i = 2; i < nums.length; ++i) {
            if (!nums[i]) {
                for (int j = i * 2; j < nums.length; j += i) {
                    nums[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; ++i) {
            if (!nums[i]) {
                ++count;
            }
        }
        return count;
    }
}
