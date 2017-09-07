package chapter3.s43.Test1;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.SerializationUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by zhiming.wu on 2017/9/7.
 */
public class Client {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Person f = new Person("王某某");
        Person s1 = new Person("大儿子",f);

       // Person s2 = s1.clone();//复制给小儿子，方式1：自己去重写clone方法-麻烦
        //使用SerializationUtils 进行深度拷贝，是一个比较简单的做法，Person必须要实现Serializable接口
        Person s2 = SerializationUtils.clone(s1);
       // Person s2 = (Person) BeanUtils.cloneBean(s1);//使用BeanUtils进行浅拷贝
        s2.setName("小儿子");

        s1.getFather().setName("干爹李某");

        System.out.println(s1.getName()+"的父亲是"+s1.getFather().getName());
        System.out.println(s2.getName()+"的父亲是"+s2.getFather().getName());

        SerializationUtils.clone(s1);
    }
}
