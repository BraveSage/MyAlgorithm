package com.lzz.leetcode;


/**
 * 访问所有点的最小时间
 * 输入：points = [[1,1],[3,4],[-1,0]]
 * 输出：7
 * 解释：一条最佳的访问路径是： [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
 * 从 [1,1] 到 [3,4] 需要 3 秒
 * 从 [3,4] 到 [-1,0] 需要 4 秒
 * 一共需要 7 秒
 *
 */
public class MinTimeToVisitAllPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for (int i = 0; i < points.length - 1; i++){
            sum += Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1] - points[i+1][1]));
        }
        return sum;

    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 1}, {3, 4}, {-1, 0}};
        int sum = minTimeToVisitAllPoints(nums);
        System.out.println(sum);
    }
}
