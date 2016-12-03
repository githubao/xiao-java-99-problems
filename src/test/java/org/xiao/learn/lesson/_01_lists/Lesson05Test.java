package org.xiao.learn.lesson._01_lists;

import org.junit.Test;
import org.xiao.learn.lesson.util.CollectionUtils;

import java.util.ArrayDeque;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 反转列表 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 15:10
 */
public class Lesson05Test {

    @Test
    public void shouldReverseAList() throws Exception {
        assertThat(Lesson05.reverse(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }

    @Test
    public void shouldReverseAListUsingForEach() throws Exception {
        assertThat(Lesson05.reverseForEach(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }

    @Test
    public void shouldReverseAListUsingIntStream() throws Exception {
        assertThat(Lesson05.reverseIntStream(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }

    @Test
    public void shouldReverseAListUsingCustomStream() throws Exception {
        ArrayDeque<Integer> numbers = CollectionUtils.arrayDeque(1, 2, 3, 4, 5);
        assertThat(Lesson05.reverseCustomStream(numbers), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }
}