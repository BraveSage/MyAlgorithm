package com.lzz.leetcode;

/**
 * 计算两个筛子总和每个点数的概率
 */
public class DiceProbability {

    public static double[] probability(){
        int SIDES = 6;
        double[] dist = new double[SIDES * 2 + 1];

        for (int i = 1 ; i <= SIDES; i++){
            for (int j = 1; j <= SIDES; j++){
                dist[i+j] += 1.0;
            }
        }
        for (int k = 2; k <= 2* SIDES; k++){
            dist[k] /= 36.0;
        }
        return dist;
    }

    public static void main(String[] args) {
        double[] probability = probability();
        System.out.println(probability);
    }
}
