package com.lzz.lineardatastructure;

import java.util.Arrays;

public class ArraysList<T>  {


    private transient Object[] elementData;

    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public ArraysList() {
        this(DEFAULT_CAPACITY);
    }

    public ArraysList(int initialCapacity) {
        if(initialCapacity<0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        elementData = new Object[initialCapacity];

    }

    public void add(T object) {
        ensureExplicitCapacity(size+1);
        elementData[size++]=object;

    }

    public void add(int index,T object) {
        rangeCheck(index);
        ensureExplicitCapacity(size+1);
        System.arraycopy(elementData, index, elementData, index+1, size);
        elementData[index]=object;
        size++;

    }

    public boolean remove(T object) {
        for(int i=0;i<elementData.length;i++){
            Object element=elementData[i];
            if(element.equals(object)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    public Object remove(int index) {
        Object object=get(index);
        int numMoved = elementData.length-index-1;
        if(numMoved>0){
            System.arraycopy(elementData, index+1, elementData, index, numMoved);
        }
        elementData[--size]=null;
        return object;
    }

    public int getSize() {
        return size;
    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    /**
     * 更新
     */
    public void update(int index, Object obj) {
        rangeCheck(index);
        remove(index);
        T t =(T)obj;
        add(t);
    }

    /**
     * 扩容
     * @param minCapacity
     */
    public void ensureExplicitCapacity(int minCapacity){
        if(size==minCapacity){
            int oldCapacity=elementData.length;
            int newCapacity=oldCapacity+(oldCapacity >>1);
            if(newCapacity < minCapacity){
                newCapacity = minCapacity;
            }
            elementData= Arrays.copyOf(elementData, newCapacity);
        }

    }
    /**
     * 检测数组是否下标越界
     * @param index
     */
    private void rangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("length--->"+index);
        }
    }


    static int test(){
        int x= 2;
        int temp = x;
        x = 3;
        return temp;
    }

    public static void main(String[] args) {

        System.out.println(test());
    }

}
