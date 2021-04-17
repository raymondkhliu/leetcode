package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/plus-one/ */
public class L66PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; --i) {
            ++digits[i];
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}
