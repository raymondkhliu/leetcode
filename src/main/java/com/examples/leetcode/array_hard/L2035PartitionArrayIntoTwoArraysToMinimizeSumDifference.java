package com.examples.leetcode.array_hard;

import java.util.ArrayList;
import java.util.List;

public class L2035PartitionArrayIntoTwoArraysToMinimizeSumDifference {
    public int minimumDifference(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        List<Integer> list = new ArrayList<>();
        format(nums, 0, 0, 0, list);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= list.size() / 2; i++) {
            ans = Math.min(ans, Math.abs(sum - list.get(i) - list.get(i)));
        }
        return ans;
    }

    private static void format(int[] nums, int i, int sum, int l, List<Integer> list) {
        if (l == nums.length / 2) {
            list.add(sum);
            return;
        }
        if (i == nums.length)
            return;
        format(nums, i + 1, sum + nums[i], l + 1, list);
        format(nums, i + 1, sum, l, list);
    }
}
