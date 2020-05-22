package com.lzz.leetcode;

/**
 * 将数字变为0的操作次数
 */
public class Solution2 {

    public static void main(String[] args) {
        int i = numberOfSteps2(14);
        System.out.println(i);
    }

    public static int numberOfSteps (int num) {
        int count = 0;

        while (num == 0){

            if(num != 0) {
                if(num %2 == 1){
                    num -= 1;
                }else {
                    num = num>>1;
                }

                count++;
            }else {
                break;
            }
        }

        return count;
    }

    public static int numberOfSteps2 (int num) {
        int count = 0;

        while (num != 0){

            if(num %2 == 1){
                num -= 1;
            }else {
                num = num>>1;
            }

            count++;
        }

        return count;
    }
}
