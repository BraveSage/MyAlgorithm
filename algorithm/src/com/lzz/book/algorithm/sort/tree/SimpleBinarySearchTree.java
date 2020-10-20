package com.lzz.book.algorithm.sort.tree;


import javax.print.attribute.standard.NumberUp;

public class SimpleBinarySearchTree {

    private Node root;


    private static class Node{
        private Node left, right;
        private int val;
        private int N;

        public Node(int val) {
            this.val = val;
        }
    }


    public int size(){
        return size(root);
    }

    private int size(Node root) {
        if(root == null)
            return 0;
        else
            return root.N;
    }

    public void put(int val){
        root = put(root, val);
    }

    private Node put(Node node, int val) {
        if(node == null)
            return new Node(val);
        if(node.val < val)
            put(node.left, val);
        else if(node.val > val)
            put(node.right, val);
        else
            node.val = val;
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    /**
     * 获取二叉搜索树中的最小值
     * @return
     */
    public Node min(){
        return min(root);
    }

    private Node min(Node node) {
        if(node.left==null)
            return node;
        return min(node);
    }

    /**
     * 获取二叉搜索树中最接近val的值
     * @param val
     * @return
     */
    public int floor(int val){
        Node node = floor(root, val);
        if(node==null)
            return -1;
        return node.val;
    }

    private Node floor(Node node, int val) {
        if (node == null)
            return null;
        if(node.val == val)
            return root;
        if(node.val < val)
            floor(node.left, val);
        Node t = floor(node.right, val);
        if(t!= null)
            return t;
        else
            return node;
    }

    public void deleteMin(){
        root = deleteMin(root);
    }

    private Node deleteMin(Node node) {
        if(node.left == null)
            return node.right;
        node.left = deleteMin(node.left);
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    public void delete(int val){
        root = delete(root, val);
    }

    private Node delete(Node node, int val) {
        if(node == null)
            return null;
        if(node.val > val)
            delete(node.left, val);
        else if(node.val < val)
            delete(node.right, val);
        else
            if (node.right==null)
                return node.left;
            if(node.left == null)
                return node.right;
            Node t = node;
            node = min(t.right);
            node.right = deleteMin(t.right);
            node.left = t.left;
            return node;
    }


    public Node delete2(Node node, int val){
        if(node == null)
            return null;
        if(node.val < val)
            node = delete(node.right,val);
        else if(node.val > val)
            node = delete(node.left, val);
        else
            if(node.left == null)
                return node.right;
            if(node.right == null)
                return node.left;
            Node temp = node;
            node = min(node.right);
            node.right = deleteMin(node.right);
            node.left = temp.left;
            return node;
    }

    public static void main(String[] args) {
        SimpleBinarySearchTree simpleBinarySearchTree = new SimpleBinarySearchTree();
        simpleBinarySearchTree.root = new Node(2);
        simpleBinarySearchTree.root.left = new Node(1);
        simpleBinarySearchTree.root.right = new Node(3);
        simpleBinarySearchTree.delete(2);
    }

}
