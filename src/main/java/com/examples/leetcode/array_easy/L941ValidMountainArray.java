package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/valid-mountain-array/ */
public class L941ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean increasing = true;
        for (int i = 1; i < arr.length; ++i) {
            if (increasing) {
                if (arr[i] <= arr[i - 1]) {
                    increasing = false;
                    if (arr[i] == arr[i - 1]) {
                        return false;
                    }
                }
            } else if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }
        return arr[arr.length - 1] < arr[arr.length - 2] && arr[0] < arr[1];
    }
}
