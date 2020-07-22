package com.lzz.book.algorithm;

public class Vector {

    private final double[] coords;

    public Vector(double[] coords) {
        this.coords = coords;
    }

    static int i = 5;
    public static void main(String[] args) {
        double[] n = {1.0, 3.0};
        Vector vector = new Vector(n);
        n[0] = 4.0;
        assert false : "程序停止";
        System.out.println(vector);
    }
}
