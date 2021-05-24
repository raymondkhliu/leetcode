package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/maximum-number-of-balls-in-a-box/submissions/ */
public class L1742MaximumNumberOfBallsInABox {
    public int countBalls(int lowLimit, int highLimit) {
        int[] nums = new int[46];
        int low = lowLimit;
        int ones = low % 10;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0;
        int tenThousands = 0;
        low /= 10;
        if (low > 0) {
            tens = low % 10;
            low /= 10;
            if (low > 0) {
                hundreds = low % 10;
                low /= 10;
                if (low > 0) {
                    thousands = low % 10;
                    low /= 10;
                    if (low > 0) {
                        tenThousands = low % 10;
                    }
                }
            }
        }
        for (int i = lowLimit + 1; i <= highLimit; ++i) {
            ++nums[ones + tens + hundreds + thousands + tenThousands];
            ++ones;
            if (i % 10 == 0) {
                ones = 0;
                ++tens;
                if (i % 100 == 0) {
                    tens = 0;
                    ++hundreds;
                    if (i % 1000 == 0) {
                        hundreds = 0;
                        ++thousands;
                        if (i % 10000 == 0) {
                            thousands = 0;
                            ++tenThousands;
                        }
                    }
                }
            }
        }
        ++nums[ones + tens + hundreds + thousands + tenThousands];
        int highest = Integer.MIN_VALUE;
        for (int num : nums) {
            highest = Math.max(highest, num);
        }
        return highest;
    }
}
