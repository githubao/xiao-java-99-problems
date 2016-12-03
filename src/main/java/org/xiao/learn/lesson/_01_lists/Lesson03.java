package org.xiao.learn.lesson._01_lists;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 找到列表的第k个元素
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 11:53
 */
public class Lesson03 {
    public static <T> T kth(final List<T> list, final int k) {
        return list.get(k-1);
    }

    public static <T> T kthRecursive(final LinkedList<T> list, final int k) {
        if (k == 1) {
            return list.getFirst();
        }
        return kthRecursive(new LinkedList<T>(list.subList(1, list.size())), k - 1);
    }

    public static <T> T kthStream(final List<T> list, final int k) {
        return list.stream().limit(k).collect(Collectors.toCollection(LinkedList::new)).getLast();
    }

}
