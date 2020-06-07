package com.lzz.leetcode;

/**
 * 镜像二叉树
 */
public class MirrorTree {

    public static TreeNode mirrorTree(TreeNode root) {
        if(root != null) {
            exchange(root);
        }
        return root;
    }

    public static void exchange(TreeNode root){

        TreeNode temp = root.left;
        root.left = root.right;
        root.right =temp;
        if(root.left != null){
            exchange(root.left);
        }
        if(root.right != null){
            exchange(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        mirrorTree(root);
    }
}
