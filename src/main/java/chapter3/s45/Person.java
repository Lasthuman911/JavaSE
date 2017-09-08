package chapter3.s45;

import java.util.ArrayList;
import java.util.List;

/**
 * 复写equals：此例违反了自反性，解决方式：去掉trim
 * Created by zhiming.wu on 2017/9/8.
 */
public class Person {
    private String name;

    public Person(){}
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){
            Person p = (Person) obj;
            return name.equalsIgnoreCase(p.getName().trim());//注意这里的trim
        }
        return false;
    }

    public static void main(String[] args) {
        Person p1 = new Person("zhangsan");
        Person p2 = new Person("zhangsan ");

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);

        System.out.println("ifExist p1 = "+personList.contains(p1));
        System.out.println("ifExist p2 = "+personList.contains(p2));//预期：true  实际：false
    }
}
