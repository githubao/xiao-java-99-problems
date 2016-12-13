package org.xiao.learn.lesson._02_arithmetic;

/**
 * 最大公约数
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:28
 */
public class Lesson35 {
    public static int gcd(int first, int second) {
        if (first == 0) {
            return second;
        } else if (second == 0) {
            return first;
        } else if (first > second) {
            return gcd(first - second, second);
        } else {
            return gcd(first, second - first);
        }

    }
}
