package com.examples.leetcode.tree_easy;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/binary-tree-inorder-traversal/ */
public class L94BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
    }
}
