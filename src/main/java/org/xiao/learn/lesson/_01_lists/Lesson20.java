package org.xiao.learn.lesson._01_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 移除列表的第K个元素
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:55
 */
public class Lesson20 {
    public static <T> Object[] removeAt(List<T> list, int k) {
        List<T> input = new ArrayList<>(list);
        T kth = input.remove(k - 1);
        return new Object[]{input, kth};
    }

    public static <T> Object[] removeAt0(List<T> list, int k) {
        List<T> input = new ArrayList<>(list);
        T kth = input.remove(k);
        return new Object[]{input, kth};
    }

    public static <T> Object[] removeAtSplitAt(List<T> list, int k) {
        Map<Boolean, List<T>> split = Lesson17.split(list, k);
        List<T> first = split.get(true);
        List<T> second = split.get(false);

        T kth = first.remove(k - 1);
        first.addAll(second);
        return new Object[]{first, kth};
    }
}
