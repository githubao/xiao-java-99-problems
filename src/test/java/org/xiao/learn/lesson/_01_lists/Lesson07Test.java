package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.CoreMatchers.hasItems;

/**
 * 把列表变平 [1,[2,3],4] -> [1,2,3,4] 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 19:42
 */
public class Lesson07Test {
    @Test
    public void shouldFlattenAListOfList() throws Exception {
        List<String> flatten = Lesson07.flatten(asList("a", asList("b", asList("c", "d")), "e"), String.class);
        assertThat(flatten, hasSize(5));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e"));
    }

    @Test
    public void shouldFlattenDeepNestedList() throws Exception {

    }

    @Test
    public void shouldReturnEmptyWhenTryingToFlattenAnEmptyList() throws Exception {
        List<String> flatten = Lesson07.flatten(Collections.emptyList(), String.class);
        assertTrue(flatten.isEmpty());
    }

    @Test
    public void shouldReturnSameListWhenListHasNoNestedList() throws Exception {
        List<String> flatten = Lesson07.flatten(asList("a", "b", "c", "d", "e"),String.class);
        assertThat(flatten, hasSize(5));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e"));
    }


}