package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * 互质 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:33
 */
public class Lesson36Test {
    @Test
    public void shouldSay35And64IsCoprime() throws Exception {
        boolean coprime = Lesson36.coprime(35, 64);
        assertTrue(coprime);
    }
}