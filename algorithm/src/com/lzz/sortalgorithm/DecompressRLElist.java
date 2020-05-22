package com.lzz.sortalgorithm;

/**
 * 解压缩编码列表
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[2,4,4,4]
 * 解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
 * 第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
 * 最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
 *
 */
public class DecompressRLElist {

    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2){
            length += nums[i];
        }

        int current = 0;

        int[] newNums = new int[length];
        for (int i = 0; i < nums.length; i+= 2){

            for (int j = 0; j < nums[i]; j++){
                newNums[current] = nums[i+1];
                current++;
            }
        }
        return newNums;
    }

    public static void main(String[] args) {
        int []nums = new int[]{1,2,3,4};
        int[] ints = decompressRLElist(nums);

        System.out.println(ints);
    }
}
