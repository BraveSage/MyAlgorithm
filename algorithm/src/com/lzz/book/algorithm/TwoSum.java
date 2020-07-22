package com.lzz.book.algorithm;

/**
 * 两数之和
 */
public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while(low > high){
            if(numbers[low] + numbers[high] == target){
                return new int[]{low + 1, high + 1};
            }else if(numbers[low] + numbers[high] >= target){
                high--;
            }else{
                low ++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] numbers = twoSum(nums,9);
        System.out.println(numbers);
    }
}
