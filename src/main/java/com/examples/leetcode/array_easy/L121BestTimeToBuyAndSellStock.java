package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ */
public class L121BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = prices[0];
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] < start) {
                start = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - start);
            }
        }
        return profit;
    }

    public int maxProfit2(int[] prices) {
        int largest = 0;
        int buy = prices[0];
        int current;
        for (int i = 1; i < prices.length; ++i) {
            current = prices[i];
            if (current < buy) {
                buy = current;
            } else {
                largest = Math.max(largest, current - buy);
            }
        }
        return largest;
    }
}
