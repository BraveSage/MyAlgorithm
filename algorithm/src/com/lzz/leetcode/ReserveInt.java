package com.lzz.leetcode;

/**
 * 反转数字
 */
public class ReserveInt {
    public static int reverse(int x) {

        StringBuilder sb = new StringBuilder();
        if(x < 0){
            sb.append("-");
        }

        String s = x + "";

        int length = s.length();
        char[] chars = s.toCharArray();
        int j = length-1;

        for (;j >= 0;  j--){
            if('-' == chars[j]){
                break;
            }
            sb.append(chars[j]);
        }

        Long maxInt = new Long(Integer.MAX_VALUE);

        long l = Long.parseLong(sb.toString());
        if(maxInt < l || Integer.MIN_VALUE > l){
            return 0;
        }
        x = (int)l;
        return x ;

    }

    public static int reserve3(int x){
        int cur = 0;
        int num = x;
        while(num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur;
    }

    public static int reverse2(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数，因为Integer.MAX_VALUE%10==7 2147483647为Integer.MAX_VALUE，因此214748364是除以10之后的数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数。同理
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse2(-2147483648));
        System.out.println(0x7fffffff);

        System.out.println(reverse(123));
    }
}
