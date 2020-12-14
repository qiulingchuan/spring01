package com.spm.om.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author skyqlc
 * @name com.spm.om.test
 * @create 2020/10/24:1:28
 */
public class streamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        list.add("世界加油");

        long count = list.stream().distinct().count();
        System.out.println(count);
    }
}
