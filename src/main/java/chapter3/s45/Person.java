package chapter3.s45;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 复写equals：此例违反了自反性，解决方式：去掉trim
 * test2：equals 要做null检查
 * test3：一定要同时重写equals 和 hashCode方法
 * Created by zhiming.wu on 2017/9/8.
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 测试错误的实例时候，请启用此equals
     */
   /* @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (p.getName() == null || name == null) {
                return false;
            } else {
                //return name.equalsIgnoreCase(p.getName().trim());//注意这里的trim}
                return name.equalsIgnoreCase(p.getName());//注意这里的trim}
            }
        }
        return false;
    } */

    /**
     * 改为getClass 进行判断
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Person p = (Person) obj;
            if (p.getName() == null || name == null) {
                return false;
            } else {
                //return name.equalsIgnoreCase(p.getName().trim());//注意这里的trim}
                return name.equalsIgnoreCase(p.getName());//注意这里的trim}
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).toHashCode();//apache 开源的hash码生成器
    }

    public static void main(String[] args) {
        //test1();
        //testNull();
        Map<Person, Object> map = new HashMap<Person, Object>() {
            {
                put(new Person("zhangsan"), new Object());
            }
        };

        List<Person> list = new ArrayList<Person>(){
            {
                add(new Person("zhangsan"));//匿名内部类
            }
        };

        //列表是否包含
        System.out.println(list.contains(new Person("zhangsan")));
        //map 中是否包含
        System.out.println(map.containsKey(new Person("zhangsan")));//未重写hashCode导致结果为false

    }

    private static void testNull() {
        Person p1 = new Person("zhangsan");
        Person p2 = new Person(null);

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);

        System.out.println("ifExist p1 = " + personList.contains(p1));
        System.out.println("ifExist p2 = " + personList.contains(p2));
    }

    private static void test1() {
        Person p1 = new Person("zhangsan");
        Person p2 = new Person("zhangsan ");

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);

        System.out.println("ifExist p1 = " + personList.contains(p1));
        System.out.println("ifExist p2 = " + personList.contains(p2));//预期：true  实际：false
    }
}
