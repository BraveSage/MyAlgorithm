package com.lzz.leetcode;

/**
 * 计算最后一个单词的长度
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                length = 0;
            }else {
                length++;
                temp = length;
            }
        }
        return temp;
    }

    /**
     * 通过倒序取值获取长度判断最后一个单词的长度
     */
    public static int lengthOfLastWord2(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if(end < 0) {
            return 0;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord2("Hello World ss "));
    }

}
