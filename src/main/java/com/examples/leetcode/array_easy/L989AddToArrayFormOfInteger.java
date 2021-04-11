package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/add-to-array-form-of-integer/ */
public class L989AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        for (int j : num) {
            sum = sum * 10 + j;
        }
        sum += k;
        List<Integer> list = new ArrayList<>();
        while (sum > 0) {
            list.add(0, sum % 10);
            sum /= 10;
        }
        return list;
    }

    public List<Integer> addToArrayForm2(int[] num, int k) {
        for (int i = num.length - 1; i > 0; --i) {
            if (k == 0) {
                break;
            }
            k += num[i];
            num[i] = k % 10;
            k /= 10;
        }
        List<Integer> list = new ArrayList<>();
        if (k != 0) {
            int length = (int) Math.log10(k) + 1;
            int[] mod = new int[length];
            for (int i = 0; i < length; ++i) {
                mod[length - i - 1] = k % 10;
                k /= 10;
            }
            for (int i = 0; i < length; ++i) {
                list.add(mod[i]);
            }
        }
        for (int i : num) {
            list.add(i);
        }
        return list;
    }
}
