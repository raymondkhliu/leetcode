package com.examples.leetcode.tree_easy;

import java.util.Arrays;

public class L242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr, arr2);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[26];
        for (char s1 : s.toCharArray()) {
            ++letters[s1 - 'a'];
        }
        for (char t1 : t.toCharArray()) {
            if (--letters[t1 - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
