//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。 
//
// 
//
// 说明: 
//
// 
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。 
// 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。 
// 
//
// 
//
// 示例: 
//
// 输入:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6] 
// Related Topics 数组 双指针 
// 👍 568 👎 0

  
package com.lzz.algorithm.leetcode.editor.cn;
public class MergeSortedArray{
  public static void main(String[] args) {
       Solution solution = new MergeSortedArray().new Solution();
       int[] nums1 = new int[]{1,2,3,0,0,0};
       int[] nums2 = new int[]{2,5,6};
       solution.merge(nums1,3,nums2,3);
      for (int i : nums1) {
          System.out.println(i);
      }
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        //两个数组的数字索引位置
        int p1 = 0;
        int p2 = 0;

        // 复制数组的索引
        int p = 0;

        // 比较复制数组和nums2的大小进行存放至nums1
        while ((p1 < m) && (p2 < n)) {
            nums1[p++] = (nums1Copy[p1] < nums2[p2]) ? nums1Copy[p1++] : nums2[p2++];
        }

        // 其中一个数组结束后，将另一个数组的值直接赋值给nums1完成合并排序
        if (p1 < m) {
            System.arraycopy(nums1Copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        }
        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}