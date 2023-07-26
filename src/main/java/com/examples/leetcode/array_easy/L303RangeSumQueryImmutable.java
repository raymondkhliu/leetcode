package com.examples.leetcode.array_easy;

public class L303RangeSumQueryImmutable {
    int[] num;

    public void NumArray(int[] nums) {
        num = new int[nums.length + 1];
        for (int i = 1; i < nums.length; ++i) {
            num[i] += nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return num[right] - num[left];
    }
}
