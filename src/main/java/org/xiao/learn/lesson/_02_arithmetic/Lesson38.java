package org.xiao.learn.lesson._02_arithmetic;

/**
 * 小于给定的数字的元素，所有的互质的个数(2)
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:43
 */
public class Lesson38 {
    public static int phi(int m) {
        return Lesson31.primeFactorsMult(m)
                .stream()
                .map(entry -> (entry.getKey() - 1) * Math.pow(entry.getKey(), entry.getValue() - 1))
                .mapToInt(Double::intValue)
                .reduce(1, (i1, i2) -> i1 * i2);
    }
}
