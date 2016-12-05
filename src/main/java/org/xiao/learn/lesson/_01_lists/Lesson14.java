package org.xiao.learn.lesson._01_lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 复制一份列表元素，列表变胖
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:13
 */
public class Lesson14 {
    public static <T> List<T> duplicate(List<T> list) {
        return list.stream().flatMap(e -> Stream.of(e, e)).collect(Collectors.toList());
    }
}
