package com.lzz.sortalgorithm;

public class SubtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int temp  = n;
        int mul = 1;
        int sum = 0;
        while (temp != 0){
            mul *= temp%10;
            sum += temp%10;
            temp /= 10;
        }
        return mul - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
