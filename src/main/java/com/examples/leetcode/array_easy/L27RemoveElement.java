package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/remove-element/ */
public class L27RemoveElement {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index + 1;
    }

    public int removeElement2(int[] nums, int val) {
        int index = nums.length - 1;
        for (int i = 0; i < index + 1; ++i) {
            if (nums[i] == val) {
                nums[i--] = nums[index--];
            }
        }
        return index + 1;
    }
}
