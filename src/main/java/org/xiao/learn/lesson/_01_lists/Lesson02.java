package org.xiao.learn.lesson._01_lists;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 找到列表的倒数第二个元素
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/2 21:56
 */
public class Lesson02 {
    public static <T> T secondLast(List<T> list) {
        if (list.size() < 2) {
            throw new NoSuchElementException("Can't find secondLast element from list with less than 2 elements");
        }

        return list.get(list.size() - 2);
    }

    public static <T> T secondLastRecursion(LinkedList<T> list) {
        if (list.size() < 2) {
            throw new NoSuchElementException("Can't find secondLast element from list with less than 2 elements");
        }
        if (list.size() == 2) {
            return list.getFirst();
        }

        return secondLastRecursion(new LinkedList<T>(list.subList(1, list.size())));
    }


}
