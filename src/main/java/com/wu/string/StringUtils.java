package com.wu.string;

import java.util.*;

/**
 * Created by lszhen on 2017/9/13.
 */
public class StringUtils {

    /**
     * 字符串替换
     * @param source
     * @param sub
     * @return
     */
    public static String remove(String source, String sub) {
        return source.replace(sub, "");//建议53：推荐使用replace方法进行字符串替换的操作
        //return source.replaceAll(sub,"");//-1.5之前,第一个参数需要是正则表达式，容易产生bug
    }

    /**
     * 生成UUID
     * @return
     */
    public static String UUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 对象转换为String类型
     * @param obj
     * @return
     */
    public static String toString(Object obj) {
        if (("").equals(obj) || obj == null) {
            return "";
        } else {
            return obj.toString();
        }
    }

    /**
     * 判断对象是否为null 或者 ""
     * @param obj
     * @return
     */
    public static boolean isNullOrEmpty(Object obj) {
        if (("").equals(obj) || obj == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断对象不为空
     * @param obj
     * @return
     */
    public static boolean isNotNullOrEmpty(Object obj) {
        return !isNullOrEmpty(obj);
    }

    /**
     * JSON串转换为List
     * @param text
     * @return
     */
    public static List<Map<String, Object>> JSONstringToList(String text) {
        if (text == null || "".equals(text)) {
            return null;
        }
        text = text.trim();
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        if (!"[]".equals(text)) {
            // 去除字符串空格
            text = text.replace(" ", "");
            // 替找字符串map标识
            text = text.replace("}, {", ";");
            text = text.replace("},{", ";");
            text = text.substring(2, text.length() - 2);
            // 获取map数组
            String[] strarray = text.split(";");

            Map<String, Object> map = null;
            // 遍历map数组字符串,并转换成map对象
            for (String strs : strarray) {
                String[] stMap = strs.split(",");
                map = new HashMap<String, Object>();
                for (String strMap : stMap) {
                    String[] sMap = strMap.split("=");
                    map.put(sMap[0], sMap[1]);
                }
                list.add(map);
            }
            return list;
        }
        return list;
    }
}