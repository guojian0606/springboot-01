package com.atguigu.springboot.controller;

import java.util.concurrent.ConcurrentHashMap;

public class TestController {
    public static void main(String[] args) {
        String s1 = "programming";
        String s2 = new String("programming");
        String s3 = "program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s2.intern());

        int i = 0;
        int j = 1;
    }

}
