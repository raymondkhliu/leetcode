package com.examples.leetcode.array_medium;


public class L152MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int negs = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= 0) {
                if (nums[i] == 0) {
                    int[] prev = new int[i];
                    System.arraycopy(nums, 0, prev, 0, i);
                    int[] post = new int[nums.length - i - 1];
                    System.arraycopy(nums, i + 1, post, 0, nums.length - i - 1);
                    return Math.max(0, Math.max(maxProduct(prev), maxProduct(post)));
                }
                ++negs;
            }
        }
        int ans = 1;
        if (negs % 2 == 0) {
            for (int num : nums) {
                ans *= num;
            }
        } else {
            int first = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] < 0) {
                    first = i;
                    break;
                }
            }
            int last = 0;
            for (int i = nums.length - 1; i >= 0; --i) {
                if (nums[i] < 0) {
                    last = i;
                    break;
                }
            }
            int left = 1;
            int right = 1;
            for (int i = 0; i < last; ++i) {
                left *= nums[i];
            }
            for (int i = first + 1; i < nums.length; ++i) {
                right *= nums[i];
            }
            ans = Math.max(right, left);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, -5, -2, -4, 3};
        System.out.println(maxProduct(nums));
    }
}
