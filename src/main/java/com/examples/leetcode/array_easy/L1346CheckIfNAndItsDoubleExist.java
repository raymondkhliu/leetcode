package com.examples.leetcode.array_easy;

import java.util.HashSet;
import java.util.Set;

/** https://leetcode.com/problems/check-if-n-and-its-double-exist/ */
public class L1346CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public boolean checkIfExist2(int[] arr) {
        int zeros = 0;
        for (int i : arr) {
            if (i == 0 && ++zeros > 1) {
                return true;
            }
            for (int j : arr) {
                if (i == j * 2 && i != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
