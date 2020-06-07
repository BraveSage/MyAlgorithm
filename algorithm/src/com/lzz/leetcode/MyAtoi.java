package com.lzz.leetcode;

public class MyAtoi {
    public static int myAtoi(String str) {
        StringBuilder builder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == ' ' ||chars[i] == '\t'){
                if (builder.length()==0){
                    continue;
                }else {
                    break;
                }
            }
            if(chars[i] >= 48 && chars[i] <= 57){
                builder.append(chars[i]);
                continue;
            }
            if(chars[i] == '+'||chars[i] == '-'){
                builder.append(chars[i]);
                continue;
            }
            if(chars[i] != ' ' ||chars[i] != '\t'|| chars[i] != '-' || chars[i] < 48 || chars[i] > 57){
                break;
            }
        }

        String str2 = builder.toString();
        if (builder.length() == 0|| str2.equals("-") ||str2.equals("+")){
            return 0;
        }
        if ((str2.charAt(0)=='+'||str2.charAt(0)=='-')&&(str2.charAt(1)=='+'||str2.charAt(1)=='-')){
            return 0;
        }
        String max = Integer.MAX_VALUE+"";

        if (str2.charAt(0) == '-'){
            if(max.length() < str2.length()+1){
                return Integer.MAX_VALUE;
            }
        }

        if(max.length() < str2.length()){
            return Integer.MAX_VALUE;
        }


        long l = Long.parseLong(str2);
        if(l > Integer.MAX_VALUE){
            return Integer.MIN_VALUE;
        }
        if(l < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)l;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("20000000000000000000"));
//        System.out.println((int)' ');
    }
}
