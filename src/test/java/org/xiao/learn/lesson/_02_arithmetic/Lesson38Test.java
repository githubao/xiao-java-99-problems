package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * 小于给定的数字的元素，所有的互质的个数(2) 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:47
 */
public class Lesson38Test {
    @Test
    public void shouldSayPhiOf10Is4() throws Exception {
        int phi = Lesson38.phi(10);
        assertThat(phi, equalTo(4));
    }

    @Test
    public void shouldSayPhiOf99Is60() throws Exception {
        int phi = Lesson38.phi(99);
        assertThat(phi, equalTo(60));
    }
}