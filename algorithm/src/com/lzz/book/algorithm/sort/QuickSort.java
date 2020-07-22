package com.lzz.book.algorithm.sort;

/**
 * 快速排序
 * @author lzz
 * @date 2020年7月22日23:27:58
 */
public class QuickSort {
    
    public static int partition(int[] nums, int low, int high){
        //左右指针扫描
        int i = low;
        int j = high+1;
        //切分元素
        int aspect = nums[low];
        
        while (true){
            //扫描左右，检查扫描是否结束并交换元素
            while (Example.less(nums[++i],aspect)){
                if (i == high){
                    break;
                }
            }
            while (Example.less(aspect,nums[--j])){
                if(j == low){
                    break;
                }
            }
            if(i >= j){
                break;
            }
            Example.exchange(nums, i, j);
        }
        Example.exchange(nums,low, j);
        return j;
    }

    public static void sort(int[] nums){
        sort(nums,0, nums.length-1);
    }

    private static void sort(int[] nums, int low, int high) {
        if(high <=  low){
            return ;
        }
        int j = partition(nums, low, high);
        sort(nums, low, j -1 );
        sort(nums, j + 1 , high);
    }

    public static void main(String[] args) {
        int[] nums = {6, 8, 2, 5, 4};
        sort(nums);
        Example.show(nums);

    }
}
