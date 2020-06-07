package com.lzz.leetcode;

/**
 *  搜索插入位置
 *
 *  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *  如果无重复元素的话，那么久插入到适合的索引位置
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 */
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        int mid ;
        while (right > left) {
            mid = (left + right) >>> 1;
            // 严格小于 target 的元素一定不是解
            if (nums[mid] < target) {
                // 下一轮搜索区间是 [mid + 1, right]
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
}
