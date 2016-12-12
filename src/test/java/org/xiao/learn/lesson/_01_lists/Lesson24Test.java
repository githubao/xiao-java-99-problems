package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

/**
 * 随机取列表指定范围内的多个元素 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 20:18
 */
public class Lesson24Test {
    @Test
    public void shouldGive6NumbersFromARangeStartingFrom1To49() throws Exception {
        List<Integer> randomList = Lesson24.randomSelect(6, 1, 49);
        assertThat(randomList, hasSize(6));
        System.out.println(randomList); //[43, 31, 35, 26, 23, 3]
    }

}