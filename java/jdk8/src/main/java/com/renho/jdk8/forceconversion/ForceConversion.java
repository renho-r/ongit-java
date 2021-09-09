package com.renho.jdk8.forceconversion;

import java.util.List;

public class ForceConversion {

    public static void main(String[] args) {
        List data = null;
        Object dataObj = null;
        if (data instanceof List) {
            System.out.println("is");
        } else {
            System.out.println("no");
        }

        data = (List) dataObj;
        System.out.println(data);
    }

}
