package com.lzz.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 判断是否是镜像二叉树
 */
public class IsSymmetric {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric2(root.left,root.right);
//        return isMirror(root.left,root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null ||right == null){
            return false;
        }
        return left.val == right.val && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }

    public static boolean isSymmetric2(TreeNode left, TreeNode right) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(left);
        q.offer(right);
        while (!q.isEmpty()){
            left = q.poll();
            right = q.poll();
            if(left == null && right == null){
                continue;
            }
            if((left == null || right == null) || left.val != right.val){
                return false;
            }

            q.offer(left.left);
            q.offer(right.right);

            q.offer(left.right);
            q.offer(right.left);
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        boolean symmetric = isSymmetric(root);
    }
}
