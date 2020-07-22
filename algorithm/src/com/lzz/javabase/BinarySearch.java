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
        int array[] = new int[]{1,2,3,4,6};
        int binary = binary(array, 5);
        System.out.println(binary);
    }

}
