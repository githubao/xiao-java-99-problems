package org.xiao.learn.lesson._02_arithmetic;

/**
 * 互质
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:32
 */
public class Lesson36 {
    public static boolean coprime(int first, int second) {
        return Lesson35.gcd(first, second) == 1;
    }
}
