package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 复制一份列表元素，列表变胖 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:15
 */
public class Lesson14Test {
    @Test
    public void shouldDuplicateElementsInAList() throws Exception {
        List<String> duplicates = Lesson14.duplicate(asList("a", "b", "c", "c", "d"));
        assertThat(duplicates, hasSize(10));
        assertThat(duplicates, contains("a", "a", "b", "b", "c", "c", "c", "c", "d", "d"));
    }
}