package com.examples.leetcode.array_easy;

import java.util.Arrays;

/** https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/ */
public class L167TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] >= target) {
                return null;
            }
            int other = target - numbers[i];
            int index = Arrays.binarySearch(numbers, other);
            if (index > 0) {
                ret[0] = i + 1;
                if (index == i) {
                    ++index;
                }
                ret[1] = index + 1;
                break;
            }
        }
        return ret;
    }
}
