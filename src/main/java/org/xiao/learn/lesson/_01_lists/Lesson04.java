package org.xiao.learn.lesson._01_lists;

import java.util.List;

/**
 * 获取列表长度
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 12:13
 */
public class Lesson04 {
    public static <T> int length(List<T> list) {
        return list.size();
    }

    public static <T> long lengthStream(List<T> list) {
        return list.stream().count();
    }

    public static <T> long lengthStream2(List<T> list) {
        return list.stream().mapToInt(x -> 1).sum();
    }

    public static <T> int lengthRecursive(List<T> list) {
        return _lengthRecursive(list, 0);
    }

    private static <T> int _lengthRecursive(List<T> list, int i) {
        if (list.isEmpty()) {
            return i;
        }
        return _lengthRecursive(list.subList(1, list.size()), ++i);
    }
}
