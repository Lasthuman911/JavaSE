package chapter3.s43.test2.difPackage;

import chapter3.s43.test2.Person;

/**
 * 不同包的情况下，不能访问基类实例本身的受保护成员
 * Created by zhiming.wu on 2017/9/6.
 */
public class Student extends Person{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.a);
        System.out.println(student.getA());

        Person person = new Person();
//        System.out.println("person.a="+person.a);//编译报错
//        System.out.println("person.getA()="+person.getA());//编译报错
    }
}
