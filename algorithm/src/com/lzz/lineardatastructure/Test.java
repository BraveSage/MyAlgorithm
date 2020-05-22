package com.lzz.lineardatastructure;

public class Test {

    public static void main(String[] args) {
        Object[] list = new Object[]{0,1,2,3,4,5,6};

        Object[] desc = desc2(list);
        for (int i =0; i <= desc.length -1 ; i++){
            System.out.println(desc[i]);
        }
    }

    static Object[] desc(Object[] list){
        int length = list.length;
        Object[] elementData = new Object[length];
        for (int i = 0; i <= length -1;  i++){
            elementData[length-i-1] = list[i];
        }

        return elementData;
    }

    static Object[] desc2(Object[] list){
        Object temp ;
        int length = list.length - 1;
        int i1 = length >> 1;
        for (int i = 0; i < i1; i++){
            temp = list[i];
            list[i] = list[length - i];
            list[length - i] = temp;
        }
        return list;
    }

}
