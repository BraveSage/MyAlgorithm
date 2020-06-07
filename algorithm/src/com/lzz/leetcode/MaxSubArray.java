package com.lzz.leetcode;

/**
 * 最大子序列和
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int nowSum = 0,maxSum = 0;
        for (int i = 0; i < nums.length; i++){
            nowSum = nowSum + nums[i];

            if(maxSum < nowSum){
                maxSum = nowSum;
            }

            if(nowSum < 0){
                nowSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
