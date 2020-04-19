package com.learn.idea;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * created by administrator on 2020/4/17.
 */
public class HelloWorld {

    static final String wangxing ="aa";
    public static void AAA(String[] args) {
        System.out.println("hello world");
        String aa="";
        System.out.println(aa);
        try {
            FileInputStream f = new FileInputStream("wangxing");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
