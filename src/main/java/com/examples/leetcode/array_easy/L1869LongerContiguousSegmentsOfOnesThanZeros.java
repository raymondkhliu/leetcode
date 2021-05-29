package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/ */
public class L1869LongerContiguousSegmentsOfOnesThanZeros {
    public boolean checkZeroOnes(String s) {
        char[] letters = s.toCharArray();
        int[] count = new int[2];
        int current = 1;
        for (int i = 1; i < letters.length; ++i) {
            if (letters[i] != letters[i - 1]) {
                count[letters[i - 1] - '0'] = Math.max(count[letters[i - 1] - '0'], current);
                current = 1;
            } else {
                ++current;
            }
        }
        int last = letters[letters.length - 1];
        count[last - '0'] = Math.max(count[last - '0'], current);
        return count[1] > count[0];
    }
}
