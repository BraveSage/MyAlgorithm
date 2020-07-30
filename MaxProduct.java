/**
 * 数组中最大的两元素乘积
 */
public class MaxProduct {
    public static int maxProduct(int[] nums) {
        //动态规划计算最大的乘积
        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++){
                max = Math.max(max,Math.max(nums[i] * nums[j], min * nums[j]));
                min = Math.min(min,nums[j]);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-6,-7,1,5,4,5};
        System.out.println(maxProduct(nums));
    }
}
