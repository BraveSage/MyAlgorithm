package com.lzz.leetcode;

/**
 * 获取数组从0到索引位置的和返回到数组索引位置
 *
 */
public class RunningSum {
    public int[] runningSum(int[] nums) {
        if(nums.length==0){
            return nums;
        }
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
