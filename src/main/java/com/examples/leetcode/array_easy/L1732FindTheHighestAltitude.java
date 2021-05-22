package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-the-highest-altitude/ */
public class L1732FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int height = 0;
        int tallest = 0;
        for (int i : gain) {
            tallest = Math.max(tallest, height += i);
        }
        return tallest;
    }
}
