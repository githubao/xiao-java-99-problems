package org.xiao.learn.lesson._01_lists;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 找到列表的最后一个元素
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/11/30 22:01
 */
public class Lesson01 {

    public static <T> T last(List<T> elements) {
        int numberOfElements = elements.size();
        return elements.get(numberOfElements - 1);
    }

    public static <T> T last(LinkedList<T> elements) {
        return elements.getLast();
    }

    public static <T> T lastRecursive(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new NoSuchElementException();
        }

        if (elements.size() == 1) {
            return elements.get(0);
        }
        return lastRecursive(elements.subList(1, elements.size()));
    }


}
