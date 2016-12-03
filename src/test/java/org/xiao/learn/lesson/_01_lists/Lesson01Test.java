package org.xiao.learn.lesson._01_lists;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.xiao.learn.lesson.util.CollectionUtils;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 获取最后一个列表元素 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/11/30 22:23
 */
public class Lesson01Test {

    @org.junit.Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
        Assert.assertThat(Lesson01.last(Arrays.asList("a", "b", "c", "d")), CoreMatchers.is("d"));
    }

    @org.junit.Test
    public void shouldFindLastElementFromALinkedListOfAlphabets() throws Exception {
        LinkedList<String> alphabets = CollectionUtils.linkedList("a", "b", "c", "d");
        Assert.assertThat(Lesson01.last(alphabets), CoreMatchers.is("d"));
    }

    @org.junit.Test
    public void shouldFindLastElementFromAListOfAlphabetsUsingRecursion() throws Exception {
        Assert.assertThat(Lesson01.lastRecursive(Arrays.asList("a", "b", "c", "d")), CoreMatchers.is("d"));
    }
}