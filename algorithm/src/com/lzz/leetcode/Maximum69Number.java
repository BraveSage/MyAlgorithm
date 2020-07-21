package com.lzz.leetcode;

/**
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 *
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 *
 * 请返回你可以得到的最大数字。
 *
 */
public class Maximum69Number {
    public static int maximum69Number (int num) {

        String numStr = num + "";
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++){
            if(numStr.charAt(i) == '6'  && count == 0){
                builder.append(9);
                count++;
            }
            builder.append(numStr.charAt(i));
        }
        return Integer.valueOf(builder.toString());

    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(6666));
    }
}
