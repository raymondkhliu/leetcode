package com.examples.leetcode.array_easy;

public class L1700NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int square = 0;
        for (int student : students) {
            square += student;
        }
        int circle = students.length - square;
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                --circle;
                if (circle == -1) {
                    return square;
                }
            } else {
                --square;
                if (square == -1) {
                    return circle;
                }
            }
        }
        return 0;
    }
}
