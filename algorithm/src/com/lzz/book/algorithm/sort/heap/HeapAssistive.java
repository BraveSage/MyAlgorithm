package com.lzz.book.algorithm.sort.heap;

/**
 * 堆的基础方法
 * @author lzz
 * @date 2020-7-28 23:03:34
 */
public class HeapAssistive {

    static int heap[];

    public static boolean less(int i, int j){
        return heap[i] < heap[j];
    }

    public static void exchange(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /**
     * 上浮，与父节点对比进行交换
     * @param value
     */
    public static void swim(int value){
        while (value > 1 && less(value/2, value)){
            exchange(value/2, value);
            value = value/2;
        }
    }

    /**
     * 下沉，与子节点对比进行交换
     * @param value
     */
    public static void sink(int value){
        while (2 * value <= heap.length){
            int j = 2 * value;
            if(j < heap.length && less(j , j+1)){
                j++;
            }
            if(!less(value ,j)){
                break;
            }
            exchange(value,j);
            value = j;
        }
    }
}
