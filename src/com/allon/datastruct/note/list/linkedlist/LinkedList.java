package com.allon.datastruct.note.list.linkedlist;

import com.allon.datastruct.note.base.Operation;

import java.util.Objects;

public class LinkedList<T> implements Operation<T> {


    transient Node<T> head = new Node<>(null, null);
    transient int size = 0;

    public LinkedList() {

    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }


    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void cleanList() {
        if (Objects.isNull(head.next)) {
            return;
        }
        Node<T> node = head.next;
        Node<T> p = null;
        while (!Objects.isNull(node) && size != 0) {
            p = node.next;
            node = null;
            size--;
            node = p;
        }
        head.next = null;
    }

    @Override
    public T getElement(int index) {
        if (Objects.isNull(head.next)) {
            throw new NullPointerException("链表为空");
        }
        int j = 1;
        Node<T> node = head.next;
        T data = null;
        /**
         * 由于单链表结构中没有定义链表的长度，所以不能知道要循环多少次，因此也就
         * 不方便使用for来控制循环。其主要核心思想就是"工作指针后移"，这其实也是很
         * 多算法的常用技术。
         */
        while (Objects.nonNull(node) && j <= index) {
            node = node.next;
            j++;
        }

        if (Objects.nonNull(node)) {
            data = node.data;
        }
        return data;
    }

    @Override
    public int locationElement(T element) {
        return 0;//因为单链表是游离态的，所以无法知道他的具体位置
    }

    @Override
    public void listInsert(int index, T element) {
        if (Objects.isNull(head.next)) {
            Node<T> node = new Node<>(null, null);
            head.next = node;
        }
        Node<T> node = head.next;
        int j = 1;
        while (Objects.nonNull(node) && j < index) {
            node = node.next;
            j++;
        }

        if (Objects.nonNull(node) && j == index) {
            Node<T> item = new Node<>(element, new Node<T>(null, null));
            item.next = node.next;
            node.next = item;
            size++;
        }
    }

    @Override
    public T listDelete(int index) {
        if (Objects.isNull(head.next)) {
            throw new NullPointerException("链表为空");
        }

        int j = 1;
        Node<T> node = head.next;
        while (Objects.nonNull(node) && j < index) {
            node = node.next;
            j++;
        }
        T data = null;
        if (Objects.nonNull(node)) {
            data = node.next.data;
            node.next = node.next.next;
            node.next = null;
            size--;
        }
        return data;
    }

    @Override
    public int length() {
        return this.size;
    }
}
