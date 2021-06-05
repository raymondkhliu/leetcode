package com.examples.leetcode.tree_easy;

import java.util.HashSet;
import java.util.Set;

/** https://leetcode.com/problems/word-pattern/submissions/ */
public class L290WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] arr2 = s.split(" ");
        if (arr2.length != pattern.length()) {
            return false;
        }
        String[] strings = new String[26];
        char[] arr = pattern.toCharArray();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            if (strings[arr[i] - 'a'] == null) {
                strings[arr[i] - 'a'] = arr2[i];
                if (!set.add(arr2[i])) {
                    return false;
                }
            } else if (!strings[arr[i] - 'a'].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
