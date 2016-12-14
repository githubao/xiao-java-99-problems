package org.xiao.learn.lesson._03_logics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 霍夫曼编码 测试
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/14 17:07
 */
public class Lesson44Test {
    @Test
    public void shouldGenerateHuffmanCode() {
        int a[] = {45, 13, 12, 16, 9, 5};
        String s[] = {"a", "b", "c", "d", "e", "f"};

        List<Lesson44.Node<String>> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(new Lesson44.Node<>(s[i], a[i]));
        }

        Lesson44.Node<String> root = Lesson44.createTree(list);
        Lesson44.generateHuffmanCode(root);

        List<Lesson44.Node<String>> result = Lesson44.breadth(root);
        for (Lesson44.Node<String> node : result) {
            if (node.getData() != null) {
                System.out.println(node);
            }
        }

//        List<String> graySequence = Lesson43.gray(2);
//        assertThat(graySequence, contains("00", "01", "11", "10"));
    }
}