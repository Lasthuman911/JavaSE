package chapter3.s45;

/**
 * 这个实例要说明的是：尽量用getClass判断 而不是 isinstance
 * Created by zhiming.wu on 2017/9/8.
 */
public class Employee extends Person {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            return super.equals(obj) && employee.getId().equals(id);
        }
        return false;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("wzm","1000");
        Employee e2 = new Employee("wzm","1001");
        Person p1 = new Person("wzm");

        System.out.println("p1.equals(e1) = "+p1.equals(e1));//true ---预期：false
        System.out.println("p1.equals(e2) = "+p1.equals(e2));//true --预期：false
        System.out.println("e1.equals(e2) = "+e1.equals(e2));//false
    }
}
