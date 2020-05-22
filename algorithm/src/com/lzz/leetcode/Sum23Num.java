package com.lzz.leetcode;

public class Sum23Num {

    public static void main(String[] args) throws Exception {
        int[] a = {3,3,6,5,-2,2,5,1,-9,4};

        boolean b = canThreePartsEqualSum(a);
        System.out.println(b);
    }


    public static int sum(int [] a) throws Exception {
        int sum =0;

        if(a.length==0){
            throw new Exception("数组不能为空");
        }

        for(int i = 0;i < a.length; i++){
            sum += a[i];
        }

        return sum;
    }

    public static boolean canThreePartsEqualSum(int[] A) throws Exception {
        //求出数组和
        int sum = sum(A);
        if(sum % 3 != 0){
            return false;
        }
        //平均数
        int avg = sum/3;

        //临时数，判断是否和为平均数
        int temp = 0;
        //判断是第几个数
        int flag = 0;

        for(int i = 0; i < A.length; i++){
            temp += A[i];

            if(flag!=3) {
                if (temp == avg) {
                    flag++;
                    temp = 0;
                }
            }
            if(flag==3){
                return A.length-1==i ? true:false;
            }
        }
        return false;
    }
}
