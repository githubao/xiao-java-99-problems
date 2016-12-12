package org.xiao.learn.lesson._02_arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 获取合数的因子
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 21:46
 */
public class Lesson30 {
    public static List<Integer> primeFactors(int number) {
        List<Integer> fs = new ArrayList<>();
        IntStream.rangeClosed(2, number / 2).filter(Lesson29::isPrime).forEach(f -> {
            int n = number;
            while (n % f == 0) {
                n = n / f;
                fs.add(f);
            }
        });
        return fs;
    }
}
