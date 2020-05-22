package com.lzz.sortalgorithm;

import java.math.BigInteger;

/**
 * 二进制链表转整数
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 */
public class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        String s = "";
        while (head != null){
            s += head.val;
            head = head.next;
        }

        int length = s.length();
        int num = 0;
        for (int i = 0; i < length; i++){
            if(s.charAt(i) == '1'){
                num += 1>>length-i-1;
            }
        }
        return num;
    }

    public int getDecimalValue2(ListNode head) {
        int num = 0;
        while (head != null){
            num *= 2;
            num += head.val;
            head = head.next;
        }
        return num;
    }

    public static void main(String[] args) {
    }
}
