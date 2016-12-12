package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

/**
 * 给定一个列表，给定K个，所有的全排列 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 20:40
 */
public class Lesson26Test {
    @Test
    public void shouldFindAllCombinationsOfSize2FromAListWithSize3() throws Exception {
        List<String> input = Stream.of("a", "b", "c").collect(Collectors.toList());
        List<List<String>> combinations = Lesson26.combinations(input, 2);
        assertThat(combinations, hasSize(3));
    }

    @Test
    public void shouldFindAllCombinationsOfSize3FromAListWithSize6() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d", "e", "f").collect(Collectors.toList());
        List<List<String>> combinations = Lesson26.combinations(input, 3);
        assertThat(combinations, hasSize(20));
    }

    @Test
    public void shouldFindAllCombinationsOfSize4FromAListWithSize3() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d", "e", "f").collect(Collectors.toList());
        List<List<String>> combinations = Lesson26.combinations(input, 4);
        assertThat(combinations, hasSize(15));
    }
}