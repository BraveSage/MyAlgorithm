package com.lzz.leetcode;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class IsPalindrome2 {
    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length() ; i++){
            if((s.charAt(i)>='0' && s.charAt(i) <= '9')
                    || (s.charAt(i)>='a' && s.charAt(i) <= 'z')
                    || (s.charAt(i)>='A' && s.charAt(i) <= 'Z')){
                builder.append(s.charAt(i));
            }
        }
        String str1 = builder.toString();
        StringBuilder reserveStr = builder.reverse();
        String str2 = reserveStr.toString();
        for (int i = 0; i < str1.length() / 2; i++){
            if (str1.charAt(i)>= '0' && str1.charAt(i) <= '9' ){
                if(str1.charAt(i) == str2.charAt(i)) {
                    continue;
                }else {
                    return false;
                }
            } else if(str1.charAt(i) == str2.charAt(i) + 32 || str1.charAt(i) == str2.charAt(i) - 32 || str1.charAt(i) == str2.charAt(i)) {
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
