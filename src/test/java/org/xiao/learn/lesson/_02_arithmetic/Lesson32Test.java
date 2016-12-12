package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * 获取区间内的所有素数 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 22:22
 */
public class Lesson32Test {
    @Test
    public void shouldGiveAllPrimeNumbersBetween2And10() throws Exception {
        List<Integer> primeNumbers = Lesson32.primeNumbers(IntStream.rangeClosed(2, 10));
        assertThat(primeNumbers, hasSize(4));
        assertThat(primeNumbers, hasItems(2, 3, 5, 7));
    }

    @Test
    public void shouldGiveAllPrimeNumbersBetween7And31() throws Exception {
        List<Integer> primeNumbers = Lesson32.primeNumbers(IntStream.rangeClosed(7, 31));
        assertThat(primeNumbers, hasSize(8));
        assertThat(primeNumbers, hasItems(7, 11, 13, 17, 19, 23, 29, 31));
    }

    @Test
    public void shouldGiveAllPrimeNumbersBetween2And10Sieve() throws Exception {
        List<Integer> primeNumbers = Lesson32.primeNumbersSieve(2, 10);
        assertThat(primeNumbers, hasSize(4));
        assertThat(primeNumbers, hasItems(2, 3, 5, 7));
    }

    @Test
    public void shouldGiveAllPrimeNumbersBetween7And31Sieve() throws Exception {
        List<Integer> primeNumbers = Lesson32.primeNumbersSieve(7, 31);
        assertThat(primeNumbers, hasSize(8));
        assertThat(primeNumbers, hasItems(7, 11, 13, 17, 19, 23, 29, 31));
    }
}