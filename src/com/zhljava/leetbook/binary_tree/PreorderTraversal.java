package com.zhljava.leetbook.binary_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 前序遍历
 */
public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    public void preOrder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        //先打印当前节点，然后打印左子树，最后再打印右子树
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
