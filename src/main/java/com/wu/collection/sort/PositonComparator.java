package com.wu.collection.sort;

import java.util.Comparator;

/**
 * Comparable可以作为实现类的默认排序方法，Comparator是一个类的扩展排序工具
 * Created by lszhen on 2017/9/16.
 */
public class PositonComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getPositon().compareTo(o2.getPositon());//按照职位的降序，因为B E S
    }
}
