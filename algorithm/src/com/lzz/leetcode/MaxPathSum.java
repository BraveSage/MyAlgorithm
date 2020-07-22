package com.lzz.leetcode;

/**
 * 给定一个非空二叉树，返回其最大路径和。
 *
 * 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 */
public class MaxPathSum {


    int ans ;
    public int maxPathSum(TreeNode root) {
        //防止树中所有元素都为负数
        ans =  Integer.MIN_VALUE;
        helper(root);
        return ans;
    }

    public int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        //计算左子节点最大值
        int leftMax = Math.max(0, helper(node.left));
        //计算右子节点最大值
        int rightMax = Math.max(0, helper(node.right));
        //判断是否是最大的路径和
        ans = Math.max(ans ,node.val + leftMax + rightMax);
        return Math.max(leftMax , rightMax) + node.val;

    }
}
