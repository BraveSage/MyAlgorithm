package com.lzz.book.algorithm.sort;

public class Shell {


    public static int[] sort(int[] a){
        int length = a.length;
        int h = 1;
        while (length/3> h){
            h = h * 3 + 1;
        }

        while (h >= 1){

            for (int i = h; i < length; i++){
                for (int j = i; j >=h && Example.less(a[j],a[j-h]); j-=h){
                    Example.exchange(a,j, j-h);
                }
            }

            h /= 3;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{8,7,6,2,4,10};
        sort(a);
        Example.show(a);
    }
}
