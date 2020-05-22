package com.lzz.sortalgorithm;

/**
 * 获取数组中数量为一个的数
 */
class Solution {


    public static void main(String[] args) {
        int [] nums = new int[]{2,2,1,3,4,3,1};

        int i = singleNumber(nums);
        System.out.println(i);

        int i2 = singleNumber2(nums);
        System.out.println(i2);

        System.out.println(5^6);
    }
    public static int singleNumber(int[] nums) {
        int count = 0;

        int temp = 0;


        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                temp = nums[i];
            }
            count = 0;
        }
        return temp;
    }

    public static int singleNumber2(int[] nums) {
        int x = 0;
        for (int num: nums){
            x = num ^ x;
        }

        return x;
    }
}