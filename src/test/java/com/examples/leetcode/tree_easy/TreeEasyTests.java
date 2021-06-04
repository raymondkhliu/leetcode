package com.examples.leetcode.tree_easy;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

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
        int arr = 7;
        boolean res = new L202HappyNumber().isHappy(arr);
        Assert.assertEquals(res, true);
    }
}
