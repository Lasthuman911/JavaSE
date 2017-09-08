package chapter3.s49;

/**
 * 复写toString
 * Created by zhiming.wu on 2017/9/8.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(new Person("wzm"));
    }
}

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }*/
    @Override
    public String toString() {
        return String.format("%s{name='%s'}",this.getClass(),name);
    }

    public Person(String name) {

        this.name = name;
    }
}
