package org.xiao.learn.lesson._03_logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

/**
 * 生成真假对应的表格(3)
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 22:41
 */
public class Lesson42 {
    public static String table(BiPredicate<Boolean, Boolean> f) {
        List<String> resultBuilder = new ArrayList<>();
        resultBuilder.add(String.format("A%10sB%10sc%10sresult", " ", " ", " "));
        for (boolean a : Arrays.asList(true, false)) {
            for (boolean b : Arrays.asList(true, false)) {
                for (boolean c : Arrays.asList(true, false)) {
                    resultBuilder.add(String.format("%-10s %-10s %-10s %s", a, b, c, getPredict(a, b, c)));
                }
            }
        }
        return resultBuilder.stream().collect(Collectors.joining("\n"));
    }

    private static boolean getPredict(boolean a, boolean b, boolean c) {
        return Lesson42.equ(Lesson40.and(a, Lesson40.or(b, c)), Lesson40.or(Lesson40.and(a, b), Lesson40.and(a, c)));
    }

    public static boolean equ(boolean a, boolean b) {
        return a == b;
    }
}
