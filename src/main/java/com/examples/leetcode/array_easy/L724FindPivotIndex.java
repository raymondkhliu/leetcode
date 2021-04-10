package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-pivot-index/ */
public class L724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            prefix[i + 1] = (sum += nums[i]);
        }
        for (int i = 1; i < prefix.length; ++i) {
            if (prefix[i - 1] == prefix[prefix.length - 1] - prefix[i]) {
                return i - 1;
            }
        }
        return -1;
    }

    public int pivotIndex2(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            nums[i] = (sum += nums[i]);
        }
        if (nums[nums.length - 1] == nums[0]) {
            return 0;
        }
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] == nums[nums.length - 1] - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
