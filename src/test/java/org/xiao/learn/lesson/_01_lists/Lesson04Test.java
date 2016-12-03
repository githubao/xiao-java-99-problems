package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 获取列表长度 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 13:03
 */
public class Lesson04Test {

    @Test
    public void listOfEmptyListShouldBeZero() throws Exception {
        assertThat(Lesson04.length(Collections.emptyList()), is(equalTo(0)));
        assertThat(Lesson04.lengthStream(Collections.emptyList()), is(equalTo(0L)));
        assertThat(Lesson04.lengthStream2(Collections.emptyList()), is(equalTo(0L)));
        assertThat(Lesson04.lengthRecursive(Collections.emptyList()), is(equalTo(0)));
    }

    @Test
    public void shouldFindListOfNonEmptyList() throws Exception {
        assertThat(Lesson04.length(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5)));
    }

    @Test
    public void shouldFindListOfNonEmptyListUsingStream() throws Exception {
        assertThat(Lesson04.lengthStream(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5L)));
        assertThat(Lesson04.lengthStream2(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5L)));
    }

    @Test
    public void shouldFindListOfNonEmptyListUsingRecursive() throws Exception {
        assertThat(Lesson04.lengthStream2(Arrays.asList(1, 2, 3, 4, 5)), is(equalTo(5L)));
    }
}