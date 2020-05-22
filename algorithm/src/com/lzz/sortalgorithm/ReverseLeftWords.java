package com.lzz.sortalgorithm;

/**
 *
 */
public class ReverseLeftWords {

    public static String reverseLeftWords(String s, int n) throws Exception {
        char[] ch = s.toCharArray();
        if(ch.length > 10000  || n < 1 || n > ch.length){
            throw new Exception();
        }

        char[] newCh = new char[ch.length];
        int temp = n;
        for (int i = 0; i < ch.length - n; i++){
            newCh[i] = ch[temp];
            temp++;
        }

        temp = temp-n;

        for (int i = 0; i < n;i++){
            newCh[temp] = ch[i];
            temp++;
        }

        String s2 = String.valueOf(newCh);

        return s2;

    }

    public static void main(String[] args) throws Exception{
        String s = reverseLeftWords("abcdefg", 10);
        System.out.println(s);
    }
}
