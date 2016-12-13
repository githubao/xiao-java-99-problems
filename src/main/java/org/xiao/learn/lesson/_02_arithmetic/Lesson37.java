package org.xiao.learn.lesson._02_arithmetic;

import java.util.stream.IntStream;

/**
 * 小于给定的数字的元素，所有的互质的个数
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:38
 */
public class Lesson37 {
    public static long phi(int m) {
        return IntStream.rangeClosed(1, m).filter(r -> Lesson36.coprime(r, m)).count();
    }
}
