package com.lzz.sortalgorithm;

/**
 * @Author lzz
 * 两个数组合并并且排序
 */
public class TwoListSort {
    private int [] elementData;

    private static int num;


    public static void main(String[] args) {
        int []a = new int[]{1,3,5,7,4};
        int[]n = new int[]{2,6};
        int[] merge = merge(a, n);
        for (int i = 0; i< merge.length;i++){
            System.out.println(merge[i]);
        }
//        bubbling(a);
    }

    public static void  bubble(int[] list){
        for(int i=0; i < list.length-1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    num = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = num;
                }
            }
        }
    }

    public static int[] merge (int [] a,int [] b){
        int aLength=0,bLength=0;
        if(a!=null){
            aLength = a.length;
        }
        if(b!=null){
            bLength = b.length;
        }
        int mergeLength = aLength + bLength;
        int [] merge = new int[mergeLength];
        int i;
        for (i = 0;i< aLength;i++){
            merge[i]=a[i];
        }
        for (int j = 0;j < bLength; j++){
            merge[i] = b[j];
            i++;
        }
//        advanceInsertSortWithBinarySearch(merge);
        bubble(merge);
        return merge;
    }

    public static void advanceInsertSortWithBinarySearch(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //从第二个元素开始遍历每个元素
            int temp = arr[i];
            int low = 0, high = i - 1;
            int mid = -1;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] > temp) {
                    high = mid - 1;
                } else { // 元素相同时，也插入在后面的位置
                    low = mid + 1;
                }
            }
            for(int j = i - 1; j >= low; j--) {
                arr[j + 1] = arr[j];
            }
            arr[low] = temp;
        }
    }

}
