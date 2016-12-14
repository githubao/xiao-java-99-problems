package org.xiao.learn.lesson._03_logics;

import java.util.*;

/**
 * 霍夫曼编码
 *
 * @author BaoQiang
 * @version 2.0
 *          date: 2016/12/13 23:19
 */
public class Lesson44<T> {
    public static <T> Node<T> createTree(List<Node<T>> nodes) {
        while (nodes.size() > 1) {
            Collections.sort(nodes);
            Node<T> left = nodes.get(nodes.size() - 1);
            Node<T> right = nodes.get(nodes.size() - 2);

            Node<T> parent = new Node<T>(null, left.getWeight() + right.getWeight());

            parent.setLeft(left);
            parent.setRight(right);

            nodes.remove(left);
            nodes.remove(right);

            nodes.add(parent);
        }

        return nodes.get(0);
    }

    public static <T> void generateHuffmanCode(Node<T> root) {
        if (root == null) {
            return;
        }
        if (root.getLeft() != null) {
            root.getLeft().setCoding(root.getCoding() + "0");
        }
        if (root.getRight() != null) {
            root.getRight().setCoding(root.getCoding() + "1");
        }

        generateHuffmanCode(root.getLeft());
        generateHuffmanCode(root.getRight());
    }

    public static <T> List<Node<T>> breadth(Node<T> root) {
        List<Node<T>> list = new ArrayList<>();
        Queue<Node<T>> queue = new ArrayDeque<>();

        if (root != null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            list.add(queue.peek());

            Node<T> node = queue.poll();

            if (node.getLeft() != null) {
                queue.offer(node.getLeft());
            }

            if (node.getRight() != null) {
                queue.offer(node.getRight());
            }
        }

        return list;
    }


    public static class Node<T> implements Comparable<Node<T>> {
        private T data;
        private Double weight;
        private String coding = "";
        private Node<T> left;
        private Node<T> right;

        public Node(T data, double weight) {
            this.data = data;
            this.weight = weight;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Double getWeight() {
            return weight;
        }

        public void setWeight(Double weight) {
            this.weight = weight;
        }

        public String getCoding() {
            return coding;
        }

        public void setCoding(String coding) {
            this.coding = coding;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "coding='" + coding + '\'' +
                    ", data=" + data +
                    ", weight=" + weight +
                    '}';
        }


        @Override
        public int compareTo(Node<T> o) {
            return o.getWeight().compareTo(this.getWeight());
        }
    }
}
