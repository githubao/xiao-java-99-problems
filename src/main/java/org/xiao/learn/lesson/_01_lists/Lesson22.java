package org.xiao.learn.lesson._01_lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 给定起始位置，创建列表
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/6 12:47
 */
public class Lesson22 {
    public static List<Integer> range(int start,int end){
        return IntStream.rangeClosed(start,end).boxed().collect(Collectors.toList());
    }
}
