package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * 获取合数的因子 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 21:48
 */
public class Lesson30Test {
    @Test
    public void shouldFindPrimeFactorsOf315() throws Exception {
        List<Integer> primeFactors = Lesson30.primeFactors(315);
        assertThat(primeFactors, hasItems(3, 3, 5, 7));
    }

    @Test
    public void shouldFindPrimeFactorsOf33() throws Exception {
        List<Integer> primeFactors = Lesson30.primeFactors(33);
        assertThat(primeFactors, hasItems(3, 11));
    }
}