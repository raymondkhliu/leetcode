package com.examples.leetcode.array_easy;

import java.util.Iterator;
import java.util.LinkedHashSet;

/** https://leetcode.com/problems/contains-duplicate-ii/ */
public class L219ContainsDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
            if (set.size() > k) {
                Iterator<Integer> it = set.iterator();
                it.next();
                it.remove();
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        if (k == 0) {
            return false;
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < k && i < nums.length; ++i) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        for (int i = k; i < nums.length; ++i) {
            if (!set.add(nums[i])) {
                return true;
            }
            Iterator<Integer> iterator = set.iterator();
            iterator.next();
            iterator.remove();
        }
        return false;
    }
}
