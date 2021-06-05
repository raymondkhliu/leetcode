package com.examples.leetcode.tree_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/intersection-of-two-arrays/submissions/ */
public class L349IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums = new int[1001];
        for (int k : nums1) {
            ++nums[k];
        }
        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (nums[i] != 0) {
                nums[i] = 0;
                list.add(i);
            }
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; ++i) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
