package org.xiao.learn.lesson._03_logics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 生成真假对应的表格 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 22:23
 */
public class Lesson40Test {
    @Test
    public void shouldGenerateTruthTable() throws Exception {
        String table = Lesson40.table((a, b) -> Lesson40.and(a, Lesson40.or(a, b)));
        System.out.println(table);
        String result = "A          B          result\n" +
                "true       true       true\n" +
                "true       false      true\n" +
                "false      true       false\n" +
                "false      false      false";
        assertThat(table, is(equalTo(result)));
    }
}