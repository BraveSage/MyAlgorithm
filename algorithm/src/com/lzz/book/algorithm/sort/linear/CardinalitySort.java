package com.lzz.book.algorithm.sort.linear;

/**
 * 基数排序：
 * 又称“桶子法”（bucket sort）或bin sort，顾名思义，它是透过键值的部份资讯
 * 将要排序的元素分配至某些“桶”中，藉以达到排序的作用
 * 基数排序法是属于稳定性的排序，其时间复杂度为O (nlog(r)m)，其中r为所采取的基数
 * 而m为堆数，在某些时候，基数排序法的效率高于其它的稳定性排序法。
 */
public class CardinalitySort {


    public static String[] countsort(String b[], int index) {
        int maxsize = Integer.parseInt("" + b[0].toCharArray()[index]);
        String c[] = new String[b.length];
        //1）找出数据中的最大数
        for (int i = 1; i < b.length; i++) {
            if (Integer.parseInt("" + b[i].toCharArray()[index]) > maxsize) {
                maxsize = Integer.parseInt("" + b[i].toCharArray()[index]);
            }
        }

        //确定桶的数量,创建一个maxsize+1的桶数组，桶下标代表数值，桶中存放值代表重复数据的数量
        int bubble[] = new int[maxsize + 1];
        //2）把值相等的数据放入到同一个桶中，统计每个桶的数量
        for (int j = 0; j < b.length; j++) {
            bubble[Integer.parseInt("" + b[j].toCharArray()[index])]++;
        }

        //把桶的数组顺序求和，那么这时候每个桶中的值就是包括桶下标在内的小于等于它的数量
        for (int i = 1; i < bubble.length; i++) {
            bubble[i] = bubble[i - 1] + bubble[i];
        }

        for (int k = b.length - 1; k >= 0; k--) {
            int i = Integer.parseInt("" + b[k].toCharArray()[index]);
            int realindex = --bubble[i];
            c[realindex] = b[k];
        }
        return c;
    }


    public static void main(String[] args) {
        // todo auto-generated method stub
        //给100万的手机号排序,从低位到高位，按照稳定的方式给每位进行快速或计数或桶排序排序，这样就能得到的复杂度就是11*o(n)
        //为什么要用稳定的方式，如果非稳定方式，那么数的大小就取决于最后一次的最高位排序，这样会导致低位的排序无序了，举个列子 两个手机号
        //最高三位    137  132  比较完个位变成了132 137  这样的顺序原本是对的，比较十位 交换变成了137  132就反了，所以需要稳定排序(也就是需要从后向前循环数组)
        String a[] = {"14216658414", "15216652418", "13216658643", "16216639416", "17216658461", "18214658413", "19217458411", "13814958415"};
        for (int j = 10; j >= 0; j--) {
            a = countsort(a, j);
        }

        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }


    }

}
