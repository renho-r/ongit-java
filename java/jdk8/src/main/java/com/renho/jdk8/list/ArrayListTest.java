package com.renho.jdk8.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Long> data = new ArrayList<>();
//        System.out.println(data.get(0));
//        System.out.println("" + data.get(0));
//        System.out.println(Long.parseLong("" + data.get(0)));
        data.add(null);
        System.out.println(data.size());
        System.out.println(data.get(0));

        data.add(100L);
        System.out.println(data.size());
        System.out.println(data.get(1));
    }

}
