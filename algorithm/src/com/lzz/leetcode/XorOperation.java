package com.lzz.leetcode;

public class XorOperation {
    public static int xorOperation(int n, int start) {

        int res = start;
        if(n==1) {
            return res;
        }
        for(int i = 1; i < n ; i++){
            start = start + 2 ;
            res ^= start;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(xorOperation(10,5));
    }
}
