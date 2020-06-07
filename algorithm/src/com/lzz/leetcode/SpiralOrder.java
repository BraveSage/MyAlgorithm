package com.lzz.leetcode;

/**
 * 顺时针打印矩阵
 */
public class SpiralOrder {
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new int[]{};
        }
        int length = matrix.length * matrix[0].length;
        int horizontal = matrix.length - 1;
        int vertical = matrix[0].length -1;
        //横向上、下，纵向左右
        int horTempU = 0;
        int horTempD = horizontal;
        int verTempL = 0;
        int verTempR = vertical;
        int flag = 0;
        int turns = 0;
        int[] nums = new int[length];
        for (int i = 0; i < length; i++){
            if(flag%4 == 0){
                nums[i] = matrix[horTempU][verTempL];
                if(verTempL == verTempR){
                    verTempL =  turns;
                    turns++;
                    horTempU++;
                    flag++;
                    continue;
                }
                verTempL++;
            }else if(flag%4 == 1){
                nums[i] = matrix[horTempU][verTempR];
                if(horTempU == horTempD){
                    horTempU = turns;
                    verTempR--;
                    flag++;
                    continue;
                }
                horTempU++;
            }else if(flag%4 == 2){
                nums[i] = matrix[horTempD][verTempR];
                if(verTempL == verTempR){
                    verTempR = vertical - turns;
                    horTempD--;
                    flag++;
                    continue;
                }
                verTempR--;
            }else if(flag%4 == 3){
                nums[i] = matrix[horTempD][verTempL];
                if(horTempU == horTempD){
                    verTempL++;
                    horTempD = horizontal - turns;
                    flag++;
                    continue;
                }
                horTempD--;
            }
        }
        return nums;
    }

    public static int[] spiralOrder2(int[][] matrix) {
        if(matrix.length == 0) {
            return new int[0];
        }
        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        int x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while(true) {
            for(int i = l; i <= r; i++) {
                res[x++] = matrix[t][i];
                // left to right.
            }
            if(++t > b) {
                break;
            }
            for(int i = t; i <= b; i++) {
                res[x++] = matrix[i][r];
                // top to bottom.
            }
            if(l > --r) {
                break;
            }
            for(int i = r; i >= l; i--) {
                res[x++] = matrix[b][i];
                // right to left.
            }
            if(t > --b) {
                break;
            }
            for(int i = b; i >= t; i--) {
                res[x++] = matrix[i][l];
                // bottom to top.
            }
            if(++l > r){
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] ints = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        int [][] ints = new int[][]{};
        int[] ints1 = spiralOrder2(ints);
        System.out.println(ints1);
//        System.out.println(ints.length);
//        System.out.println(ints[0].length);
    }
}
