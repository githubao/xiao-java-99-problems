package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 移除列表的第K个元素 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:59
 */
public class Lesson20Test {
    @Test
    public void shouldRemoveKthElementFromList() throws Exception {
        Object[] result = Lesson20.removeAt(asList("a", "b", "c", "d"), 2);
        assertThat(result[0], equalTo(asList("a", "c", "d")));
        assertThat(result[1], equalTo("b"));
    }

    @Test
    public void shouldRemoveKthElementFromListUsingSplit() throws Exception {
        Object[] result = Lesson20.removeAtSplitAt(asList("a", "b", "c", "d"), 2);
        assertThat(result[0], equalTo(asList("a", "c", "d")));
        assertThat(result[1], equalTo("b"));
    }
}