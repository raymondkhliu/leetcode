package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/sum-of-unique-elements/submissions/ */
public class L1752CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int drop = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i - 1]) {
                ++drop;
                if (drop > 1) {
                    return false;
                }
            }
        }
        if (drop == 1) {
            return nums[nums.length - 1] <= nums[0];
        }
        return true;
    }
}
