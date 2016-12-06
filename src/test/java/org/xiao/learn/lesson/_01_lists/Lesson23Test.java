package org.xiao.learn.lesson._01_lists;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

/**
 * 随机从列表中取n个元素
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/6 13:08
 */
public class Lesson23Test {
    @Test
    public void shouldReturnAListOfThreeRandomSelectedElements() throws Exception {
        List<String> result = Lesson23.randomSelect(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"), 3);
        System.out.println(result);
        assertThat(result, hasSize(3));
    }

    @Test
    public void shouldReturnAListOfThreeRandomSelectedElementsUsingRecursive() throws Exception {
        List<String> result = Lesson23.randomSelectRecursive(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"), 3);
        System.out.println(result);
        assertThat(result, hasSize(3));
    }

    @Test
    public void shouldReturnAListOfThreeRandomSelectedElementsUsingImperative() throws Exception {
        List<String> result = Lesson23.randomSelectImperative(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"), 3);
        System.out.println(result);
        assertThat(result, hasSize(3));
    }
}