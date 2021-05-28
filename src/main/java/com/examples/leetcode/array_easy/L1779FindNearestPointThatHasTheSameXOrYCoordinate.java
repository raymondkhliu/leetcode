package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/ */
public class L1779FindNearestPointThatHasTheSameXOrYCoordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int shortest = Integer.MAX_VALUE;
        int currentX;
        int currentY;
        int index = -1;
        for (int i = 0; i < points.length; ++i) {
            currentX = points[i][0];
            currentY = points[i][1];
            if (currentX == x || currentY == y) {
                int manhattanDistance = Math.abs(x - currentX) + Math.abs(y - currentY);
                if (manhattanDistance < shortest) {
                    shortest = manhattanDistance;
                    index = i;
                }
            }
        }
        return index;
    }

    public int nearestValidPoint2(int x, int y, int[][] points) {
        int shortest = Integer.MAX_VALUE;
        int currentX;
        int currentY;
        int index = -1;
        for (int i = 0; i < points.length; ++i) {
            if (points[i][0] == x || points[i][1] == y) {
                int manhattanDistance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (manhattanDistance < shortest) {
                    shortest = manhattanDistance;
                    index = i;
                }
            }
        }
        return index;
    }
}
