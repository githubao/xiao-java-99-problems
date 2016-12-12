package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * 是否是素数 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 21:43
 */
public class Lesson29Test {
    @Test
    public void shouldSay7IsAPrimeNumber() throws Exception {
        assertTrue(Lesson29.isPrime(7));
    }

    @Test
    public void shouldSay10IsNotAPrimeNumber() throws Exception {
        assertFalse(Lesson29.isPrime(10));
    }

}