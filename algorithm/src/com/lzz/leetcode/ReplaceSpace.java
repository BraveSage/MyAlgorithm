package com.lzz.leetcode;

/**
 * 替换空格,把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace {

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (char ch :s.toCharArray()){
            if(ch == ' '){
                builder.append("20%");
                continue;
            }
            builder.append(ch);
        }
        return builder.toString();
    }

    public static void main(String[] args) {

    }
}
