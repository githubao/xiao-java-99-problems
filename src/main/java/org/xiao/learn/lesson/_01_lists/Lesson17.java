package org.xiao.learn.lesson._01_lists;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 把列表，按给定的数字分成两部分
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:35
 */
public class Lesson17 {
    public static <T> Map<Boolean, List<T>> split(List<T> list, int n) {
        return IntStream
                .range(0, list.size())
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(i, list.get(i)))
                .collect(Collectors.partitioningBy(entry -> entry.getKey() < n, Collectors.mapping(AbstractMap.SimpleEntry::getValue, Collectors.toList())));
    }
}
