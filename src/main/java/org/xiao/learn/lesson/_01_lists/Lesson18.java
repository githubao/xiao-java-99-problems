package org.xiao.learn.lesson._01_lists;

import java.util.List;

/**
 * 列表切片
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:43
 */
public class Lesson18 {
    public static <T> List<T> slice(List<T> list, int start, int end) {
        return list.subList(start - 1, end);
    }
}
