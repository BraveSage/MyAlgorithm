package com.lzz.leetcode;

/**
 *   重新排列数组
 *
 *   给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *
 *  请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 */
public class Shuffle {

    public static int[] shuffle(int[] nums, int n) {
        int index = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[n+i];
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{2,5,1,3,4,7};
        int[] shuffle = shuffle(nums,3);
        System.out.println(shuffle);
    }
}

