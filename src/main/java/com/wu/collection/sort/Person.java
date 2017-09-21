package com.wu.collection.sort;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * Created by lszhen on 2017/9/17.
 */
public class Person implements Comparable<Person> {
        private int height;//高度

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(int height) {

        this.height = height;
    }

    @Override
    public int compareTo(Person o) {
        return new CompareToBuilder().append(height, o.height).toComparison();
        // return height-o.height;
    }
}
