package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 从第n个元素开始，交换两个子列表的位置 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:51
 */
public class Lesson19Test {
    @Test
    public void shouldRotateAListByThreeElementsWhenNIs3() throws Exception {
        List<String> rotated = Lesson19.rotate(asList("a", "b", "c", "d", "e", "f", "g", "h"), 3);
        assertThat(rotated, contains("d", "e", "f", "g", "h", "a", "b", "c"));
    }

    @Test
    public void shouldReturnSameListWhenNIs0() throws Exception {
        List<String> rotated = Lesson19.rotate(asList("a", "b", "c", "d", "e", "f", "g", "h"), 0);
        assertThat(rotated, contains("a", "b", "c", "d", "e", "f", "g", "h"));
    }

    @Test
    public void shouldRotateWhenNIsNegative() throws Exception {
        List<String> rotated = Lesson19.rotate(asList("a", "b", "c", "d", "e", "f", "g", "h"), -2);
        assertThat(rotated, contains("g", "h", "a", "b", "c", "d", "e", "f"));
    }
}