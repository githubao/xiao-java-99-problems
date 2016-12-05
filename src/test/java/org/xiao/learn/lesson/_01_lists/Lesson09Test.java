package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 把包含的重复的子元素，放在子列表 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 20:16
 */
public class Lesson09Test {
    @Test
    public void shouldReturnAListWithTwoListElementsWhenAListWithTwoUniqueElementsIsPassed() throws Exception {
        List<List<String>> packedList = Lesson09.pack(asList("a", "b"));
        assertThat(packedList, hasSize(2));
        assertThat(packedList.get(0), contains("a"));
        assertThat(packedList.get(1), contains("b"));
    }

    @Test
    public void shouldPackConsecutiveDuplicatesInTheirOwnListsSmall() throws Exception {
        List<List<String>> packedList = Lesson09.pack(asList("a", "a", "b", "a"));
        assertThat(packedList, hasSize(3));
        assertThat(packedList.get(0), contains("a", "a"));
        assertThat(packedList.get(1), contains("b"));
        assertThat(packedList.get(2), contains("a"));
    }

    @Test
    public void shouldPackConsecutiveDuplicatesInTheirOwnLists() throws Exception {
        List<List<String>> packedList = Lesson09.pack(asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
        assertThat(packedList, hasSize(6));
        assertThat(packedList.get(0), contains("a", "a", "a", "a"));
        assertThat(packedList.get(1), contains("b"));
        assertThat(packedList.get(2), contains("c","c"));
        assertThat(packedList.get(3), contains("a","a"));
        assertThat(packedList.get(4), contains("d"));
        assertThat(packedList.get(5), contains("e", "e", "e", "e"));
    }
}