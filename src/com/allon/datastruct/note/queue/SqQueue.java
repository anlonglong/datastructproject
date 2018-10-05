package com.allon.datastruct.note.queue;


public class SqQueue<E> {

    private Object[] dataSource = new Object[10];

    private int front;
    private int rear;


    public SqQueue() {
        this.front = 0;
        this.rear = 0;
    }


    public int size() {
        return (rear - front + dataSource.length) %dataSource.length;
    }

    public void enQuene(E e) {
        if ((this.rear + 1) % dataSource.length == this.front) {
            System.out.println("队列已经满了");
            return;
        }

        dataSource[rear] = e;
        /**
         * rear的位置后移，若到最后则转到数组的头部。
         */
        rear = (rear + 1) % dataSource.length;
    }

    public E deQueue() {
        E data = null;
        if (front == rear) {
            return data;
        }
        data = (E) dataSource[front];
        //front的位置后移，若到了最后，则转到数组的头部。
        front = (front + 1) % dataSource.length;
        return data;
    }

}
