package com.lzz.algorithm;

public class KthSmallest {

    public static int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (check(matrix, mid, k, n)) {
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean check(int[][] matrix, int mid, int k, int n) {
        int i = n - 1;
        int j = 0;
        int num = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= mid) {
                num += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return num >= k;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,  5,  9},{10, 11, 13},{12, 13, 15}};
        System.out.println(kthSmallest(matrix, 8));
    }
}
