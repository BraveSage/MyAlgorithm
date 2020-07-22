package com.lzz.book.algorithm.sort;

public class Example {

    public static boolean less(int v, int w){
        return v < w;
    }

    public static void exchange(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static boolean isSorted(int[] a){
        for (int i = 0; i < a.length; i++){
            if(less(a[i],a[i-1]))
                return false;
        }
        return true;
    }
}
