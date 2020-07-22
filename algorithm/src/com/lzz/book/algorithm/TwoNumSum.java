package com.lzz.book.algorithm;

import java.util.Arrays;

/**
 * 两数之和
 */
public class TwoNumSum {

    public static int twoNumSum(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(binarySearch(nums, -nums[i] )>i){
                count++;
            }
        }
        return count;
    }

    public static int binarySearch(int[] nums, int val){
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right){
            mid  = left+ ((right - left  )>>1);
            if(nums[mid] > val){
                right = mid-1;
            }
            if(nums[mid] < val){
                left = mid+1;
            }
            if (nums[mid] == val){
                return mid;
            }
        }
        if(nums[mid]>val){
//            return mid;
            return -1;
        }
//        return left++;
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,3,1,-3};
        System.out.println(twoNumSum2(nums));
        System.out.println(binarySearch(nums,33));
    }

    public static int twoNumSum2(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(binarySearch(nums, -nums[i]) > i){
                count++;
            }
        }
        return count;
    }

}
