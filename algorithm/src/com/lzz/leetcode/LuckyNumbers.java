package com.lzz.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 *
 * 在同一行的所有元素中最小
 * 在同一列的所有元素中最大
 *
 * 输入：matrix = [[3,7,8],
 *                 [9,11,13],
 *                 [15,16,17]]
 * 输出：[15]
 * 解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。
 *
 */
public class LuckyNumbers {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList();
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            int min = matrix[i][0];
            int k = 0;
            for(int j = 1; j < n; j++){
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    k = j;
                }
            }
            int x;
            for(x = 0; x < m; x++){
                if(matrix[x][k] > min) {
                    break;
                }
            }
            if(x==m) {
                list.add(min);
                // x=m表示没有break,该列没有比min大的数;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [][] matrix = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));

    }
}
