package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 列表切片 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:45
 */
public class Lesson18Test {
    @Test
    public void shouldGiveSliceOfAList() throws Exception {
        List<String> slice = Lesson18.slice(asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 3,7);
        assertThat(slice,hasSize(5));
        assertThat(slice, contains("c", "d", "e", "f", "g"));
    }
}