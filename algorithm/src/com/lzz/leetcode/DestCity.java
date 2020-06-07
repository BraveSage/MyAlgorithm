package com.lzz.leetcode;

import java.util.HashSet;
import java.util.List;

/**
 * 两个城市之间的距离
 */
public class DestCity {
    public String destCity(List<List<String>> paths) {
        HashSet set = new HashSet();
        for (List path : paths){
            set.add(path.get(0));
        }

        for (List path2: paths){
            if(!set.contains(path2.get(1))){
                return (String) path2.get(1);
            }
        }
        return null;
    }
}
