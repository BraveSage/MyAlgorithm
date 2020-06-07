package com.lzz.leetcode;

/**
 * 最长公共前缀
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        int[] sameNum = new int[strs.length - 1];
        String preStr = strs[0];

        int minLength;

        //获取所有相同的前缀字符串的长度
        for (int i = 1; i < strs.length; i++){
            int count = 0;
            minLength = preStr.length() < strs[i].length() ? preStr.length() : strs[i].length();
            for (int j = 0; j < minLength; j++){
               if(strs[i].charAt(j)==preStr.charAt(j)){
                   count++;
               }else {
                   break;
               }
            }
            preStr = strs[i];
            sameNum[i-1] = count;
        }
        int temp;
        //获取到最小的字符串长度，也就是最长公共前缀的长度
        for (int i = 0; i < sameNum.length; i++){
            for (int j = i; j < sameNum.length; j++){
                if(sameNum[i] > sameNum[j]){
                    temp = sameNum[j];
                    sameNum[j] = sameNum[i];
                    sameNum[i] = temp;
                }
            }
        }
        String result = "";

        //拼接字符串
        for (int i = 0; i < sameNum[0]; i++){
            result += preStr.charAt(i);
        }

        return result;
    }

    public static String LongestCommonPrefix2(String[] strs){
        int len = strs.length;
        if(len==0){
            return "";
        }
        String str = strs[0];
        //获取最短的字符串
        for(String s:strs){
            str = s.length()<str.length()?s:str;
        }
        int str_len = str.length();
        for(int i=str_len;i>0;i--){
            for(int k=0;k<len;k++){
                //判断相同的长度
                if(!(strs[k].substring(0,i).equals(str.substring(0,i)))){
                    break;
                }else if(k==len-1){
                    return str.substring(0,i);
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
