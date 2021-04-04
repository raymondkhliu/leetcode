package com.examples.leetcode.array_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L830PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lists = new ArrayList<>();
        if (s.length() < 3) {
            return lists;
        }
        int start = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(start) != s.charAt(i)) {
                if (i - start > 2) {
                    lists.add(Arrays.asList(start, i - 1));
                }
                start = i;
            }
        }
        if (s.length() - start > 2) {
            lists.add(Arrays.asList(start, s.length() - 1));
        }
        return lists;
    }
}
