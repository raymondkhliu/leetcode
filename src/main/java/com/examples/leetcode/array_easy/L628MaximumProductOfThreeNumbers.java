package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/maximum-product-of-three-numbers/ */
public class L628MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        int[] counts = new int[2001];
        for (int i : nums) {
            ++counts[i + 1000];
        }
        for (int i = 1; i < 2001; ++i) {
            counts[i] += counts[i - 1];
        }
        int[] ints = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; --i) {
            ints[counts[nums[i] + 1000] - 1] = nums[i];
            --counts[nums[i] + 1000];
        }
        int value;
        if (ints[ints.length - 1] >= 0) {
            value = Math.max(ints[0] * ints[1], ints[ints.length - 3] * ints[ints.length - 2]);
        } else {
            value = Math.min(ints[0] * ints[1], ints[ints.length - 3] * ints[ints.length - 2]);
        }

        return value * ints[ints.length - 1];
    }

    public int maximumProduct2(int[] nums) {
        Arrays.sort(nums);
        return Math.max(
                nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

    public int maximumProduct3(int[] nums) {
        int biggest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > third) {
                if (num > second) {
                    third = second;
                    if (num > biggest) {
                        second = biggest;
                        biggest = num;
                    } else {
                        second = num;
                    }
                } else {
                    third = num;
                }
            }
            if (num < smallest2) {
                if (num < smallest) {
                    smallest2 = smallest;
                    smallest = num;
                } else {
                    smallest2 = num;
                }
            }
        }
        return Math.max(biggest * second * third, smallest * smallest2 * biggest);
    }
}
