package com.lzz.leetcode;

/**
 * 商店里正在进行促销活动，如果你要买第 i 件商品，那么你可以得到与 prices[j] 相等的折扣，其中 j 是满足 j > i 且 prices[j] <= prices[i] 的 最小下标
 * 如果没有满足条件的 j ，你将没有任何折扣。
 *
 * 输入：prices = [8,4,6,2,3]
 * 输出：[4,2,4,2,3]
 * 解释：
 * 商品 0 的价格为 price[0]=8 ，你将得到 prices[1]=4 的折扣，所以最终价格为 8 - 4 = 4 。
 * 商品 1 的价格为 price[1]=4 ，你将得到 prices[3]=2 的折扣，所以最终价格为 4 - 2 = 2 。
 * 商品 2 的价格为 price[2]=6 ，你将得到 prices[3]=2 的折扣，所以最终价格为 6 - 2 = 4 。
 * 商品 3 和 4 都没有折扣。
 */
public class FinalPrices {

    public static int[] finalPrices(int[] prices) {
        if(prices.length == 0 || prices.length == 1){
            return prices;
        }
        for(int i = 0; i < prices.length; i++){
            for (int j = i+1; j < prices.length; j++){
                if(prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;

    }

    public static int[] finalPrices2(int[] prices) {
        //创建新数组，判断比当前数组小的数的索引位置，如果存在即标记下来，然后去减
        int[] newPrice = new int[prices.length];
        //对应折扣的下标，如果没有折扣就记为 -1
        newPrice[newPrice.length-1] = -1;
        int j = 0;
        for(int i = newPrice.length - 2; i >= 0; i--){

            j = i + 1;

            //prices[i+1]就是折扣时
            if (prices[i] >= prices[j]) {
                newPrice[i] = j;

            } else {
                //prices[i+1]大于prices[i]时
                j = newPrice[j];
                //找到prices[i+1]的折扣下标

                //如果有折扣就进行比较，如果 j 是 -1 则表示无折扣，直结束循环
                while (j >= 0 && prices[i] < prices[j]) {
                    j = newPrice[j];
                }
                newPrice[i] = j;
            }
        }

        //根据折扣的下标进行处理
        for(int i = 0; i < newPrice.length; i++){
            if (newPrice[i] >= 0) {
                prices[i] -= prices[newPrice[i]];
            }
        }

        return prices;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{8,4,6,2,3};
        int[] ints = finalPrices2(prices);
        System.out.println(ints);
    }
}
