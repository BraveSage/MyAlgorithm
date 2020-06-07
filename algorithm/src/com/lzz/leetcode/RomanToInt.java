package com.lzz.leetcode;

/**
 * 转换罗马数字
 */
public class RomanToInt {

    public static int romanToInt(String s) {
        int preNum = getValue(s.charAt(0));
        int sum = preNum;
        for (int i = 1; i < s.length(); i++){
            int num  = getValue(s.charAt(i));
            if(preNum < num){
                sum = num - (2*preNum) + sum;
            }else {
                sum += num;
            }
            preNum = num;
        }

        return sum;
    }

    public static int romanToInt2(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }


    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt2("MCMXCIV"));
    }
}
