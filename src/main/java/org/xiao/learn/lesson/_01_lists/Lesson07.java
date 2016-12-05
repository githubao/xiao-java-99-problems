package org.xiao.learn.lesson._01_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 把列表变平 [1,[2,3],4] -> [1,2,3,4]
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 15:31
 */
public class Lesson07 {
    public static <T> List<T> flatten(List<?> list, Class<T> elementType) {
        List<T> flatten = new ArrayList<>();
        list.forEach(
                e -> {
                    if (e instanceof List) {
                        flatten.addAll(flatten((List<?>) e, elementType));
                    } else {
                        flatten.add((T) e);
                    }
                }
        );
        return flatten;
    }

    public static <T> List<T> flattenStream(List<?> list, Class<T> elementType) {
        return list
                .stream()
                .flatMap(e -> e instanceof List ? flattenStream((List<?>) e, elementType).stream() : Stream.of(e))
                .map(e -> (T) e)
                .collect(Collectors.toList());
    }
}
