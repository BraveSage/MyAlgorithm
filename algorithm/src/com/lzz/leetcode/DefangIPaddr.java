package com.lzz.leetcode;

public class DefangIPaddr {

    public static String defangIPaddr(String address) {
        String s = address.replace(".", "[.]");
        return s;
    }


    public static String defangIPaddr2(String address) {
        char[] chars = address.toCharArray();

        int length = chars.length + 6;
        char[] newCh = new char[length];

        int n = 0;


        for (int i = 0; i< chars.length;i ++){

            if (chars[i] == '.'){
                newCh[n] = '[';
                newCh[n+1] = '.';
                newCh[n+2] = ']';
                n = n+3;
            }else {
                newCh[n] = chars[i];
                n++;
            }
        }


        String s = String.valueOf(newCh);


        return s;
    }

    public static void main(String[] args) {

        String s = defangIPaddr2("127.0.0.1");
        System.out.println(s);
    }
}
