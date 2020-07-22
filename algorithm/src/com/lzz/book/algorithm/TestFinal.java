package com.lzz.book.algorithm;

import java.util.Collections;
import java.util.Vector;

public class TestFinal {

    int b = 3;

    final int a = b ;

    public static void main(String[] args) {
        TestFinal testFinal = new TestFinal();
        System.out.println(testFinal.a);
        testFinal.b = 4;
        System.out.println(testFinal.a);
        System.out.println(testFinal.b);

        double[] a = {3.0, 4.0};

    }
}
