package org.xiao.learn.lesson._01_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 列表元素去重，要保持相对顺序不变
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 19:57
 */
public class Lesson08 {
    public static <T> List<T> compress(List<T> list) {
        Objects.requireNonNull(list, "Please make sure list is not null");
        List<T> result = new ArrayList<>();
        T lastElement = null;
        for (T e : list) {
            if (!Objects.equals(lastElement, e)) {
                result.add(e);
            }
            lastElement = e;
        }
        return result;
    }
}
