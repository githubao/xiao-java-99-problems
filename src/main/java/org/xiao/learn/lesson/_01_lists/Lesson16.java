package org.xiao.learn.lesson._01_lists;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 移除固定位置的元素
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:23
 */
public class Lesson16 {
    public static <T> List<T> dropEveryNth(List<T> list, int n) {
        if (n == 0) {
            return list;
        }

        return IntStream.range(0, list.size())
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(list.get(i), i))
                .filter(entry -> (entry.getValue() + 1) % n != 0)
                .map(AbstractMap.SimpleEntry::getKey)
                .collect(Collectors.toList());
    }
}
