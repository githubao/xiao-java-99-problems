package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 最大公约数 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:30
 */
public class Lesson35Test {
    @Test
    public void gcdOf36And63Is9() throws Exception {
        int gcd = Lesson35.gcd(36, 63);
        assertThat(gcd, equalTo(9));
    }
}