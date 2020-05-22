package com.lzz.sortalgorithm;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int newNum[] = new int[2] ;

        int length = nums.length - 1;
        for (int i = 0; i < length; i ++){
            for (int j = i + 1; j < length + 1; j++){
                if(nums[i] + nums[j] == target){
                    newNum = new int[]{i, j};
                }
            }
        }

        return newNum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};

        int[] ints = twoSum(nums, 9);
        for (int i = 0; i < ints.length; i ++){
            System.out.println(ints[i]);

        }
    }

}
