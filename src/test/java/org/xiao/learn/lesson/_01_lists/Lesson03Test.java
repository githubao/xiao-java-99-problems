package org.xiao.learn.lesson._01_lists;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.xiao.learn.lesson.util.CollectionUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 找到列表的第k个元素 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 11:59
 */
public class Lesson03Test {

    @Test
    public void shouldFindKthElementFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertThat(Lesson03.kth(numbers, 2), CoreMatchers.is(CoreMatchers.equalTo(2)));
    }

    @Test
    public void shouldFindKthElementFromALinkedListUsingRecursive() throws Exception {
        LinkedList<Integer> numbers = CollectionUtils.linkedList(1, 2, 3, 4, 5);
        Assert.assertThat(Lesson03.kthRecursive(numbers, 2), CoreMatchers.is(CoreMatchers.equalTo(2)));
    }

    @Test
    public void testKthStream() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertThat(Lesson03.kthStream(numbers, 2), CoreMatchers.is(CoreMatchers.equalTo(2)));
    }
}