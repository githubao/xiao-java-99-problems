package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 判断列表是否是回文 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 15:25
 */
public class Lesson06Test {

    @Test
    public void shouldReturnTrueWhenListIsPalindrome() throws Exception {
        assertTrue(Lesson06.isPalindrome(Arrays.asList("x", "a", "m", "a", "x")));
    }

    @Test
    public void shouldReturnFalseWhenListIsPalindrome() throws Exception {
        assertFalse(Lesson06.isPalindrome(Arrays.asList(1, 2, 3, 4, 5)));
    }
}