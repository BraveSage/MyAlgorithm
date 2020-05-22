package com.lzz.javabase;

public class BinarySearch {

    static int middle;

    public static int binary(int[] array, int value){
        int low = 0;

        int size = array.length - 1;
        middle = 0;
        while(low <= size){
            middle = low+((size-low)>>1);
            if(array[middle]==value){
                return middle;
            }
            if(array[middle] < value){
                low = middle + 1;
            }
            if(array[middle] > value){
                size = middle - 1;
            }

        }

        if(array[middle]>value){
            return middle;
        }

        return middle+1;
    }



    public static void main(String[] args) {
        int array[] = new int[]{1,3,5,6};
        int binary = binary(array, 7);
        System.out.println(binary);
    }

}
