package org.xiao.learn.lesson._01_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 9组数据，一组两个，一组三个，一组四个，总共多少种可能性
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/12 20:53
 */
public class Lesson27 {
    public static <T> List<List<List<T>>> group3(List<T> list) {
        List<List<List<T>>> result = new ArrayList<>();

        for (List<T> combinationOf2 : Lesson26.combinations(list, 2)) {
            List<T> r = remaining(list, combinationOf2);
            for (List<T> combinationOf3 : Lesson26.combinations(r, 3)) {
                result.add(Stream.of(combinationOf2, combinationOf3, remaining(r, combinationOf3)).collect(Collectors.toList()));
            }
        }
        return result;
    }

    public static <T> List<List<List<T>>> group(List<T> list, List<Integer> gss) {
        if (gss.isEmpty()) {
            List<List<List<T>>> lists = new ArrayList<>();
            lists.add(new ArrayList<>());
            return lists;
        }

        int n = gss.get(0);
        List<Integer> ns = gss.subList(1, gss.size());
        List<List<List<T>>> result = new ArrayList<>();
        for (List<T> c : Lesson26.combinations(list, n)) {
            List<T> remaining = remaining(list, c);
            for (List<List<T>> cg : group(remaining, ns)) {
                List<List<T>> sg = new ArrayList<>();
                sg.add(c);
                sg.addAll(cg);
                result.add(sg);
            }
        }
        return result;
    }

    private static <T> List<T> remaining(List<T> list, List<T> c) {
        return list.stream().filter(e -> !c.contains(e)).collect(Collectors.toList());
    }
}
