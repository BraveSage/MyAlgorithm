package com.lzz.javabase;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author lzz
 * 测试enummap
 */
public class TestEnumMap {

    public static void main(String[] args) {
        EnumMapTest.test();
    }
}

class EnumMapTest{
    public enum Color{
        RED,YELLOW,BLUE,GREEN
    }

    public static void test(){
        EnumMap<Color,String> map = new EnumMap(Color.class);
        //就是map类型，可以存放enum的各个属性，然后统一输出
        map.put(Color.BLUE,"蓝色");
        map.put(Color.GREEN,"绿色");
        map.put(Color.RED,"红色");
        map.put(Color.YELLOW,"黄色");


        for (Map.Entry<Color, String> entries : map.entrySet()){
            System.out.println(entries.getKey()+"："+entries.getValue());
        }
        //直接输出为{RED=红色, BLUE=蓝色, GREEN=绿色}
        System.out.println(map);

    }
}


