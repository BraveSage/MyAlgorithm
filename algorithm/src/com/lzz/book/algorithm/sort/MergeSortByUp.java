package com.lzz.book.algorithm.sort;

/**
 * 由底向上的归并排序
 */
public class MergeSortByUp extends MergeSort {

    public static void sort(int[] nums){
        int length = nums.length;
        aux = new int[length];

        for (int i = 1; i < length; i = i+i){
            for (int j = 0; j < length - i; j+= i+i){
                merge(nums, j,j+i-1, Math.min(j+i+i-1, length-1));
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 4};
        sort(nums);
        Example.show(nums);

    }
}
