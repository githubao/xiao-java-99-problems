package org.xiao.learn.lesson._01_lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 列表的列表，按照元素个数排序
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 21:18
 */
public class Lesson28 {
    public static <T> List<List<T>> lsort(List<List<T>> list) {
        list.sort((xs1, xs2) -> xs1.size() - xs2.size());
        return list;
    }

    public static <T> List<List<T>> lfsort(List<List<T>> list) {
        Map<Integer, Integer> freqs = new HashMap<>();

        list.stream().map(List::size).forEach(l -> freqs.put(l, freqs.compute(l, (k, v) -> v == null ? 1 : v + 1)));
        return list.stream().sorted((xs1, xs2) -> freqs.get(xs1.size()) - freqs.get(xs2.size()))
                .collect(Collectors.toList());
    }
}
