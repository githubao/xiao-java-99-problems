package org.xiao.learn.lesson._02_arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试两种计算互质数的个数的性能
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 20:50
 */
public class Lesson39 {
    public static List<Long> phiPerformance() {
        List<Long> timeList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        Lesson37.phi(10090);
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("use normal method total time：" + totalTime + "(ms)");
        timeList.add(totalTime);

        startTime = System.currentTimeMillis();
        Lesson38.phi(10090);
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("use euler method total time：" + totalTime + "(ms)");
        timeList.add(totalTime);

        return timeList;
    }
}
