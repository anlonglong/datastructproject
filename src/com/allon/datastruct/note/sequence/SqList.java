package com.allon.datastruct.note.sequence;


import com.allon.datastruct.note.base.AbstractList;

import java.util.Arrays;

@SuppressWarnings("all")

/**
 *
 */
public class SqList<T> extends AbstractList<T> {

    private Object[] data = new Object[10];
    private int size = 0;

    public SqList(int capacity) {
        this.data = new Object[capacity];
    }

    public SqList() {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 清空列表
     */

    @Override
    public void cleanList() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public T getElement(int index) {
        if (index >= data.length || index <= 0 || this.length() == 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index - 1];
    }

    @Override
    public int locationElement(T element) {
         int index = -1;
         for (int i = 0; i < size; i++) {
             if (element == data[i]) {
                 index = i;
                 break;
             }
         }
        return index;
    }

    @Override
    public void listInsert(int index, T element) {

        /**
         * 下面的代码是为了防止添加位置的索引超出分配的数组的大小
         */

        if (size == data.length) {
            throw new IllegalArgumentException("数组已满，无法插新的数据");
        }

        /**
         * 防止添加的位置的索引不在范围内
         */
        if (index > data.length || index < 1) {
            throw new IllegalArgumentException("插入的位置不在范围内");
        }

        /**
         * 删除的位置不在末尾
         */

        if (index <= size) {
            for (int i = size - 1; i >= index - 1; --i) {
                data[i + 1] = data[i];
            }
        }
        data[index - 1] = element;
        size++;
    }

    @Override
    public T listDelete(int index) {

        if (size == 0) {
            throw new IllegalArgumentException("线性表为空");
        }

        if (index < 1 || index > size) {
            throw new IllegalArgumentException("删除位置的索引非法");
        }

        T t = (T) data[index - 1];
        if (index < size) {
            for (int j = index; j < size; j++) {
                data[j - 1] = data[j];
            }
        }
        data[size -1]=null;
        size--;
        return t;

    }

    @Override
    public int length() {
        return this.size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
