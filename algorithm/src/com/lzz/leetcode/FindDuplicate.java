package com.lzz.leetcode;

/**
 * 寻找重复数
 *
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 *
 * 输入: [3,2,1,4,2,5]
 * 输出: 3
 *
 */
public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
        int len = nums.length;
        int left = 1;
        int right = len - 1;
        int mid,count;
        while (left < right) {
            count = 0;
            //中间值
            mid = (left+right)>>>1;
            for (int num:nums){
                if(num <= mid){
                    count++;
                }
            }

            if(mid < count){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }




    public static void main(String[] args) {
        int [] nums  = new int[]{3,1,2,4,2,5};
        System.out.println(findDuplicate(nums));
    }

}
