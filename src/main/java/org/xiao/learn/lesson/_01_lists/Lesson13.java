package org.xiao.learn.lesson._01_lists;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static java.util.AbstractMap.SimpleEntry;
/**
 * 迭代 直接统计一个列表元素的个数
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/5 21:05
 */
public class Lesson13 {
    public static List<AbstractMap.SimpleEntry<Integer, String>> encodeDirect(List<String> list) {
        LinkedList<SimpleEntry<Integer, String>> result = new LinkedList<>();
        String lastElem = null;
        for (String elem : list) {
            if (Objects.equals(lastElem, elem)) {
                AbstractMap.SimpleEntry<Integer, String> last = result.removeLast();
                result.add(new AbstractMap.SimpleEntry<>(last.getKey() + 1, elem));
            } else {
                result.add(new AbstractMap.SimpleEntry<>(1, elem));
                lastElem = elem;
            }
        }
        return result;
    }
}
