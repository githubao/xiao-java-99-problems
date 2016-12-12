package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

/**
 * 生成一个给定列表的随机全排列 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 20:24
 */
public class Lesson25Test {
    @Test
    public void shouldGive6NumbersFromARangeStartingFrom1To49() throws Exception {
        List<String> permutation = Lesson25.randomPermutation(Stream.of("a", "b", "c", "d", "e", "f").collect(Collectors.toList()));
        assertThat(permutation, hasSize(6));
        System.out.println(permutation);
        assertThat(permutation,containsInAnyOrder("a", "b", "c", "d", "e", "f"));
    }
}