package com.lzz.leetcode;

public class MaxDepth {

    public static int maxDepth(TreeNode root) {
        if(root != null){
            return depth(root.left , root.right)+1;
        }
        return 0;

    }

    public static int depth(TreeNode left, TreeNode right){
        if(left != null && right != null){
            return Math.max(1+depth(left.left, left.right),1+depth(right.left, right.right));
        }
        if(right == null && left != null){
            return 1+depth(left.left, left.right);
        }
        if (left == null &&right != null){
            return  1+depth(right.left, right.right);
        }
        return 0;
    }

    public static int maxDepth2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
//        TreeNode right = new TreeNode(1);
//        right.left = new TreeNode(4);
//        right.right = new TreeNode(5);
//        root.right = right;
        root.left = new TreeNode(3);
        System.out.println(maxDepth(root));
    }

}
