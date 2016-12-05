package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.AbstractMap.SimpleEntry;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

/**
 * 把一个统计总数的列表，还原成原来的列表 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:00
 */
public class Lesson12Test {
    @Test
    public void shouldEncodeAList() throws Exception {
        List<String> decodedList = Lesson12.decode(
                Arrays.asList(
                        new SimpleEntry<>(4, "a"),
                        "b",
                        new SimpleEntry<>(2, "c"),
                        new SimpleEntry<>(2, "a"),
                        "d",
                        new SimpleEntry<>(4, "e")
                        )
        );

        assertThat(decodedList, hasSize(14));
        assertThat(decodedList, equalTo(asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")));

    }
}