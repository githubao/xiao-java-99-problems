package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 移除固定位置的元素 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:29
 */
public class Lesson16Test {
    @Test
    public void shouldDropEveryNthElement() throws Exception {
        List<String> result = Lesson16.dropEveryNth(asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 3);
        assertThat(result, hasSize(8));
        assertThat(result, contains("a", "b", "d", "e", "g", "h", "j", "k"));
    }

    @Test
    public void shouldReturnSameListWhenNIsLessThanListSize() throws Exception {
        List<String> result = Lesson16.dropEveryNth(asList("a", "b"), 3);
        assertThat(result, hasSize(2));
        assertThat(result, contains("a", "b"));
    }

    @Test
    public void shouldReturnSameListWhenNIsZero() throws Exception {
        List<String> result = Lesson16.dropEveryNth(asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 0);
        assertThat(result, hasSize(11));
        assertThat(result, contains("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"));
    }
}