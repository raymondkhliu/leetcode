package com.examples.leetcode.tree_easy;

import java.util.HashSet;
import java.util.Set;

public class L202HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        int current = sum(n);
        while (set.add(current)) {
            current = sum(current);
            if (current < 9) {
                return current == 7 || current == 1;
            }
        }
        return current == 1;
    }

    public int sum(int n) {
        int sum = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
