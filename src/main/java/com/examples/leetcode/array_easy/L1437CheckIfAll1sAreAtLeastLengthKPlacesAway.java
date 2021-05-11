package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/submissions/ */
public class L1437CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                index = i;
                break;
            }
        }
        for (int i = index + 1; i < nums.length; ++i) {
            if (nums[i] == 1) {
                if (count < k) {
                    return false;
                }
                count = 0;
            } else {
                ++count;
            }
        }
        return true;
    }
}
