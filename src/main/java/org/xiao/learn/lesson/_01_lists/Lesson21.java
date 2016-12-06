package org.xiao.learn.lesson._01_lists;

import java.util.List;
import java.util.Map;

/**
 * 在列表指定位置插入数据
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/6 12:22
 */
public class Lesson21 {
    public static <T> List<T> insertAt(List<T> list, int pos, T t) {
        if (pos < 1) {
            throw new IllegalArgumentException("pos can't be less than 1");
        }
        list.add((pos - 1), t);
        return list;
    }

    public static <T> List<T> insertAtUsingSplit(List<T> list, int pos, T t) {
        if (pos < 1) {
            throw new IllegalArgumentException("pos can't be less than 1");
        }
        Map<Boolean, List<T>> split = Lesson17.split(list, pos);
        List<T> first = split.get(true);
        List<T> second = split.get(false);

        first.add(pos - 1, t);

        first.addAll(second);
        return first;
    }
}
