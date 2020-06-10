package com.lzz.leetcode;

/**
 * 合并二叉树，将两个树之间的值合并
 */
public class MergeTrees {

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }


    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1l = new TreeNode(3);
        TreeNode t1ll = new TreeNode(5);
        t1.left = t1l;
        t1l.left = t1ll;
        TreeNode t1r = new TreeNode(2);
        t1.right = t1r;
        TreeNode t2 = new TreeNode(2);
        TreeNode t2l = new TreeNode(1);
        t2.left = t2l;
        TreeNode t2r = new TreeNode(3);
        t2.right = t2r;
        TreeNode t2rr = new TreeNode(7);
        t2r.right = t2rr;
        TreeNode t1lr = new TreeNode(4);
        t1l.right = t1lr;
        TreeNode treeNode = mergeTrees(t1, t2);
        System.out.println(treeNode);

    }
}
