package com.examples.leetcode.array_easy;

public class L747LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int largest = 0;
        int second = -1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[largest]) {
                second = largest;
                largest = i;
            } else if (second == -1 || nums[i] > nums[second]) {
                second = i;
            }
        }
        if (nums[largest] >= nums[second] * 2) {
            return largest;
        }
        return -1;
    }

    public int dominantIndex2(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int largest = Math.max(nums[0], nums[1]);
        int second = Math.min(nums[0], nums[1]);
        for (int i = 2; i < nums.length; ++i) {
            if (nums[i] > nums[second]) {
                if (nums[i] > nums[largest]) {
                    second = largest;
                    largest = i;
                } else {
                    second = i;
                }
            }
        }
        if (nums[largest] >= nums[second] * 2) {
            return largest;
        }
        return -1;
    }
}
