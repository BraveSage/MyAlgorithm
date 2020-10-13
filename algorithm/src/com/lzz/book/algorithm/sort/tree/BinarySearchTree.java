package com.lzz.book.algorithm.sort.tree;

import java.io.PipedWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 二叉查找树
 */
public class BinarySearchTree<T extends Comparable<T>, V> {
    private Node root;

    private class Node{
        private T key;
        private V value;
        private Node left;
        private Node right;
        private int num;

        public Node(T key, V value, int num) {
            this.key = key;
            this.value = value;
            this.num = num;
        }
    }

    private int size(Node x){
        if(x==null){
            return 0;
        }else {
            return x.num;
        }
    }

    public int size(){
        return size(root);
    }

    public V get(T key){
        return get(root, key);
    }

    private V get(Node x, T key) {
        if(x==null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0){
            return get(x.left, key);
        }else if(cmp > 0){
            return get(x.right, key);
        }else {
            return x.value;
        }

    }
    public void put(T key, V value){
        root = put(root, key, value);
    }


    public T max(){
        return max(root).key;
    }

    private Node max(Node x){
        if(x.right == null){
            return x;
        }
        return max(x.right);
    }

    public T min(){
        return min(root).key;
    }

    private Node min(Node x){
        if(x.left == null){
            return x;
        }
        return min(x.left);
    }

    public T floor(T t){
        Node x = floor(root, t);
        if(x == null){
            return null;
        }
        return x.key;
    }

    private Node floor(Node x, T t){
        if(x == null){
            return null;
        }
        int cmp = t.compareTo(x.key);
        if(cmp == 0){
            return x;
        }
        if(cmp < 0){
            return floor(x.left, t);
        }
        Node node = floor(x.right, t);
        if(node != null){
            return node;
        }else {
            return x;
        }

    }

    public T select(int k){
        return select(root, k).key;
    }

    private Node select(Node x, int k){
        if(x == null){
            return null;
        }
        int t = size(x.left);
        if(t > k){
            return select(x.left, k);
        }else if (t < k){
            return select(x.right, k - t -1);
        }else {
            return x;
        }
    }

    private int rank(T t, Node x){
        if(x == null){
            return 0;
        }
        int cmp = t.compareTo(x.key);
        if(cmp < 0){
            return rank(t, x.left);
        }else if(cmp > 0){
            return 1 + size(x.left) + rank(t, x.right);
        }else {
            return size(x.left);
        }
    }

    private Node put(Node x, T key, V value) {
        if (x == null){
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0){
            x.left = put(x.left, key, value);
        }else if(cmp > 0){
            x.right = put(x.right, key, value);
        }else {
            x.value = value;
        }
        x.num = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void deleteMin(){
        root = deleteMin(root);
    }

    private Node deleteMin(Node x){
        if(x.left == null){
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.num = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void delete(T t){
        root = delete(root, t);
    }

    private Node delete(Node x, T t){
        if(x == null){
            return null;
        }
        int cmp = t.compareTo(x.key);
        if(cmp < 0){
            x.left = delete(x.left, t);
        }else if(cmp > 0){
            x.right = delete(x.right, t);
        }else {
            if(x.right == null){
                return x.left;
            }
            if(x.left == null){
                return x.right;
            }

            Node node = x;
            x = min(node.right);
            x.right = deleteMin(node.right);
            x.left = node.left;
        }
        x.num = size(x.right) + size(x.left) + 1;
        return x;
    }


    public Iterable<T> keys(){
        return keys(min(), max());
    }
    public Iterable<T> keys(T low, T high){
        Queue<T> queue = new ArrayDeque<>();
        keys(root, queue, low, high);
        return queue;
    }

    private void keys(Node node, Queue<T> queue, T low, T high){
        if(node==null){
            return;
        }
        int compareLow = low.compareTo(node.key);
        int compareHigh = high.compareTo(node.key);
        if(compareLow < 0){
            keys(node.left, queue, low, high);
        }
        if(compareLow<=0 && compareHigh >=0){
            queue.offer(node.key);
        }
        if(compareHigh > 0){
            keys(node.right, queue, low, high);
        }
    }
}
