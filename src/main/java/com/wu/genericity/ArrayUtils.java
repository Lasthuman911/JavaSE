package com.wu.genericity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 数组工具类
 * Created by zhiming.wu on 2017/9/21.
 */
public class ArrayUtils {
    /**
     * 把一个变长参数转变为列表，并且长度可变
     * @param t
     * @param <T>
     * @return
     */
    public static <T>List<T> asList(T...t){
        List<T> list = new ArrayList<>();
        Collections.addAll(list,t);
        return list;
    }
}
