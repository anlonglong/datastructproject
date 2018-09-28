package com.allon.datastruct.note.base;

@SuppressWarnings("all")

/**
 * 定义一些集合操作共有的方法。
 */
public interface Operation<T> {

    boolean isEmpty();

    void cleanList();

    T getElement(int index);

    int locationElement(T element);

    void listInsert(int index, T element);

    T listDelete(int index);


    int length();




}
