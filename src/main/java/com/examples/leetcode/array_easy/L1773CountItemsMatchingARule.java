package com.examples.leetcode.array_easy;

import java.util.List;

/** https://leetcode.com/problems/count-items-matching-a-rule/ */
public class L1773CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int type;
        if (ruleKey.equals("type")) {
            type = 0;
        } else if (ruleKey.equals("color")) {
            type = 1;
        } else {
            type = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            if (item.get(type).equals(ruleValue)) {
                ++count;
            }
        }
        return count;
    }
}
