package com.lzz.book.algorithm.sort;

/**
 * @author lzz
 * 选择排序
 * 遍历寻找最小数的索引进行插入索引i的位置，然后i++进行下一轮遍历寻找
 */
public class Selection {

    public static void sort(int[] a){
        int length = a.length;
        for (int i = 0; i <length; i++){
           int min = i;
           for (int j = i+1 ; j < length; j++){
               if(a[min] > a[j]){
                   min = j;
               }
           }
            Example.exchange(a,i,min);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{8,7,6,2,4,10};
        sort(a);
        Example.show(a);
    }
}
