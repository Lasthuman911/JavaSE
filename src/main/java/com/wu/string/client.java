package com.wu.string;

/**
 * Created by lszhen on 2017/9/13.
 */
public class client {
    public static void main(String[] args) {
//        testEquals();//test1:字符串常量池-建议52：多使用直接量


    }

    /*字符串常量池*/
    private static void testEquals() {
        String str1 = "wzm";
        String str2 = "wzm";
        String str3 = new String("wzm");
        String str4 = str3.intern();

        System.out.println("str1?=str2 = "+(str1 == str2));//两个直接量相等
        System.out.println("str1?=str3 = "+(str1 == str3));//直接量和new对象不相等
        System.out.println("str1?=str4 = "+(str1 == str4));//直接量和经过jitern处理的对象相等
    }
}
