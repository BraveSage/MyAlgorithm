package com.lzz.javabase;

import java.util.EnumSet;

/**
 * @author lzz
 * 测试EnumSet
 */
public class TestEnumSet {
    public static void main(String[] args) {
        EnumSet<Gfg> set1,set2,set3,set4;
        //选定指定的枚举类型
        set1 = EnumSet.of(Gfg.CODE,Gfg.CONTRIBUTE,Gfg.LEARN,Gfg.QUIZ);
        //非运算指定的枚举类型
        set2 = EnumSet.complementOf(set1);
        //指定枚举类的所有枚举类型
        set3 = EnumSet.allOf(Gfg.class);
        //按顺序的枚举类型范围内的所有枚举类型
        set4 = EnumSet.range(Gfg.CODE,Gfg.CONTRIBUTE);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
    }
}

enum Gfg{
    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
}
