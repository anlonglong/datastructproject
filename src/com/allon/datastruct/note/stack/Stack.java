package com.allon.datastruct.note.stack;

@SuppressWarnings("all")
public class Stack<T> {

private Object[] dataSource = new Object[10];
private int top = -1;//指向栈顶的指针
private int size;

    public Stack() {
    }

    public void push(T data) {
        //栈的存储元素的下表从0开始，所以减一
        if (top == dataSource.length - 1) {
            throw new IllegalStateException("栈已经满了");
        }

        top++;
        dataSource[top] = data;
        size++;
    }

    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("栈为空");
        }
        T data = (T) dataSource[top];
        top--;
        size--;
        return data;

    }
    public int size() {
        return this.size;
    }
}

