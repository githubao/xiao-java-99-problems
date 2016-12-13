package org.xiao.learn.lesson._02_arithmetic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 表示任意一个偶数为两个素数之和
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 22:30
 */
public class Lesson33 {
    public static List<Integer> goldBach(int number) {
        if (number == 2) {
            return Collections.emptyList();
        } else if (number % 2 != 0) {
            return Collections.emptyList();
        }

        List<Integer> primeNumbers = Lesson32.primeNumbers(IntStream.range(2, number));
        for (int primeNumber : primeNumbers) {
            if (primeNumbers.contains(number - primeNumber)) {
                return Arrays.asList(primeNumber, number - primeNumber);
            }
        }

        throw new RuntimeException("Should not have happened");
    }
}
