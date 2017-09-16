package com.wu.collection;

import java.util.*;

/**
 * Created by zhiming.wu on 2017/9/14.
 */
public class CollectionUtil {
    /**
     * 数组扩容
     *
     * @param datas
     * @param newLen
     * @param <T>
     * @return
     */
    public static <T> T[] expandCapacity(T[] datas, int newLen) {
        newLen = newLen < 0 ? 0 : newLen;//不能是负值
        return Arrays.copyOf(datas, newLen);//生成一个新数组，并拷贝原值
    }

    /**
     * 数组求和，对基本类型的求和计算，数组的效率是集合的10倍左右
     *
     * @param datas
     * @return
     */
    public static int sum(int[] datas) {
        int sum = 0;
        for (int i = 0; i < datas.length; i++) {
            sum += datas[i];
        }
        return sum;
    }

    /**
     * 列表求和
     *
     * @param datas
     * @return
     */
    public static int sum(List<Integer> datas) {
        int sum = 0;
        for (int i = 0; i < datas.size(); i++) {
            sum += datas.get(i);
        }
        return sum;
    }

    /**
     * 快速查找法求最大值，速度最快的算法
     *
     * @param datas
     * @return
     */
    public static int max(int[] datas) {
        int max = datas[0];
        for (int i : datas) {
            max = max > i ? max : i;
        }
        return max;
    }

    /**
     * 先排序后取最大值，数组在10000以下时候，和快速查找法效率差不多
     *
     * @param datas
     * @return
     */
    public static int sortMax(int[] datas) {
        Arrays.sort(datas.clone());
        return datas[datas.length - 1];
    }

    /**
     * 利用TreeSet求老二
     *
     * @param datas
     * @return
     */
    public static int getSecond(Integer[] datas) {
        //转换为列表
        List<Integer> dataList = Arrays.asList(datas);
        //转换为TreeSet，删除掉重复元素并且升序
        TreeSet<Integer> ts = new TreeSet<>(dataList);
        return ts.lower(ts.last());
    }

    /**
     * 不同的列表采用不用的遍历策略，个人觉得大部分情况使用foreach即可，
     * 但是linkedList一定要使用forEach，因为linkedList每一次的get(i),都要做一次遍历，性能非常差
     * @param scores
     * @return
     */
    private static int average(List<Integer> scores) {
        int sum = 0;
        if (scores instanceof RandomAccess) {
            for (int i = 0, size = scores.size(); i < size; i++) {
                sum += scores.get(i);
            }
        } else {
            for (int i : scores) {
                sum += i;
            }
        }
        return sum / scores.size();
    }
}
