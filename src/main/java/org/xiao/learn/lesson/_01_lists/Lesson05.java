package org.xiao.learn.lesson._01_lists;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

/**
 * 反转列表
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 13:57
 */
public class Lesson05 {

    public static <T> List<T> reverse(List<T> list) {
        if (null == list) {
            throw new IllegalArgumentException("list can't be null");
        }
        Collections.reverse(list);
        return list;
    }

    public static <T> List<T> reverseForEach(List<T> list) {
        if (null == list) {
            throw new IllegalArgumentException("list can't be null");
        }
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static <T> List<T> reverseIntStream(List<T> list) {
        if (null == list) {
            throw new IllegalArgumentException("list can't be null");
        }
        int size = list.size();
        return IntStream.iterate(size - 1, e1 -> e1 - 1).limit(size).mapToObj(list::get).collect(Collectors.toList());
    }

    public static <T> List<T> reverseCustomStream(ArrayDeque<T> list) {
        if (null == list) {
            throw new IllegalArgumentException("list can't be null");
        }
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(list.descendingIterator(), Spliterator.ORDERED), false).collect(Collectors.toList());
    }

}
