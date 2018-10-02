package com.allon.datastruct.note.list.circlelinklist;

import com.allon.datastruct.note.base.AbstractList;

import java.util.Objects;


@SuppressWarnings("all")
public class circlelinklist<E> extends AbstractList<E> {

    private int size;

    private Node<E> rear = new Node<>();

    private static class Node<E> {
        E data;
        Node<E> next;
    }

    public circlelinklist() {
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void cleanList() {
        Node<E> node = rear.next;
        Node<E> item;
        while (!Objects.isNull(node)) {
            item = node.next;
            item = null;
            size --;
            node = node.next;
        }
    }

    @Override
    public E getElement(int index) {
        int j = 1;
        Node<E> node = rear.next;
        E data;
        while (!Objects.isNull(node) && j< index) {
            node = node.next;
            j++;
        }
        data = node.data;
        return data;
    }

    @Override
    public int locationElement(E element) {
        int index = 1;
        Node<E> node = rear.next;
        while (!Objects.isNull(node)) {
            if (node.data.equals(element)) {
                break;
            }
            index ++;
            node = node.next;
        }
        return index;
    }

    @Override
    public void listInsert(int index, E element) {
        Node<E> node = rear.next;
        int j = 1;
        while (Objects.nonNull(node) && j < index) {
            node = node.next;
            j++;
        }

        if (j == index) {
            Node<E> item = new Node<>();
            item.data = element;
            item.next = new Node<>();
            item.next = node.next;
            node.next = item;
            size++;
        }
    }

    @Override
    public E listDelete(int index) {
        return null;
    }

    @Override
    public int length() {
        return this.size;
    }

    @Override
    public void union(AbstractList<E> list) {

    }
}
