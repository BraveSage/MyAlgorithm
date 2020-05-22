package com.lzz.leetcode;

/**
 * @author lzz
 * 石头与宝石
 */
public class StoneAndJewel {

    public static void main(String[] args) {

        String j = "z";
        String s = "ZZzzzz";
        int num = numJewelsInStones0(s, j);
        System.out.println(num);
    }

    public static int numJewelsInStones(String s,String j){
        int num = 0;
        char[] stone = s.toCharArray();
        char[] jewel = j.toCharArray();
        for (int i = 0; i < stone.length; i++){
            for (int x = 0; x < jewel.length; x++){
                if(jewel[x]==stone[i]){
                    num++;
                }
            }
        }
        return num;

    }

    public static int numJewelsInStones0(String s,String j){
        String a = "[^"+j+']';
        s = s.replaceAll(a, "");
        return s.length();
    }
}
