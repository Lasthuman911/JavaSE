package com.wu.collection.sort;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Created by lszhen on 2017/9/17.
 */
public class City implements Comparable<City> {
    private String code;//城市代码
    private String name;//城市名称

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(String code, String name) {

        this.code = code;
        this.name = name;
    }

    @Override
    public int compareTo(City o) {
        return new CompareToBuilder().append(name, o.name).toComparison();//按照城市名称进行升序
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        City city = (City) obj;
        //根据name来判断是否相等-保持和compare一致
        return new EqualsBuilder().append(name, city.name).isEquals();//用开源框架
        //根据code来判断是否相等
//        return new EqualsBuilder().append(code, city.code).isEquals();//用开源框架
    }
}
