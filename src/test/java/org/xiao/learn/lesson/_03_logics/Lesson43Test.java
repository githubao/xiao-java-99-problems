package org.xiao.learn.lesson._03_logics;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * 所有的0-1字符串的可能性列表 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 22:58
 */
public class Lesson43Test {
    @Test
    public void shouldFindGrayCodeWhenNIs1() {
        List<String> graySequence = Lesson43.gray(1);
        assertThat(graySequence, contains("0", "1"));
    }

    @Test
    public void shouldFindGrayCodeWhenNIs2() {
        List<String> graySequence = Lesson43.gray(2);
        assertThat(graySequence, contains("00", "01", "11", "10"));
    }

    @Test
    public void shouldFindGrayCodeWhenNIs3() {
        List<String> graySequence = Lesson43.gray(3);
        assertThat(graySequence, contains("000", "001", "011", "010", "110", "111", "101", "100"));
    }

    @Test
    public void myTest(){
        List<String> list = asList("0", "1");
        List<String> list2 = asList("3", "4");
        System.out.println(Stream.concat(list.stream().map(s -> "0" + s),list.stream().map(s -> "1" + s)).collect(toList()));
    }

}