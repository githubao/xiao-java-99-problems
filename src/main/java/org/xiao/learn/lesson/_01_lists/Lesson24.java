package org.xiao.learn.lesson._01_lists;

import java.util.List;

/**
 * 随机取列表指定范围内的多个元素
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 20:16
 */
public class Lesson24 {
    public static List<Integer> randomSelect(int n, int start, int end) {
        return Lesson23.randomSelectImperative(Lesson22.range(start, end), n);
    }
}
