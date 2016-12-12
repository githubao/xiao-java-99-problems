package org.xiao.learn.lesson._01_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * 给定一个列表，给定K个，所有的全排列
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 20:28
 */
public class Lesson26 {
    public static <T> List<List<T>> combinations(List<T> list, int k) {
        if (k == 0 || list.isEmpty()) {
            return Collections.emptyList();
        }
        if (k == 1) {
            return list.stream().map(e -> Stream.of(e).collect(toList())).collect(toList());
        }

        Map<Boolean, List<T>> headAnTail = Lesson17.split(list, 1);
        List<T> head = headAnTail.get(true);
        List<T> tail = headAnTail.get(false);

        List<List<T>> c1 = combinations(tail, (k - 1)).stream().map(e -> {
            List<T> l = new ArrayList<T>();
            l.addAll(head);
            l.addAll(e);
            return l;
        }).collect(Collectors.toList());

        List<List<T>> c2 = combinations(tail, k);
        c1.addAll(c2);

        return c1;
    }
}
