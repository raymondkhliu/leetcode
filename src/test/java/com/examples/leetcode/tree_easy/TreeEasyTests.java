package com.examples.leetcode.tree_easy;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TreeEasyTests {

    @Test
    public void testL94BinaryTreeInorderTraversal() {
        TreeNode root = TreeNode.deserialize(Arrays.asList(1, null, 2, 3).iterator());
        List<Integer> res = new L94BinaryTreeInorderTraversal().inorderTraversal(root);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        Assert.assertEquals(res, expected);
    }

    @Test
    public void testL136SingleNumber() {
        int[] arr = {4, 1, 2, 1, 2};
        int res = new L136SingleNumber().singleNumber2(arr);
        Assert.assertEquals(res, 4);
    }

    @Test
    public void testL202HappyNumber() {
        int num = 7;
        boolean res = new L202HappyNumber().isHappy(num);
        Assert.assertEquals(res, true);
    }

    @Test
    public void testL204CountPrimes() {
        int num = 3;
        int res = new L204CountPrimes().countPrimes(num);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testL205IsomorphicStrings() {
        String s = "paper";
        String t = "title";
        boolean res = new L205IsomorphicStrings().isIsomorphic(s, t);
        Assert.assertEquals(res, true);
    }

    @Test
    public void testL242ValidAnagram() {
        String s = "a";
        String t = "ab";
        boolean res = new L242ValidAnagram().isAnagram2(s, t);
        Assert.assertEquals(res, false);
    }

    @Test
    public void testL290WordPattern() {
        String pattern = "abba";
        String s = "dog cat cat fish";
        boolean res = new L290WordPattern().wordPattern(pattern, s);
        Assert.assertEquals(res, false);
    }

    @Test
    public void testL349IntersectionOfTwoArrays() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] res = new L349IntersectionOfTwoArrays().intersection(nums1, nums2);
        int[] expected = {9, 4};
        Assert.assertEquals(res, expected);
    }
}
