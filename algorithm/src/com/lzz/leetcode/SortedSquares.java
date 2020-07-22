package com.lzz.leetcode;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 */
public class SortedSquares {
    public static int[] sortedSquares(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }

    public static int[] sortedSquares2(int[] A) {
        int j = 0;
        //先判断小于0的个数
        int length = A.length;
        while (j < length && A[j] < 0){
            j++;
        }
        //取出最大的负数
        int i = j - 1;
        int t = 0;
        int[] B = new int[length];
        //进行判断最大负值与最小正值的平方对比然后增加数组
        while (i >= 0 && j < length) {
            if (A[i] * A[i] > A[j] * A[j]) {
                B[t++] = A[j] * A[j];
                j++;
            } else {
                B[t++] = A[i] * A[i];
                i--;
            }
        }
        while (i >= 0){
            B[t++] = A[i] * A[i];
            i--;
        }
        while (j < length){
            B[t++] = A[j] * A[j];
            j++;
        }
        return B;

    }

    public static void main(String[] args) {
        int[] A = new int[]{-1};
        int[] ints = sortedSquares2(A);
        System.out.println(ints);
    }

}
