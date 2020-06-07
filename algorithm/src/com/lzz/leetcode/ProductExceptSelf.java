package com.lzz.leetcode;

/**
 * 除自身以外数组的乘积
 *
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 */
public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];

        left[0] = 1;
        right[length - 1] = 1;

        for (int i = 1; i < length; i++){
            left[i] = left[i-1] * nums[i -1];
        }
        for (int i = length-2; i>= 0; i--){
            right[i] = right[i + 1]* nums[i + 1];
        }
        for (int i = 0; i < length; i++){
            left[i] *= right[i];
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] ints = productExceptSelf(nums);
        System.out.println(ints[0]);
    }
}
