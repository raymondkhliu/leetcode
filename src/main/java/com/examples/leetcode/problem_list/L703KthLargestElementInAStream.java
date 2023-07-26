package com.examples.leetcode.problem_list;

import java.util.ArrayList;
import java.util.Arrays;

public class L703KthLargestElementInAStream {
    class KthLargest {
        ArrayList<Integer> list;
        int pos;

        public KthLargest(int k, int[] nums) {
            pos = k;
            Arrays.sort(nums);
            list = new ArrayList<>();
            for (int i = 0; i < nums.length; ++i) {
                list.add(nums[i]);
            }
        }

        public int add(int val) {
            int i = 0;
            while (!list.isEmpty()) {
                if (list.get(i) < val) {
                    list.add(i + 1, val);
                }
            }
            return list.get(pos);
        }
    }
}
