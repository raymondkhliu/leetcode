package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/binary-prefix-divisible-by-5/ */
public class L1018BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int num = 0;
        for (int j : A) {
            num = (num * 2 + j) % 5;
            list.add(num == 0);
        }
        return list;
    }
}
