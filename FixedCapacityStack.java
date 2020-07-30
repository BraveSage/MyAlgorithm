package com.lzz.algorithm;


import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class FixedCapacityStack<T> {
    T[] items;
    int size;
    int capacity = 16;
    public FixedCapacityStack(int capacity) {
        items = (T [])new Object[capacity];
    }

    public FixedCapacityStack() {
        items = (T [])new Object[capacity];
    }

    void push(T t){
        if(size == capacity){
            resize(capacity = capacity<<1);
        }
        items[size++] = t;
    }

    void resize(int capacity){
        T[]temp = (T[])new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    T pop(){
        if(size < capacity>>2){
            resize(capacity = capacity>>1);
        }
        T item = items[--size];
        items[size] = null;
        return item;
    }

    T peek(){
        return items[size];
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    private class MyIterator implements Iterator<T>{
        int iSize = size;
        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer action) {

        }

        @Override
        public boolean hasNext() {
            return iSize > 0;
        }

        @Override
        public T next() {
            return items[iSize];
        }
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> stack = new FixedCapacityStack<>();
        stack.push("hello");
        stack.push("hello2");
        stack.push("hello3");

        System.out.println(stack.size);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size);



    }
}
