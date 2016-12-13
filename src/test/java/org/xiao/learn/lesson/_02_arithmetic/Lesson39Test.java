package org.xiao.learn.lesson._02_arithmetic;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * 测试两种计算互质数的个数的性能 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:53
 */
public class Lesson39Test {

    @Test
    public void shouldSayEulerFasterThanNormalMethod() {
        List<Long> time = Lesson39.phiPerformance();
        assertTrue(time.get(0) > time.get(1));
    }

}