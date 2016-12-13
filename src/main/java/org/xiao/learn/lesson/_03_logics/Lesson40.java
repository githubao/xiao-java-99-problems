package org.xiao.learn.lesson._03_logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

/**
 * 生成真假对应的表格
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 21:57
 */
public class Lesson40 {
    public static String table(BiPredicate<Boolean, Boolean> f) {
        List<String> resultBuilder = new ArrayList<>();
        resultBuilder.add(String.format("A%10sB%10sresult", " "," "));
        for (boolean a : Arrays.asList(true, false)) {
            for (boolean b : Arrays.asList(true, false)) {
                resultBuilder.add(String.format("%-10s %-10s %s", a, b, f.test(a, b)));
            }
        }
        return resultBuilder.stream().collect(Collectors.joining("\n"));
    }

    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static boolean or(boolean a, boolean b) {
        return a || b;
    }
}
