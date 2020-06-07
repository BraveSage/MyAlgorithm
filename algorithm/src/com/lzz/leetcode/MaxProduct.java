package com.lzz.leetcode;

/**
 * 数组中乘积最大的连续子数组，返回乘积
 */
public class MaxProduct {

    public static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0],result = nums[0];
        int temp;
        for (int i = 1; i < nums.length; i++){
           temp = max;

           //计算可能是最小的负值.然后与当前负值想乘，负负得正
            max = Math.max(Math.max(max * nums[i],min * nums[i]),nums[i]);
            min = Math.min(Math.min(temp * nums[i],min * nums[i]),nums[i]);

           if(result < max){
               result = max;
           }

        }
        return result;
    }

    public static void main(String[] args) {
        int[]nums = new int[]{2,6,-1,3,2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct2(int[] nums){
        int max = nums[0],min = nums[0],result = nums[0];
        int temp;
        for (int i = 1; i < nums.length; i++){
            temp = max;
            //计算当前值是否是最大，且与最小值相乘是否负负得正
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            //计算最小值，然后在求最大值时，当nums[i]为负数时用上方max计算相乘是否为最大
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            //记录目前出现过的最大值
            if(result < max){
                result = max;
            }
        }
        return result;
    }
}
