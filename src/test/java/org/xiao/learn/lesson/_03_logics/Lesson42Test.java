package org.xiao.learn.lesson._03_logics;

import org.junit.Test;

/**
 * 生成真假对应的表格(3)
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 22:41
 */
public class Lesson42Test {
    @Test
    public void shouldGenerateTruthTable() throws Exception {
//        String table = Lesson42.table((a, b) -> Lesson42.equ(Lesson40.and(a, Lesson40.or(b, b)), Lesson40.or(Lesson40.and(a, b), Lesson40.and(a, b))));

        String table = Lesson42.table(null);

        System.out.println(table);

//        String result = "A          B          result\n" +
//                "true       true       true\n" +
//                "true       false      true\n" +
//                "false      true       false\n" +
//                "false      false      false";
//        assertThat(table, is(equalTo(result)));
    }
}