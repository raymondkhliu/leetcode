package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/check-if-it-is-a-straight-line/ */
public class L1232CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int deltaX = coordinates[1][0] - coordinates[0][0];
        int deltaY = coordinates[1][1] - coordinates[0][1];
        if (deltaX == 0) {
            for (int i = 2; i < coordinates.length; ++i) {
                if (coordinates[i][0] != coordinates[0][0]) {
                    return false;
                }
            }
            return true;
        }
        for (int i = 2; i < coordinates.length; ++i) {
            int expectedY =
                    (coordinates[i][0] - coordinates[0][0]) * deltaY / deltaX + coordinates[0][1];
            if (expectedY != coordinates[i][1]) {
                return false;
            }
        }
        return true;
    }
}
