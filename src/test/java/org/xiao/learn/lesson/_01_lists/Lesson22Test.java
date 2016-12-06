package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 给定起始位置，创建列表 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/6 12:48
 */
public class Lesson22Test {
    @Test
    public void shouldCreateARangeBetween4And9() throws Exception {
        List<Integer> range = Lesson22.range(4, 9);
        assertThat(range, hasSize(6));
        assertThat(range, contains(4, 5, 6, 7, 8, 9));
    }
}