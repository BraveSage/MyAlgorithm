package com.lzz.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int temp;

        for (int i = 0; i < nums.length ; i++){
            temp = nums[i];

            if (temp == k){
                count++;
            }
            if(nums.length - 1 == i){
                break;
            }

            for (int j = i + 1 ; j < nums.length ; j++){
                temp += nums[j];
                if(k == temp){
                   count++;
                }
            }
        }

        return count;

    }

    public static int subarraySum2(int[] nums, int k) {
        /**
         扫描一遍数组, 使用map记录出现同样的和的次数, 对每个i计算累计和sum并判断map内是否有sum-k
         **/
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, ret = 0;

        for(int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if(map.containsKey(sum-k))
                ret += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return ret;
    }

    public static void main(String[] args) {
        int []nums = new int[]{0,0,0,0,0,0,0,0,0,0};
//        int []nums = new int[]{100,1,2,3,4};
        int i = subarraySum2(nums, 0);
        System.out.println(i);

    }
}
