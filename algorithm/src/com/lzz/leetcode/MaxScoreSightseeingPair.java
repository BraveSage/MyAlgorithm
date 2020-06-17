package com.lzz.leetcode;

/**
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 *
 * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 *
 * 返回一对观光景点能取得的最高分。
 *
 * 输入：[8,1,5,2,6]
 * 输出：11
 * 解释：i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 *
 */
public class MaxScoreSightseeingPair {

    public static int maxScoreSightseeingPair(int[] A) {
        //当0每次平移一位-1时，判断到达当前索引与该索引的数对比，如果大于，说明相加的值更大，再判断每次最大平移值的数的索引，与相加的最大值
        int max = 0;
        int buff = A[0];
        for(int j = 1; j < A.length; j++){
            buff--;
            max = Math.max(max,buff + A[j]);
            buff = Math.max(buff, A[j]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[]{8,1,5,2,8};
        System.out.println(maxScoreSightseeingPair(A));
    }
}
