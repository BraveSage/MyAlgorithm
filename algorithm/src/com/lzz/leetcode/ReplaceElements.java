package com.lzz.leetcode;

/**
 * 将每个元素替换为右侧最大元素
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 */
public class ReplaceElements {

    public static int[] replaceElements(int[] arr) {
        int length = arr.length;
        if(length <= 1){
            return new int[]{-1};
        }
        int[] results = new int[length];
        int max;

        for (int i = 1; i < length; i++){
            max = arr[i];
            for (int j = i; j < length; j ++){
                max = Math.max(max, arr[j]);
            }
            results[i - 1] = max;
        }
        results[length - 1] = -1;
        return results;
    }

    /**
     * 最优解
     * @param arr
     * @return
     */
    public static int[] replaceElements2(int[] arr) {
        int rightMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int t = arr[i];
            arr[i] = rightMax;
            if (t > rightMax) {
                rightMax = t;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{17,18,5,4,6,1};
        int[] results = replaceElements2(arr);
        System.out.println();
    }
}
