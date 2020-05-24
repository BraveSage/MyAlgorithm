package com.lzz.leetcode;

public class BalancedStringSplit {
    public static int balancedStringSplit(String s) {
        int flag = 0;
        int freq = 0;

        for (char ch : s.toCharArray()){
            if (ch == 'L'){
                flag++;
            }else {
                flag--;
            }
            if(flag == 0){
                freq++;
            }
        }
        return freq;

    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLLLLRRRLR"));
    }
}
