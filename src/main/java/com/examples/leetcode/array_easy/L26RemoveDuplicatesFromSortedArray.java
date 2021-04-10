package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */
public class L26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int pointer = 1;
        int current = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != current) {
                nums[pointer++] = nums[i];
                current = nums[i];
            }
        }
        return pointer;
    }
}
