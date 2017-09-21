package com.wu.genericity;

import java.util.List;

/**
 * Java的泛型是类型擦除的
 * listMethod方法类型擦除后两个方法参数是一样的都是List，方法签名重复,编译无法通过
 * 泛型：在编译后所有的泛型类型都会做相应的转化
 * Created by zhiming.wu on 2017/9/21.
 */
public class Foo {
    public void listMethod(List<String> stringList){};
    //public void listMethod(List<Integer> stringList){};

    public void arrayMethod(String[] strArray){};
    public void arrayMethod(Integer[] strArray){};
}
