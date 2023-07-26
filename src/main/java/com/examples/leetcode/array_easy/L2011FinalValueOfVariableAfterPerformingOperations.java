package com.examples.leetcode.array_easy;

/**https://leetcode.com/problems/final-value-of-variable-after-performing-operations/**/
public class L2011FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int index = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                ++index;
            } else {
                --index;
            }
        }
        return index;
    }
}
