package org.xiao.learn.lesson._03_logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 所有的0-1字符串的可能性列表
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 22:55
 */
public class Lesson43 {
    public static List<String> gray(int n) {
        if (n == 1) {
            return Arrays.asList("0", "1");
        }
        List<String> original = gray(n - 1);
        List<String> reversed = new ArrayList<>(original);
        Collections.reverse(reversed);

        return Stream.concat(original.stream().map(s -> "0" + s), reversed.stream().map(s -> "1" + s)).collect(Collectors.toList());
    }
}
