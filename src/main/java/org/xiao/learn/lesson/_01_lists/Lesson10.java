package org.xiao.learn.lesson._01_lists;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 得到一个列表数据的分类个数统计
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 20:23
 */
public class Lesson10 {
    public static <T> List<AbstractMap.SimpleEntry<Integer, T>> encode(List<T> list) {
        return Lesson09.pack(list).stream().map(l -> new AbstractMap.SimpleEntry<>(l.size(), l.get(0))).collect(Collectors.toList());
    }
}
