package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/submissions/ */
public class L914XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {
        int[] nums = new int[10001];
        for (int j : deck) {
            ++nums[j];
        }
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num != 0) {
                smallest = Math.min(smallest, num);
            }
        }
        for (int i = 2; i <= smallest; ++i) {
            boolean valid = true;
            for (int num : nums) {
                if (num != 0 && num % i != 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                return true;
            }
        }
        return false;
    }
}
