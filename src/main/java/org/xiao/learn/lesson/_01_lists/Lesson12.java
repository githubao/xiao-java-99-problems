package org.xiao.learn.lesson._01_lists;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.AbstractMap.SimpleEntry;


/**
 * 把一个统计总数的列表，还原成原来的列表
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 20:53
 */
public class Lesson12 {
    public static <T> List<T> decode(List<Object> encoded) {
        return encoded.stream().flatMap(e -> {
            if (e instanceof SimpleEntry) {
                SimpleEntry<Integer, T> entry = (SimpleEntry<Integer, T>) e;
                return Collections.nCopies(entry.getKey(), entry.getValue()).stream();
            }
            return Stream.of((T) e);
        }).collect(Collectors.toList());
    }
}
