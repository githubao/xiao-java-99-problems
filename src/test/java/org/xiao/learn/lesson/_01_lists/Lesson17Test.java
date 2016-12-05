package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 把列表，按给定的数字分成两部分 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:40
 */
public class Lesson17Test {
    @Test
    public void shouldSplitInTwoHalves() throws Exception {
        Map<Boolean, List<String>> result = Lesson17.split(asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 3);
        assertThat(result.get(true), contains("a", "b", "c"));
        assertThat(result.get(false), contains("d", "e", "f", "g", "h", "i", "j", "k"));
    }
}