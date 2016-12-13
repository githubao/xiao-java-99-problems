package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * 表示任意一个偶数为两个素数之和 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 22:34
 */
public class Lesson33Test {
    @Test
    public void _8_isTheNumberOf_3_and_5() throws Exception {
        List<Integer> numbers = Lesson33.goldBach(8);
        assertThat(numbers, hasSize(2));
        assertThat(numbers, hasItems(3, 5));
    }

    @Test
    public void _4_isTheNumberOf_2_and_2() throws Exception {
        List<Integer> numbers = Lesson33.goldBach(4);
        assertThat(numbers, hasSize(2));
        assertThat(numbers, hasItems(2, 2));
    }

    @Test
    public void _28_isTheNumberOf_5_and_23() throws Exception {
        List<Integer> numbers = Lesson33.goldBach(28);
        assertThat(numbers, hasSize(2));
        assertThat(numbers, hasItems(5, 23));
    }
}