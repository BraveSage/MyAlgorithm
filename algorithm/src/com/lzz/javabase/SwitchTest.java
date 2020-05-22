package com.lzz.javabase;

public class SwitchTest {
    static final String  as ="hhh";
    static final Person person = new Person();

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "456";
        String s3 = "123";
        int a = EnumTest.A.val;
        System.out.println(as.hashCode());
        EnumTest test = EnumTest.A;
        switch (test) {
            case A:
                System.out.println("hello");
                break;
//            case s1:
//                System.out.println("hhh");
//                break;
//            case s2:
//                System.out.println("123");
//                break;
        }
    }

    enum EnumTest {
        A(1);
        int val;

        private EnumTest(int val) {
            this.val = val;
        }
    }
}
