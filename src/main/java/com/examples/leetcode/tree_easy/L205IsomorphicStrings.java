package com.examples.leetcode.tree_easy;

/** https://leetcode.com/problems/isomorphic-strings/ */
public class L205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] characters = new int[256];
        boolean[] checked = new boolean[256];
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            if (characters[arr[i]] == 0) {
                characters[arr[i]] = arr2[i];
                if (checked[arr2[i]]) {
                    return false;
                } else {
                    checked[arr2[i]] = true;
                }
            } else if (characters[arr[i]] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
