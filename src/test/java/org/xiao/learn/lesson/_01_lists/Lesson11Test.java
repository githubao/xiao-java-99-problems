package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.AbstractMap;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

/**
 * 得到一个列表数据的分类个数统计 如果只有一个元素，不用统计个数 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 20:45
 */
public class Lesson11Test {
    @Test
    public void shouldEncodeAList() throws Exception {
        List<Object> encodedList = Lesson11.encodeModified(asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
        assertThat(encodedList, hasSize(6));
        assertThat(encodedList.get(0), is(equalTo(new AbstractMap.SimpleEntry<>(4, "a"))));
        assertThat(encodedList.get(1), is(equalTo("b")));
        assertThat(encodedList.get(2), is(equalTo(new AbstractMap.SimpleEntry<>(2, "c"))));
        assertThat(encodedList.get(3), is(equalTo(new AbstractMap.SimpleEntry<>(2, "a"))));
        assertThat(encodedList.get(4), is(equalTo("d")));
        assertThat(encodedList.get(5), is(equalTo(new AbstractMap.SimpleEntry<>(4, "e"))));
    }
}