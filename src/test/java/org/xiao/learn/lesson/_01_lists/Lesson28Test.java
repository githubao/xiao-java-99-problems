package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 列表的列表，按照元素个数排序 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 21:25
 */
public class Lesson28Test {
    @Test
    public void shouldSortByElementLength() throws Exception {
        List<List<String>> origin = getListOfList(Arrays.asList(3, 2, 3, 2, 3, 2, 1));
        List<List<String>> input = getListOfList(Arrays.asList(3, 2, 3, 2, 3, 2, 1));
        List<List<String>> result = Lesson28.lsort(input);
        assertThat(result, is(equalTo(Arrays.asList(origin.get(6), origin.get(1), origin.get(3), origin.get(5), origin.get(0), origin.get(2), origin.get(4)))));
    }

    @Test
    public void shouldSortByLengthFrequency() throws Exception {
        List<List<String>> origin = getListOfList(Arrays.asList(3, 2, 3, 2, 4, 2, 1));
        List<List<String>> input = getListOfList(Arrays.asList(3, 2, 3, 2, 4, 2, 1));
        List<List<String>> result = Lesson28.lfsort(input);
        assertThat(result, is(equalTo(Arrays.asList(origin.get(4), origin.get(6), origin.get(0), origin.get(2), origin.get(1), origin.get(3), origin.get(5)))));
    }


    private List<List<String>> getListOfList(List<Integer> integers) {
        char start = 'a';
        List<List<String>> results = new ArrayList<>();
        for (int cnt : integers) {
            List<String> single = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                single.add(String.valueOf(start));
                start += 1;
            }
            results.add(single);
        }
        return results;
    }
}