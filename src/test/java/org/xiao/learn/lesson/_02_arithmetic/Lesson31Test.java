package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * 获取合数的因子 和 个数 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 22:01
 */
public class Lesson31Test {
    @Test
    public void shouldFindPrimeFactorsOf315() throws Exception {
        List<AbstractMap.SimpleEntry<Integer, Integer>> primeFactors = Lesson31.primeFactorsMult(315);
        assertThat(primeFactors, hasItems(new AbstractMap.SimpleEntry<>(3, 2), new AbstractMap.SimpleEntry<>(5, 1), new AbstractMap.SimpleEntry<>(7, 1)));
    }

}