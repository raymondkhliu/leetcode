package com.examples.leetcode.array_easy;

/** https://leetcode.com/problems/merge-sorted-array/ */
public class L88MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums1, 0, nums1, n, m);
        int x = n;
        int y = 0;
        for (int i = 0; i < m + n; ++i) {
            if (y >= n || x < m + n && nums1[x] < nums2[y]) {
                nums1[i] = nums1[x];
                ++x;
            } else {
                nums1[i] = nums2[y];
                ++y;
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[nums1.length];
        int pointer = 0;
        int pointer2 = 0;
        for (int i = 0; i < m + n; ++i) {
            if (pointer2 >= n || pointer < m && nums1[pointer] < nums2[pointer2]) {
                nums3[i] = nums1[pointer];
                ++pointer;
            } else {
                nums3[i] = nums2[pointer2];
                ++pointer2;
            }
        }
        System.arraycopy(nums3, 0, nums1, 0, nums3.length);
    }
}
