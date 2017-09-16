package com.wu.collection;

import com.wu.collection.sort.Employee;
import com.wu.collection.sort.Positon;
import com.wu.collection.sort.PositonComparator;

import java.net.StandardSocketOptions;
import java.util.*;

/**
 * Created by zhiming.wu on 2017/9/14.
 */
public class Client {
    public static void main(String[] args) {
//        expandCollection();//数组扩容实例

//        shallowCopyArray();//数组的浅拷贝-改变了box2 box1 也同时修改了
//        deepCopyArray();//遍历源数组实现深拷贝-简易方式

//        testFastMaxTime();//4ms
//        testSortMaxTime();//2ms--数组比较小时，反而速度还快点

//        getSecodeWithTreeSet();求老二

//        testAsList();suggest65：避开基本类型数组转换列表陷阱
//        asListLengthNoChange();//asList 转换后的list长度不能更改

//        testAve();//测试ArrayList和LinkedList的遍历效率

//        testEquals();//集合的判断都只需要判断容器中的元素是否相等即可

//        subListTest();//sublist子列表只是原列表的一个view，所有修改都会反应在原表上

//        fastDelListElement();//利用subList的特性实现列表内的元素的快速删除

//        oriListChangeBug();//生成子表后不要再去修改原表

//        noModifyList();//防御式编程

//        sotListById();//按照职位和id升序
//        sortListbyPositon();//按照职位降序,使用sort的重载方式，自建一个排序类
//        sortListByPositonAsc();//Collections.reverse 实现,或者 Collections.reverseOrder

    }

