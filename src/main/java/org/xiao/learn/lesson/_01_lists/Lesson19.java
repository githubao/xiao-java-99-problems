package org.xiao.learn.lesson._01_lists;

import java.util.List;
import java.util.Map;

/**
 * 从第n个元素开始，交换两个子列表的位置
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:48
 */
public class Lesson19 {
    public static <T> List<T> rotate(List<T> list, int n) {
        n = n < 0 ? list.size() + n : n;
        Map<Boolean, List<T>> split = Lesson17.split(list, n);
        List<T> result = split.get(false);
        result.addAll(split.get(true));
        return result;
    }
}
