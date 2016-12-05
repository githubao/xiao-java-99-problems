package org.xiao.learn.lesson._01_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 把包含的重复的子元素，放在子列表
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 20:08
 */
public class Lesson09 {
    public static <T> List<List<T>> pack(List<T> list) {
        T lastElement = null;
        List<List<T>> packedList = new ArrayList<>();
        List<T> elements = new ArrayList<>();
        for (T e : list) {
            if (!Objects.equals(lastElement, e)) {
                elements = new ArrayList<>();
                packedList.add(elements);
            }
            elements.add(e);
            lastElement = e;
        }
        return packedList;
    }
}
