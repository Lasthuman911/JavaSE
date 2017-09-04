package chapter3.s38;

/**
 * Created by zhiming.wu on 2017/9/4.
 */
public class Person {
    private String name;
    private Home home;

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }


    public Person(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Home {
        public Home(String address, String tel) {
            this.address = address;
            this.tel = tel;
        }

        private String address;
        private String tel;


        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("张三");
        person.setHome(new Person.Home("上海", "021"));
    }
}
