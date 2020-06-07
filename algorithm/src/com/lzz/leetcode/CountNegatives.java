package com.lzz.leetcode;

/**
 * 统计矩阵中的负数
 */
public class CountNegatives {

    public static int countNegatives(int[][] grid) {
        int count = 0;
        if(grid.length == 0){
            return count;
        }
        int index = grid[0].length;

        for (int i = 0; i < grid.length; i ++){
            for (int j = 0 ; j <index; j++){
                if(grid[i][j] < 0){
                    count += index - j;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{4,3,-1,-2},{4,3,-1,-2}};
        System.out.println(countNegatives(grid));
    }
}
