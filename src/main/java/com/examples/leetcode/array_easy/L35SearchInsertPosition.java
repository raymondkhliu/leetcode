package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/search-insert-position/ */
public class L35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int position = Arrays.binarySearch(nums, target);
        if (position < 0) {
            return -(position + 1);
        }
        return position;
    }
}
