package org.xiao.learn.lesson._01_lists;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 列表变胖，复制指定的次数
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:18
 */
public class Lesson15 {
    public static <T> List<T> duplicate(final List<T> list, final int times) {
        return list.stream().flatMap(e -> Collections.nCopies(times, e).stream()).collect(Collectors.toList());
    }
}
