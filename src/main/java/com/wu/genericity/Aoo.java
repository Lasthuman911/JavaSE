package com.wu.genericity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 编译器在编译时要获取T类型，但是泛型在编译期已经被擦除了，所以报错
 * Created by zhiming.wu on 2017/9/21.
 */
public class Aoo<T> {
    private List<T> list = new ArrayList<>();//ok,ArrayList中有做类型转换，具体看源码
//    private T t = new T();//编译不通过
//    private T[] tArray = new T[5];//编译不通过,不能初始化泛型参数的数组

    //不再初始化，由构造函数初始化
    private T t;
    private T[] tArray;
    public Aoo(){
        try {
            Class<?> tType = Class.forName("");
            t = (T) tType.newInstance();
            tArray = (T[]) Array.newInstance(tType,5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
