package com.examples.leetcode.tree_easy;

import java.util.Iterator;
import java.util.List;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode deserialize(Iterator<Integer> list) {
        if (!list.hasNext()) {
            return null;
        }
        Integer value = list.next();
        if (value == null) {
            return null;
        }
        TreeNode node = new TreeNode(value);
        node.left = deserialize(list);
        node.right = deserialize(list);
        return node;
    }

    public void serialize(TreeNode input, List<Integer> list) {
        if (input == null) {
            list.add(null);
            return;
        }
        list.add(input.val);
        serialize(input.left, list);
        serialize(input.right, list);
    }
}
