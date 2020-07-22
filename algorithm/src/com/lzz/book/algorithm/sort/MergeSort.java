package com.lzz.book.algorithm.sort;

/**
 * 归并排序
 */
public class MergeSort {

    protected static int[] aux;

    public static void merge(int[] nums, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        for (int k = 0; k < nums.length; k++) {
            aux[k] = nums[k];
        }
        for (int k = low; k <= high; k++){
            if(i > mid){
                nums[k] = aux[j++];
            }else if(j > high){
                nums[k] = aux[i++];
            }else if(Example.less(aux[j], aux[i])){
                nums[k] = aux[j++];
            }else {
                nums[k] = aux[i++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 4};
        merge(nums,0,nums.length/2, nums.length  -1 );
        Example.show(nums);

    }
}
