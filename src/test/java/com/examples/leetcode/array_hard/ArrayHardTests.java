package com.examples.leetcode.array_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayHardTests {

    @Test
    public void testL4MedianOfTwoSortedArrays() {
        int[] nums = {3, 9, 7, 3};
        int[] nums2 = {3, 9, 7, 3};
        double res = new L4MedianOfTwoSortedArrays().findMedianSortedArrays(nums, nums2);
        Assert.assertEquals(res, 2);
    }

    @Test
    public void testL2035PartitionArrayIntoTwoArraysToMinimizeSumDifference() {
        int[] nums = {3, 9, 7, 3};
        int res = new L2035PartitionArrayIntoTwoArraysToMinimizeSumDifference().minimumDifference(nums);
        Assert.assertEquals(res, 2);
    }
}
