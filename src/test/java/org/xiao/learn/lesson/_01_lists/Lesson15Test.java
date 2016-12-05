package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 列表变胖，复制指定的次数 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:20
 */
public class Lesson15Test {
    @Test
    public void shouldDuplicateElementsInAList() throws Exception {
        List<String> duplicates = Lesson15.duplicate(asList("a", "b", "c"), 3);
        assertThat(duplicates, hasSize(9));
        assertThat(duplicates, contains("a", "a", "a", "b", "b", "b", "c", "c", "c"));
    }
}
