package com.lzz.book.algorithm;

public class Counter {

    int count;
    String name;

    public Counter(String name) {
        this.name = name;
    }

    public void increment(){
        count++;
    }

    @Override
    public String toString(){
        return name+count;
    }


    public static void main(String[] args) {
        Counter c1 = new Counter("hello");
        c1.increment();
        Counter c2 = c1;
        c2.increment();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);
    }
}
