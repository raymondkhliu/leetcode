package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/ */
public class L1013PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int j : arr) {
            total += j;
        }
        if (total % 3 != 0) {
            return false;
        }
        total /= 3;
        int sum = 0;
        int count = 0;
        for (int i : arr) {
            if ((sum += i) == total) {
                sum = 0;
                if (++count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
