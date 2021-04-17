package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/ */
public class L1566DetectPatternOfLengthMRepeatedKOrMoreTimes {
    public boolean containsPattern(int[] arr, int m, int k) {
        int count = m;
        for (int i = m; i < arr.length; ++i) {
            if (arr[i] == arr[i - m]) {
                ++count;
            } else {
                count = m;
            }
            if (count == m * k) {
                return true;
            }
        }
        return false;
    }
}
