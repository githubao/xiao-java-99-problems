package org.xiao.learn.lesson._01_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 判断列表是否是回文
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/3 15:22
 */
public class Lesson06 {
    public static <T> boolean isPalindrome(List<T> list) {
        List<T> original = new ArrayList<>(list);
        Collections.reverse(list);
        return list.equals(original);
    }

}
