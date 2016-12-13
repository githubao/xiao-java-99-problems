package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * 一个列表内的 所有偶数是 两个奇数之和 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:02
 */
public class Lesson34Test {
    @Test
    public void shouldProduceAListOfGoldBachCompositions() throws Exception {
        List<AbstractMap.SimpleEntry<Integer, List<Integer>>> compositions = Lesson34.goldBachList(IntStream.rangeClosed(9, 20));
        assertThat(compositions, hasSize(6));
        assertThat(compositions, hasItems(
                new AbstractMap.SimpleEntry<>(10, Arrays.asList(3, 7)),
                new AbstractMap.SimpleEntry<>(12, Arrays.asList(5, 7)),
                new AbstractMap.SimpleEntry<>(14, Arrays.asList(3, 11)),
                new AbstractMap.SimpleEntry<>(16, Arrays.asList(3, 13)),
                new AbstractMap.SimpleEntry<>(18, Arrays.asList(5, 13)),
                new AbstractMap.SimpleEntry<>(20, Arrays.asList(3, 17))
        ));
    }

    @Test
    public void shouldProduceAListOfGoldBachCompositionsWhereBothPrimeNumbersGreaterThan50() throws Exception {
        List<AbstractMap.SimpleEntry<Integer, List<Integer>>> compositions = Lesson34.goldBachListGreater(IntStream.rangeClosed(1, 2000), 50);
        assertThat(compositions, hasSize(4));
        assertThat(compositions, hasItems(
                new AbstractMap.SimpleEntry<>(992, Arrays.asList(73, 919)),
                new AbstractMap.SimpleEntry<>(1382, Arrays.asList(61, 1321)),
                new AbstractMap.SimpleEntry<>(1856, Arrays.asList(67, 1789)),
                new AbstractMap.SimpleEntry<>(1928, Arrays.asList(61, 1867))
        ));
    }

}