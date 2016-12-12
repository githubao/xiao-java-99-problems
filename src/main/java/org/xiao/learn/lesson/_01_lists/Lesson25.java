package org.xiao.learn.lesson._01_lists;

import java.util.List;

/**
 * 生成一个给定列表的随机全排列
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 20:23
 */
public class Lesson25 {
    public static <T> List<T> randomPermutation(List<T> list) {
        return Lesson23.randomSelectRecursive(list, list.size());
    }
}
