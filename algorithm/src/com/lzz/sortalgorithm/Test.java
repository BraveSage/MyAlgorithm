package com.lzz.sortalgorithm;

import java.util.concurrent.CountDownLatch;

public class Test {

    static class T{
        volatile long p1, p2,p3,p4,p5,p6,p7,p21;
        volatile long x;
        volatile long p8, p9,p10,p11,p12,p13,p14,p23;
    }

    static T[] t = new T[2];


    static long count = 100000000L;

    public static void main(String[] args) throws InterruptedException{
        long startTime = System.currentTimeMillis();
        t[0] = new T();
        t[1] = new T();

        CountDownLatch latch = new CountDownLatch(2);
        new Thread(()->{
            for (int i = 0; i< count; i++){
                t[0].x = 0;
            }
            latch.countDown();
        }).start();
        new Thread(()->{
            for (int i = 0; i< count; i++){
                t[1].x = 1;
            }

            latch.countDown();
        }).start();

        latch.await();

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }
}
