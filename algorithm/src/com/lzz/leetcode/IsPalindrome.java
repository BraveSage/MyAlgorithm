package com.lzz.leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 */
public class IsPalindrome {

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        String s = x+"";
        char[] chars = s.toCharArray();

        int length = chars.length>>1;
        if(chars.length<=2){
            return false;
        }

        for (int i = 0; i < length;i++){
            if(chars[i] != chars[chars.length - 1 -i]){
                return false;
            }
        }

        return true;

    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int help = 1;
        int tmp = x;
        while (tmp >= 10) {
            help *= 10;
            tmp /= 10;
        }
        while (x != 0) {
            if (x % 10 != x / help) {
                return false;
            }
            x = x % help / 10;
            help /= 100;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome2(1235321));
    }
}
