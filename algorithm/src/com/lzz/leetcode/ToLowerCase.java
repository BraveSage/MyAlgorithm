package com.lzz.leetcode;

/**
 *  转换成小写字母
 */
public class ToLowerCase {

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(chars[i] >= 65 &&  chars[i] <= 90){
                chars[i] += 32;
            }
        }

        return String.valueOf(chars);
    }
}
