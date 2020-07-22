package com.lzz.book.algorithm.sort;

/**
 * 自顶向下的归并排序
 */
public class MergeSortByDown extends MergeSort{


    public static void sort(int[] nums){
        aux = new int[nums.length];
        sort(nums, 0,nums.length - 1);
    }

    public static void sort(int[] nums , int low, int high){
        if(high <= low){
            return;
        }
        int mid = low + (high - low) / 2;
        sort(nums, low, mid);
        sort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 4};
        sort(nums);
        Example.show(nums);

    }
}
