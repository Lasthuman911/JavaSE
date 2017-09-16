package com.wu.collection.sort;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Comparable可以作为实现类的默认排序方法，Comparator是一个类的扩展排序工具
 * Created by lszhen on 2017/9/16.
 */
public class Employee implements Comparable<Employee> {
    private int id;//根据进入公司顺序编码
    private String name;//姓名
    private Positon positon;//职位

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Positon getPositon() {
        return positon;
    }

    public void setPositon(Positon positon) {
        this.positon = positon;
    }

    public Employee(int id, String name, Positon positon) {

        this.id = id;
        this.name = name;
        this.positon = positon;
    }

    @Override
    public int compareTo(Employee o) {
        return new CompareToBuilder()
                .append(positon, o.positon)
                .append(id, o.id).toComparison();//使用开源工具，安装职位和id升序
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);//使用开源工具
    }
}
