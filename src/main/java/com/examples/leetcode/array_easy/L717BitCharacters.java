package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/1-bit-and-2-bit-characters/ */
public class L717BitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        boolean rtn = true;
        for (int i = 0; i < bits.length; ++i) {
            rtn = bits[i] == 0;
            if (!rtn) {
                i++;
            }
        }
        return rtn;
    }
}
