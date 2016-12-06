package org.xiao.learn.lesson._01_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 随机从列表中取n个元素
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/6 12:52
 */
public class Lesson23 {
    @Deprecated
    public static <T> List<T> randomSelect(List<T> list, int n) {
        return new Random().ints(0, list.size()).limit(n).mapToObj(list::get).collect(Collectors.toList());
    }

    public static <T> List<T> randomSelectRecursive(List<T> list, int n) {
        if (n == 0) {
            return Collections.emptyList();
        }
        Object[] objects = Lesson20.removeAt0(list, new Random().nextInt(list.size()));
        List<T> remaining = (List<T>) objects[0];
        T t = (T) objects[1];
        List<T> result = new ArrayList<>();
        result.add(t);
        result.addAll(randomSelectRecursive(remaining, n - 1));
        return result;
    }

    //    命令式
    public static <T> List<T> randomSelectImperative(List<T> list, int n) {
        List<T> result = new ArrayList<>();

        Random random = new Random();
        List<T> remaining = list;
        while (result.size() < n) {
            Object[] objects = Lesson20.removeAt0(remaining, random.nextInt(remaining.size()));
            remaining = (List<T>) objects[0];
            T t = (T) objects[1];
            result.add(t);
        }
        return result;
    }
}
