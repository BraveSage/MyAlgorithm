package com.lzz.leetcode;

/**
 * 打印小于n位数的数组。n=2时，就是打印所有的两位数1-99
 */
public class PrintNumbers {
    public static int[] printNumbers(int n) {
        int max = 10;
        while (n != 0){
            max *= 10;
            n--;
        }
        max--;
        int[] nums = new int[max];
        int j = 1;
        for (int i = 0; i < max; i++, j++){
            nums[i] = i;
        }
        return nums;
    }

    public static void main(String[] args) {
        int []  nums = printNumbers(1);
        System.out.println(nums);
    }
}
