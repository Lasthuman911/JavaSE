package chapter3.s43.Test1;

import java.io.Serializable;

/**
 * 为什么要实现Cloneable：
 * 如果试图用一个不支持Cloneable接口的类调用clone( )方法，将引发一个CloneNotSupportedException异常
 *  Cloneable 接口只是个合法调用 clone() 的标识（marker-interface）
 * Created by zhiming.wu on 2017/9/7.
 */
public class Person implements Cloneable,Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    private Person father;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Person father) {
        this.name = name;
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    @Override
    public Person clone() {
        Person p = null;
        try {
            p = (Person) super.clone();//Object默认的clone方法是浅拷贝
            p.setFather(new Person(p.getFather().getName()));//加入此句，实现深拷贝
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
