package com.lzz.leetcode;

/**
 * 实现strStr()方法
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class ImplStrstr {
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        int hLength = haystack.length();
        int nLength = needle.length();
        if (hLength<nLength){
            return -1;
        }

        if(haystack.equals(needle)){
            return 0;
        }
        for (int i = 0; i < hLength - nLength+1; i++){
            int j = 0;
            if(haystack.charAt(i) == needle.charAt(0)){
                for (; j < nLength; j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        break;
                    }
                }
                if(j==nLength){
                    return i;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","pi"));
    }
}
