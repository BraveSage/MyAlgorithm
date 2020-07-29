package com.lzz.book.algorithm.sort.heap;

/**
 * 最大堆
 * @author lzz
 * @dat 2020-7-28 23:13:30
 */
public class MaxHeap {

    /**
     *  基于堆的完全二叉树
     */
    private int[] pq;

    /**
     *  存储于pq[1...length]中，pq[0]没有使用
     */
    private int size;

    public MaxHeap(int maxLength){
        HeapAssistive.heap = pq = new int[maxLength+1];
    }

    public boolean isEmpty(){
        return 0==size;
    }

    public int size(){
        return size;
    }

    public void insert(int value){
        pq[++size] = value;
        HeapAssistive.swim(size);
    }

    public int delMax(){
        //从根节点获取最大元素
        int max = pq[1];
        //将其和最后一个节点交换
        HeapAssistive.exchange(1, size--);
        //防止对象游离
        pq[size+1] = 0;
        //回复堆的有序性
        HeapAssistive.sink(1);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{11,18,1,20,5,12,5,16,21,9,13,17,3,24,15,19,22,31,12,44,5,6,77};
        MaxHeap maxHeap = new MaxHeap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            maxHeap.insert(nums[i]);
        }

        maxHeap.delMax();

        System.out.println();
    }
}
