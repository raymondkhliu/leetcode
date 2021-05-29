package com.examples.leetcode.array_easy;

public class L1854MaximumPopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for (int[] log : logs) {
            ++years[log[0] - 1950];
            --years[log[1] - 1950];
        }
        int largest = Integer.MIN_VALUE;
        int current = 0;
        int index = 0;
        for (int i = 0; i < years.length; ++i) {
            current += years[i];
            if (current > largest) {
                largest = current;
                index = i;
            }
        }
        return index + 1950;
    }
}
