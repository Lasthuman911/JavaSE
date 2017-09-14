package com.wu.collection;

import java.util.Arrays;

/**
 * Created by zhiming.wu on 2017/9/14.
 */
public class collectionUtil {
    /**
     * 数组扩容
     * @param datas
     * @param newLen
     * @param <T>
     * @return
     */
    public static <T> T[] expandCapacity(T[] datas, int newLen) {
        newLen = newLen < 0 ? 0 : newLen;//不能是负值
        return Arrays.copyOf(datas, newLen);//生成一个新数组，并拷贝原值
    }
}
