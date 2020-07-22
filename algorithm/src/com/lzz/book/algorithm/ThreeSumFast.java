package com.lzz.book.algorithm;

import java.util.Arrays;

/**
 * 三数之和
 */
public class ThreeSumFast {

    public static int count(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(TwoNumSum.binarySearch(nums,-nums[i]-nums[j])> j)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,3,-4,4,0,-2};
        System.out.println(count(nums));
    }
}
