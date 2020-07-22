package com.lzz.book.algorithm.sort;

/**
 * 插入排序
 * 通过判断j是否大于当前j-1，如果大于的话那么进行交换，直到达到前方有比他小的位置停下来
 */
public class Insertion {

    public static void sort(int[] a){
        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && Example.less(a[j], a[j-1]); j--){
                Example.exchange(a, j, j-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{8,7,6,2,4,10};
        sort(a);
        Example.show(a);
    }
}
