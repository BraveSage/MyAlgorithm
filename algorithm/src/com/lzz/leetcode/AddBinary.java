package com.lzz.leetcode;

/**
 * 二进制相加
 */
public class AddBinary {

    public static String addBinary(String a, String b) {
        int indexA = a.length() - 1 ;
        int indexB = b.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        while (indexA>=0 && indexB>=0){
            if(carry == 1){
                if(a.charAt(indexA) == '1' && b.charAt(indexB) == '1'){
                    builder.append(1);
                }else if(a.charAt(indexA) == '0' && b.charAt(indexB) == '0'){
                    builder.append(1);
                    carry--;
                }else {
                    builder.append(0);
                }
            }else {
                if(a.charAt(indexA) == '1' && b.charAt(indexB) == '1'){
                    builder.append(0);
                    carry++;
                }else if(a.charAt(indexA) == '0' && b.charAt(indexB) == '0'){
                    builder.append(0);
                }else {
                    builder.append(1);
                }
            }
                indexA--;
                indexB--;
        }
        if(indexA >= 0){
            while (indexA>=0){
                if (carry == 1) {
                    if (a.charAt(indexA) == '1') {
                        builder.append(0);
                        carry++;
                    }else {
                        builder.append(1);
                        carry--;
                    }
                }else {
                    builder.append(a.charAt(indexA));
                }
                indexA--;
                carry--;
            }
        }
        if(indexB >= 0){
            while (indexB>=0){
                if (carry == 1) {
                    if (b.charAt(indexB) == '1') {
                        builder.append(0);
                        carry++;
                    }else {
                        builder.append(1);
                        carry--;
                    }
                }else {
                    builder.append(b.charAt(indexB));
                }
                indexB--;
                carry--;
            }
        }
        if(carry == 1){
            builder.append(1);
        }
        return builder.reverse().toString();
    }

    public static String reserve(String str){
        char[] chars = str.toCharArray();
        int length = chars.length -1;
        int mid = chars.length >>1;
        char temp;
        for (int i = 0; i < mid; i++){
            temp = chars[length-i];
            chars[length - i] = chars[i];
            chars[i] = temp;
        }
        return String.valueOf(chars);
    }

    public String addBinary2(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }



    public static void main(String[] args) {
        String a = "110010";
        String b = "10111";
        System.out.println(addBinary(a,b));
//        System.out.println(reserve("123456789"));

    }
}
