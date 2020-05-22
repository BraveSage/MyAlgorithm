package com.lzz.javabase;

public class BinarySearch2{
    public static void main(String  args[]){
        int array[]={3,5,6,8,12,19,26,35,35,35,35,54,65};
        int i = binary2(35, array);
        System.out.println(i);
    }

    public static int binary(int target,int [] array){
//        int array[]={3,5,6,8,12,19,26,35,35,35,35,54,65};
        int temp = -1;
        int low = 0;
        int high=array.length;

        while(low<=high){
            int mid = low + (high-low)/2;
            //如果中间值比目标值小，说明目标值在右边，则将mid + 1 赋给left
            if(array[mid] <= target){
                low = mid + 1;
                if(array[mid] == target){
                    //将查出来的索引值赋给temp
                    temp = mid;
                }
            }
            else{
                //如果中间值比目标值大，证明目标值在左边，则将其减一赋给right
                high = mid -1;
            }

        }
        return temp;
    }

    public static int binary2(int target,int [] array){
        int temp = -1;
        int temp2 = -1;
        int low = 0;
        int low2 = 0;
        int high=array.length;
        int high2 = high;

//        while(low<=high){
//            int mid = low + (high-low)/2;
//            //如果中间值比目标值小，说明目标值在右边，则将mid + 1 赋给left
//            if(array[mid] <= target){
//                low = mid + 1;
//                if(array[mid] == target){
//                    //将查出来的索引值赋给temp
//                    temp = mid;
//                }
//            }
//            else{
//                //如果中间值比目标值大，证明目标值在左边，则将其减一赋给right
//                high = mid -1;
//            }
//
//        }
//        int low = 0;

        int size = array.length - 1;
        int middle = 0;
        while(low <= size){
            middle = low+((size-low)>>1);
            if(array[middle]>=target){
                temp2 = middle;
                if(array[middle] > target){
                    size = middle - 1;
                }else {

                }
            }
            if(array[middle] < target){
                low = middle + 1;
            }
            if(array[middle] > target){
                size = middle - 1;
            }

        }
        return middle;
    }

    /**
     *
     * @param arr 数组
     * @param n
     * @param begin
     * @param end
     * @return
     */
    public static int[] search1(int[] arr,int n,int begin,int end){
        int mid=begin+(end-begin)/2;
        if(n<arr[begin] || n>arr[end] || arr[begin]>arr[end]) {
            return new int[]{-1,-1};
        }
        if(arr[mid]<=n) {
            return search1(arr,n,mid+1,end);
        } else if(arr[mid]>=n) {
            return search1(arr,n,begin,mid-1);
        } else {
            return new int[]{};
        }

    }
}
