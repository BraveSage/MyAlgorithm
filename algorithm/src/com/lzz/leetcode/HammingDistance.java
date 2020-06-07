package com.lzz.leetcode;

/**
 * 汉明距离
 * 输入: x = 1, y = 4
 *
 * 输出: 2
 *
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int count = 0;
        int temp = 0 ;
        while (x != 0 || y != 0){
            if(x%2 != y%2){
                count++;
            }
            x = x>>1;
            y = y>>1;
            if(x==0){
                temp = y;
            }
            if(y == 0){
                temp = x;
            }
        }
        while (temp!=0){
            count++;
            temp = temp>>1;
        }

        return count;
    }

    public static int hammingDistance2(int x, int y) {
        int i = x ^ y;
        int count = 0;
        while (i!=0){
            if(i%2==1){
                count++;
            }
            i = i>>1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance2(4,2));
    }
}
