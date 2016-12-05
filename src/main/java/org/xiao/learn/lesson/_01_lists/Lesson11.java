package org.xiao.learn.lesson._01_lists;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 得到一个列表数据的分类个数统计 如果只有一个元素，不用统计个数
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 20:34
 */
public class Lesson11 {
    public static <T> List<Object> encodeModified(List<T> list) {
        return Lesson09.pack(list).stream().map(l -> {
            if (l.size() == 1) {
                return l.get(0);
            }
            return new AbstractMap.SimpleEntry<>(l.size(), l.get(0));
        }).collect(Collectors.toList());
    }
}
