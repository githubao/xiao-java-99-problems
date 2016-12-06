package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

/**
 * 在列表指定位置插入数据 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/6 12:38
 */
public class Lesson21Test {
    @Test
    public void shouldInsertElementAtSecondPosition() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d").collect(Collectors.toList());
        List<String> result = Lesson21.insertAt(input, 2, "alfa");
        assertThat(result, hasSize(5));
        assertThat(result, contains("a", "alfa", "b", "c", "d"));
    }

    @Test
    public void shouldInsertElementAtFirstPosition() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d").collect(Collectors.toList());
        List<String> result = Lesson21.insertAt(input, 1, "alfa");
        assertThat(result, hasSize(5));
        assertThat(result, contains( "alfa","a", "b", "c", "d"));
    }

    @Test
    public void shouldInsertElementAtEnd() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d").collect(Collectors.toList());
        List<String> result = Lesson21.insertAt(input, 5, "alfa");
        assertThat(result, hasSize(5));
        assertThat(result, contains("a", "b", "c", "d", "alfa"));
    }

    @Test
    public void shouldInsertElementAtSecondPositionUsingSplit() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d").collect(Collectors.toList());
        List<String> result = Lesson21.insertAtUsingSplit(input, 2, "alfa");
        assertThat(result, hasSize(5));
        assertThat(result, contains("a", "alfa", "b", "c", "d"));
    }

    @Test
    public void shouldInsertElementAtFirstPositionUsingSplit() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d").collect(Collectors.toList());
        List<String> result = Lesson21.insertAtUsingSplit(input, 1, "alfa");
        assertThat(result, hasSize(5));
        assertThat(result, contains( "alfa","a", "b", "c", "d"));
    }

    @Test
    public void shouldInsertElementAtEndUsingSplit() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d").collect(Collectors.toList());
        List<String> result = Lesson21.insertAtUsingSplit(input, 5, "alfa");
        assertThat(result, hasSize(5));
        assertThat(result, contains("a", "b", "c", "d", "alfa"));
    }


}