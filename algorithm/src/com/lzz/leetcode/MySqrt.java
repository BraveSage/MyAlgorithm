package com.lzz.leetcode;

/**
 * 计算x的平方根
 */
public class MySqrt {

    public static int mySqrt(int x) {
        int left = 0;
        int right = x/2+1;
        while (left < right){
            long mid = (left+right+1)>>>1;
            long square = mid * mid;
            if (x >= square){
                left = (int)mid;
            }else {
                right = (int)mid -1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}
