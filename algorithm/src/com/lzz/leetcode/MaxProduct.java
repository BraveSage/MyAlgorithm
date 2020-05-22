package com.lzz.leetcode;

/**
 * 数组中乘积最大的连续子数组，返回乘积
 */
public class MaxProduct {

    public static int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int result = nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++){
            int temp = max;

        }

        return 0;
    }

    public static int maxProduct2(int[] nums){
        int max = nums[0], min = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[]nums = new int[]{2,6,-1,3,2};
        System.out.println(maxProduct2(nums));
    }
}
