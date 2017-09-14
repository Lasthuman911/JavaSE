package com.wu.collection;

import com.sun.xml.internal.stream.util.BufferAllocator;

import java.util.Arrays;

/**
 * Created by zhiming.wu on 2017/9/14.
 */
public class client {
    public static void main(String[] args) {
        //  expandCollection();//数组扩容实例

//        shallowCopyArray();//数组的浅拷贝-改变了box2 box1 也同时修改了
//        deepCopyArray();//遍历源数组实现深拷贝-简易方式
    }

    /**
     * 遍历源数组实现深拷贝
     */
    private static void deepCopyArray() {
        int boolNum = 7;//气球数量
        Baloon[] box1 = new Baloon[boolNum];
        for (int i = 0; i < boolNum; i++) {
            box1[i] = new Baloon(i, Color.values()[i]);//初始化第一个箱子中气球
        }
        Baloon[] box2 = new Baloon[boolNum];
        for (int i = 0;i<box1.length;i++){
            box2[i] = new Baloon(i,box1[i].getColor());
        }
        box2[6].setColor(Color.Blue);//修改第二个箱子的最后一个球的颜色
        for (Baloon baloon : box1) {
            System.out.println(baloon);
        }
    }

    /**
     * 数组的浅拷贝-改变了box2 box1 也同时修改了
     */
    private static void shallowCopyArray() {
        int boolNum = 7;//气球数量
        Baloon[] box1 = new Baloon[boolNum];
        for (int i = 0; i < boolNum; i++) {
            box1[i] = new Baloon(i, Color.values()[i]);//初始化第一个箱子中气球
        }
        Baloon[] box2 = Arrays.copyOf(box1, box1.length);//数组拷贝
        box2[6].setColor(Color.Blue);//修改第二个箱子的最后一个球的颜色
        for (Baloon baloon : box1) {
            System.out.println(baloon);
        }
    }

    /**
     * 数组扩容实例
     */
    private static void expandCollection() {
        Integer[] classes = new Integer[40];
        classes = collectionUtil.expandCapacity(classes, 80);
    }
}
