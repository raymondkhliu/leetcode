package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** https://leetcode.com/problems/summary-ranges/ */
public class L228SumaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
        List<String> ret = new ArrayList<>();
        int start = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1] + 1) {
                if (start == i - 1) {
                    ret.add(String.valueOf(nums[start]));
                } else {
                    ret.add(nums[start] + "->" + nums[i - 1]);
                }
                start = i;
            }
        }
        if (start == nums.length - 1) {
            ret.add(String.valueOf(nums[start]));
        } else {
            ret.add(nums[start] + "->" + nums[nums.length - 1]);
        }
        return ret;
    }
}
