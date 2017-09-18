package com.wu.string;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lszhen on 2017/9/13.
 */
public class client {
    public static void main(String[] args) {
        testEquals();//test1:字符串常量池-建议52：多使用直接量

//        locationOfString();//建议55：注意字符串位置

//        testCostTime1();//测试 String + 需要的时间：1363 ms
//        testCostTime2();//测试 concat 需要的时间：516 ms
//        testCostTime3();//测试 StringBuilder 需要的时间：7 ms

//        splitTest();//初版简易的计算单词数
//        wordCounts();//建议57：使用正则表达式统计单词个数

//        getSubString();//字符串截取
//        getSubString2();//字符串截取2
//        testNull();//测试空null 的连接


    }

    /**
     * 试空null 的连接
     */
    private static void testNull() {
        String s = null;
        s += "abc";
        System.out.println(s);
    }

    /**
     * 字符串截取
     */
    private static void getSubString2() {
        String str = "com.wu.he";
        int lastIndex = str.lastIndexOf(".");
        System.out.println(lastIndex);
        String subString = str.substring(lastIndex + 1, str.length());
        System.out.println(subString);
    }

    /**
     * 字符串截取
     */
    private static void getSubString() {
        String str = "wzmhaha";
        String subStr = str.substring(0, 3);
        System.out.println(subStr);
    }

    /**
     * 使用正则表达式统计单词个数
     */
    private static void wordCounts() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.nextLine();
            Pattern pattern = Pattern.compile("\\b\\w+\\b");//正则表达式对象
            Matcher matcher = pattern.matcher(str);//生成匹配器
            int wordsCount = 0;
            while (matcher.find()) {
                wordsCount++;
            }
            System.out.println(str + " 单词数： " + wordsCount);
        }
    }

    /**
     * 初版简易的计算单词数
     */
    private static void splitTest() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.nextLine();
            int wordsCount = str.split(" ").length;
            System.out.println(str + " 单词数： " + wordsCount);
        }
    }

    /**
     * 测试StringBuilder append 花费时间
     */
    private static void testCostTime3() {
        long begin = new Date().getTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            builder.append("c");
        }
        long end = new Date().getTime();
        System.out.println(end - begin + "ms");
    }

    /**
     * 测试concat 花费时间
     */
    private static void testCostTime2() {
        long begin = new Date().getTime();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str = str.concat("c");
        }
        long end = new Date().getTime();
        System.out.println(end - begin + "ms");
    }

    /**
     * 测试 +  花费时间
     */
    private static void testCostTime1() {
        long begin = new Date().getTime();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += "c";
        }
        long end = new Date().getTime();
        System.out.println(end - begin + "ms");
    }

    /**
     * 字符串位置不同，结果不同
     */
    private static void locationOfString() {
        String str1 = "apple" + 1 + 2;
        String str2 = 1 + 2 + "apple";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    /*字符串常量池*/
    private static void testEquals() {
        String str1 = "wzm";
        String str2 = "wzm";
        String str3 = new String("wzm");
        String str4 = str3.intern();
        String str5 = new String(str1);

        System.out.println("str1?=str2 = " + (str1 == str2));//两个直接量相等

        System.out.println("str1?=str3 = " + (str1 == str3));//直接量和new对象不相等
        System.out.println("str1.equals(str3)=" + (str1.equals(str3)));

        System.out.println("str1?=str4 = " + (str1 == str4));//直接量和经过intern处理的对象相等

        System.out.println("str1.equals(str5)=" + (str1.equals(str5)));
        System.out.println("str1?=str5=" + (str1 == str5));
    }
}
