package org.xiao.learn.lesson._01_lists;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.xiao.learn.lesson.util.CollectionUtils;

import java.util.*;

/**
 * 找到列表的倒数第二个元素 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 11:40
 */
public class Lesson02Test {

    @Test
    public void shouldFindSecondLastElementFromAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 11, 4, 5, 8, 10, 6);
        Assert.assertThat(Lesson02.secondLast(numbers), CoreMatchers.is(CoreMatchers.equalTo(10)));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListEmpty() {
        Lesson02.secondLast(Collections.emptyList());
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenListHasSingleElement() {
        Lesson02.secondLast(Collections.singletonList(1));
    }

    @Test
    public void shouldFindSecondLastElementFromALinkedListUsingRecursion() throws Exception {
        LinkedList<Integer> numbers = CollectionUtils.linkedList(1, 2, 11, 4, 5, 8, 10, 6);
        Assert.assertThat(Lesson02.secondLastRecursion(numbers), CoreMatchers.is(CoreMatchers.equalTo(10)));
    }
}