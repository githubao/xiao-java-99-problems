package org.xiao.learn.lesson._02_arithmetic;

import java.util.stream.LongStream;

/**
 * 是否是素数
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 21:41
 */
public class Lesson29 {
    public static boolean isPrime(long number) {
        return !LongStream.rangeClosed(2, Math.round(Math.sqrt(number))).anyMatch(n -> number % n == 0);
    }
}
