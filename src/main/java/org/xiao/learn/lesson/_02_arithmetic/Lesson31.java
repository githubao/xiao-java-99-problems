package org.xiao.learn.lesson._02_arithmetic;

import org.xiao.learn.lesson._01_lists.Lesson10;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 获取合数的因子 和 个数
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 21:58
 */
public class Lesson31 {
    public static List<AbstractMap.SimpleEntry<Integer, Integer>> primeFactorsMult(int number) {
        return Lesson10.encode(Lesson30.primeFactors(number))
                .stream()
                .map(e -> new AbstractMap.SimpleEntry<>(e.getValue(), e.getKey()))
                .collect(Collectors.toList());
    }
}
