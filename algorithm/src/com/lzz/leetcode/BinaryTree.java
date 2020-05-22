package com.lzz.leetcode;

public class BinaryTree {
    private TreeNode treeNode;

    public boolean insert(int data){
        treeNode = new TreeNode(data);
        if(treeNode==null) {
            treeNode.data = data;
        }
        return true;
    }
    static class TreeNode {
        private Object data;
        private TreeNode left;
        private TreeNode right;

        public void display(){
            System.out.println(data);
        }

        TreeNode(int data){
            this.data = data;
        }
    }
}



