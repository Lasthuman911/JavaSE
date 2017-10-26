package com.wu.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 * Created by zhiming.wu on 2017/9/21.
 */
public class client {
    public static void main(String[] args) {
//        test1A();//编译后的字节码没有泛型信息，这两个方法其实是一样的
//        test1B();

//        test2();//泛型的class对象是相同的

//        test3();//可以声明带泛型参数的数组，但是不能初始化该数组

//        test4();//instanceof 不允许存在泛型参数

//        test5();//无法从代码中推断出泛型类型的情况，即可强制声明泛型类型
    }

    /**
     * 无法从代码中推断出泛型类型的情况，即可强制声明泛型类型
     */
    private static void test5() {
        List<String> list1 = ArrayUtils.asList("wzm","lszen");//正常用法
        List list2 = ArrayUtils.asList();//参数为空
        List<Integer> list2a = ArrayUtils.asList();//改进后
        List list3 = ArrayUtils.asList(1,2,3.1);//参数为整数，浮点数的混合--此时返回类型为list<Object>,并不是我们想要的
        List<Number> list3a = ArrayUtils.<Number>asList(1,2,3.1);//参数为整数，浮点数的混合--改进后
    }

    /**
     * instanceof 不允许存在泛型参数
     */
    private static void test4() {
        List<String> aList = new ArrayList<>();
//        System.out.print(aList instanceof List<String>);//instanceof 不允许存在泛型参数
        System.out.println(aList instanceof List);
        System.out.println(aList instanceof List<?>);//如果不限定类型界限，通过编译
    }

    /**
     * 可以声明带泛型参数的**数组，但是不能初始化该数组
     */
    private static void test3() {
        List<String>[] listArray;
//        List<String>[] listArrayB = new List<String>[];
    }

    /**
     * 泛型的class对象是相同的
     */
    private static void test2() {
        List<String> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        System.out.println(aList.getClass() == bList.getClass());//true
    }

    /**
     * 编译后的字节码没有泛型信息
     */
    private static void test1B() {
        List aList = new ArrayList<>();
        aList.add("lszhen");
        String str = (String) aList.get(0);
    }

    /**
     * 编译后的字节码没有泛型信息
     */
    private static void test1A() {
        List<String> aList = new ArrayList<>();
        aList.add("lszhen");
        String str = aList.get(0);
    }
}