    /**
     * Collections.reverse 或者 Collections.reverseOrder
     */
    private static void sortListByPositonAsc() {
        List<Employee> employeeList = new ArrayList<>(5);
        employeeList.add(new Employee(10001,"zhangsan", Positon.Boss));
        employeeList.add(new Employee(10002,"zhangsan", Positon.Manager));
        employeeList.add(new Employee(10008,"zhangsan", Positon.Manager));
        employeeList.add(new Employee(10004,"zhangsan", Positon.Staff));
        employeeList.add(new Employee(10003,"zhangsan", Positon.Staff));

        Collections.reverse(employeeList);//按照职位升序
//       Collections.sort(employeeList,Collections.reverseOrder(new PositonComparator()));//按照职位升序

        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    /**
     * 按照职位降序,使用sort的重载方式，自建一个排序类
     */
    private static void sortListbyPositon() {
        List<Employee> employeeList = new ArrayList<>(5);
        employeeList.add(new Employee(10001,"zhangsan", Positon.Boss));
        employeeList.add(new Employee(10002,"zhangsan", Positon.Manager));
        employeeList.add(new Employee(10008,"zhangsan", Positon.Manager));
        employeeList.add(new Employee(10004,"zhangsan", Positon.Staff));
        employeeList.add(new Employee(10003,"zhangsan", Positon.Staff));

        Collections.sort(employeeList,new PositonComparator());//按照职位降序

        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    /**
     * 按照id升序
     */
    private static void sotListById() {
        List<Employee> employeeList = new ArrayList<>(5);
        employeeList.add(new Employee(10001,"zhangsan", Positon.Boss));
        employeeList.add(new Employee(10002,"zhangsan", Positon.Manager));
        employeeList.add(new Employee(10008,"zhangsan", Positon.Manager));
        employeeList.add(new Employee(10004,"zhangsan", Positon.Staff));
        employeeList.add(new Employee(10003,"zhangsan", Positon.Staff));

        Collections.sort(employeeList);//按照id进行排序

        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    /**
     * 防御式编程，保证oriList只读
     */
    private static void noModifyList() {
        List<String> oriList = new ArrayList<>();
        oriList.add("wzm");
        oriList.add("lszhen");
        oriList.add("son");

        List<String> subList = oriList.subList(0,2);

        oriList = Collections.unmodifiableList(oriList);//设置列表为只读状态

        //Exception in thread "main" java.lang.UnsupportedOperationException
        // oriList.add("daughter");//在subList之后修改原list--设置为只读状态后就不允许对list进行修改了
//        doSomethingRead(oriList);//对原表进行读操作
//        doSomethingReadAndWrit(subList);//可以对子表进行读和写操作，但是创建了多个子表，则子表也不允许修改
        System.out.println("ori's length="+oriList.size());
        System.out.println("subList's length = "+ subList.size());
    }

    /**
     * 生成子表后不要再去修改原表
     */
    private static void oriListChangeBug() {
        List<String> oriList = new ArrayList<>();
        oriList.add("wzm");
        oriList.add("lszhen");
        oriList.add("son");

        List<String> subList = oriList.subList(0,2);

        oriList.add("daughter");//在subList之后修改原list

        System.out.println("ori's length="+oriList.size());
        System.out.println("subList's length = "+ subList.size());
        //Exception in thread "main" java.util.ConcurrentModificationException
    }

    /**
     * 利用subList的特性实现列表内的元素的快速删除
     */
    private static void fastDelListElement() {
        List<Integer> initList = Collections.nCopies(100,0);//初始化一个固定长度的不可变的列表
        ArrayList<Integer> list = new ArrayList<>(initList);//转换为可变列表
        list.subList(20,30).clear();//只需要一行代码即可删除 20～30 范围内的元素
    }

    /**
     * s子列表只是原列表的一个view，所有修改都会反应在原表上
     */
    private static void subListTest() {
        List<String> c = new ArrayList<>();
        c.add("wzm");
        c.add("lsz");

        List<String> c1 = new ArrayList<>(c);//Arrays.copyOf 实现的列表拷贝

        List<String> c2 = c.subList(0, c.size());//子列表只是原列表的一个view，所有修改都会反应在原表上
        c2.add("xiaohai");//同步修改了c

        System.out.println("c.equals(c1)===" + c.equals(c1));
        System.out.println("c.equals(c2)===" + c.equals(c2));

        for (String s : c) {
            System.out.println(s);
        }
    }

    /**
     * 集合的判断都只需要判断容器中的元素是否相等即可，不用考虑集合的类型
     */
    private static void testEquals() {
        ArrayList strs = new ArrayList();
        strs.add("wzm");

        Vector vector = new Vector();
        vector.add("wzm");

        System.out.println("是否相等=" + strs.equals(vector));
    }

    /**
     * 测试ArrayList和LinkedList的遍历效率
     */
    private static void testAve() {
        int stuNum = 80000;// * 10000;//学生数量
        List<Integer> scores = new ArrayList<>(stuNum);//记录所有学生分数
//        List<Integer> scores2 = new LinkedList<>(stuNum);//jdk1.8 的构造函数改了，注意一下

        for (int i = 0; i < stuNum; i++) {
            scores.add(new Random().nextInt(150));
        }

        List<Integer> scores2 = new LinkedList<>(scores);

        long start = System.currentTimeMillis();
//        System.out.println("平均分=" + average(scores));//33ms
        int result = average2(scores2);//花费的时间=3414ms---若使用linkedList 8000的数量就要3秒多
        System.out.println("平均分=" + result);//22~43 ms 和书上说的有点出入

        long end = System.currentTimeMillis();
        System.out.println("花费的时间=" + (end - start) + "ms");
    }

    /**
     * 使用foreach
     *
     * @param scores
     * @return
     */
    private static int average(List<Integer> scores) {
        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        return sum / scores.size();
    }

    /**
     * 使用for循环
     *
     * @param scores
     * @return
     */
    private static int average2(List<Integer> scores) {
        int sum = 0;
        for (int i = 0, size = scores.size(); i < size; i++) {
            sum += scores.get(i);
        }
        return sum / scores.size();
    }

    /**
     * asList 转换后的list长度不能更改
     */
    private static void asListLengthNoChange() {
        int[] datas = new int[]{1, 2, 4, 9, 3, 7, 88, 22, 34, 45, 39, 2, 99};
        //注意asList中生成的ArrayList是自己生成的内部类，并不是util包中的ArrayList，但是它并没有提供add方法的具体实现
        List list = Arrays.asList(datas);

        list.add(333);//Exception in thread "main" java.lang.UnsupportedOperationException
    }

    /**
     * 避开基本类型数组转换列表陷阱
     */
    private static void testAsList() {
        //基本类型不能作为范型参数，数组是一个对象，可以作为范型参数，例子中把一个int类型的数组作为了T（asList中）类型
        int[] datas = new int[]{1, 2, 4, 9, 3, 7, 88, 22, 34, 45, 39, 2, 99};
        List list = Arrays.asList(datas);
        System.out.println(list.size());//1
        System.out.println("元素类型" + list.get(0).getClass());//元素类型class [I
        System.out.println("前后是否相等" + datas.equals(list.get(0)));//前后是否相等true

//        修正之后的方式
        Integer[] data2s = new Integer[]{1, 2, 4, 9, 3, 7, 88, 22, 34, 45, 39, 2, 99};
        List list2 = Arrays.asList(data2s);
        System.out.println(list2.size());//13
    }

    /**
     * 通过TreeSet的特性求老二
     */
    private static void getSecodeWithTreeSet() {
        Integer[] datas = new Integer[]{1, 2, 4, 9, 3, 7, 88, 22, 34, 45, 39, 2, 99};
        int second = CollectionUtil.getSecond(datas);
        System.out.println("secode=" + second);
    }

    /**
     * 排序后求最大值测试
     */
    private static void testSortMaxTime() {
        long start = new Date().getTime();
        int[] datas = new int[]{1, 2, 4, 9, 3, 7, 88, 22, 34, 45, 39, 2, 99};
        CollectionUtil.sortMax(datas);
        for (int i : datas) {
            System.out.println(i);
        }
        long end = new Date().getTime();
        System.out.println("花费时间=" + (end - start) + "ms");
    }

    /**
     * 快速查找法：求最大值
     */
    private static void testFastMaxTime() {
        long start = new Date().getTime();
        int[] datas = new int[]{1, 2, 4, 9, 3, 7, 88, 22, 34, 45, 39, 2, 99};
        CollectionUtil.max(datas);
        for (int i : datas) {
            System.out.println(i);
        }
        long end = new Date().getTime();
        System.out.println("花费时间=" + (end - start) + "ms");
    }


    /**
     * 遍历源数组实现深拷贝
     */
    private static void deepCopyArray() {
        int boolNum = 7;//气球数量
        Baloon[] box1 = new Baloon[boolNum];
        for (int i = 0; i < boolNum; i++) {
            box1[i] = new Baloon(i, Color.values()[i]);//初始化第一个箱子中气球
        }
        Baloon[] box2 = new Baloon[boolNum];
        for (int i = 0; i < box1.length; i++) {
            box2[i] = new Baloon(i, box1[i].getColor());
        }
        box2[6].setColor(Color.Blue);//修改第二个箱子的最后一个球的颜色
        for (Baloon baloon : box1) {
            System.out.println(baloon);
        }
    }

    /**
     * 数组的浅拷贝-改变了box2 box1 也同时修改了
     */
    private static void shallowCopyArray() {
        int boolNum = 7;//气球数量
        Baloon[] box1 = new Baloon[boolNum];
        for (int i = 0; i < boolNum; i++) {
            box1[i] = new Baloon(i, Color.values()[i]);//初始化第一个箱子中气球
        }
        Baloon[] box2 = Arrays.copyOf(box1, box1.length);//数组拷贝
        box2[6].setColor(Color.Blue);//修改第二个箱子的最后一个球的颜色
        for (Baloon baloon : box1) {
            System.out.println(baloon);
        }
    }

    /**
     * 数组扩容实例
     */
    private static void expandCollection() {
        Integer[] classes = new Integer[40];//一个班级最多容纳40个人
        classes = CollectionUtil.expandCapacity(classes, 80);//数组扩容，一个班级可以容纳80个人了
    }
}
