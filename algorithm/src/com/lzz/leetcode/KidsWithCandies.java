package com.lzz.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 拥有最多糖果的孩子
 */
public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] flag = new boolean[candies.length];

        for (int i = 0; i < flag.length;i++){
            flag[i] = true;
        }
        for (int i = 0; i < candies.length; i ++){
            for (int j = 0; j < candies.length; j++){
                if(candies[i] + extraCandies < candies[j]){
                    flag[i] = false;
                    break;
                }
            }

        }
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++){
            list.add(flag[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] candies = new int[]{2,3,5,1,3};
        List<Boolean> list = kidsWithCandies(candies, 3);

        System.out.println(list.toString());
    }

}
