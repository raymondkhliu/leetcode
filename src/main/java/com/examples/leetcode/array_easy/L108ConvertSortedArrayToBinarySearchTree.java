package com.examples.leetcode.array_easy;


/** https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree */
public class L108ConvertSortedArrayToBinarySearchTree {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { value = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.value = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums,0,nums.length-1);
    }

    public TreeNode solve(int[] nums, int length, int height){
        if (length > height) {
            return null;
        }
        int mid = (length + height) / 2;
        TreeNode current = new TreeNode(nums[mid]);
        if (length == height) {
            return current;
        }
        current.left = solve(nums,length,mid-1);
        current.right = solve(nums,mid+1,height);
        return current;
    }
}
