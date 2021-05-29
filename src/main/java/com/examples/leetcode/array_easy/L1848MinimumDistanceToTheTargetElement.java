package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/minimum-distance-to-the-target-element */
public class L1848MinimumDistanceToTheTargetElement {
    public int getMinDistance(int[] nums, int target, int start) {
        if (nums[start] == target) {
            return 0;
        }
        for (int i = 1; i < nums.length; ++i) {
            if (start - i > -1 && nums[start - i] == target) {
                return i;
            } else if (start + i < nums.length && nums[start + i] == target) {
                return i;
            }
        }
        return 0;
    }
}
