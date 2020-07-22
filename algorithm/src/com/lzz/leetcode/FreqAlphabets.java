package com.lzz.leetcode;

import sun.java2d.pipe.SpanIterator;

/**
 * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
 *
 * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
 * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。
 *
 * 输入：s = "10#11#12"
 * 输出："jkab"
 * 解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 *
 */
public class FreqAlphabets {
    public static String freqAlphabets(String s) {
        char[] alphabetChars = new char[27];
        for (int i = 1; i < alphabetChars.length; i++) {
            alphabetChars[i] = (char) (96 + i);
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                builder.append(alphabetChars[(chars[i] - '0') * 10 + (chars[i + 1] - '0')]);
                i += 2;
            } else {
                builder.append(alphabetChars[chars[i] - '0']);
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
}
