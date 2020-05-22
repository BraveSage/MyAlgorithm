package com.lzz.leetcode;

/**
 * 判断是否是回文数
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
        System.out.println(isPalindrome2(123321));
    }
}
