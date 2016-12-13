package org.xiao.learn.lesson._02_arithmetic;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 一个列表内的 所有偶数是 两个奇数之和
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 22:42
 */
public class Lesson34 {
    public static List<AbstractMap.SimpleEntry<Integer, List<Integer>>> goldBachList(IntStream range) {
        return range
                .filter(n -> n % 2 == 0)
                .filter(even -> even > 2)
                .mapToObj(even -> new AbstractMap.SimpleEntry<>(even, Lesson33.goldBach(even)))
                .collect(Collectors.toList());
    }

    public static List<AbstractMap.SimpleEntry<Integer, List<Integer>>> goldBachListGreater(IntStream range, int greaterThan) {
        return goldBachList(range)
                .stream()
                .filter(g -> g.getValue().get(0) > greaterThan && g.getValue().get(1) > greaterThan)
                .collect(Collectors.toList());
    }
}
