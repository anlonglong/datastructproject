package com.allon.datastruct.note.linkquene;

public class LinkQuene<E> {


    private int size;

    private QueneNode<E> front;
    private QueneNode<E> rear;


    public LinkQuene() {
        this.front = new QueneNode<>();
        this.rear = this.front;

    }

    private static class QueneNode<E> {
        E data;
        QueneNode<E> next;
    }

    public int getSize() {
        return size;
    }

    private boolean isEmpty() {
        return this.size == 0;
    }

    public void enQueue(E data) {
        QueneNode<E> queneNode = new QueneNode<>();
        queneNode.data = data;
        queneNode.next = null;
        this.rear.next = queneNode;
        this.rear = queneNode;
        size++;
    }

    public E deQueue() {
        E data = null;
        if (rear == front) {
            System.out.println("队列为空");
            return data;
        }

        //保存要删除的节点
        QueneNode<E> p = this.front.next;
        data = p.data;
        //这一步的执行后使得p与队列中的任何节点失去关系，彻底成为游离态
        this.front.next = p.next;
        size--;
        if (rear == p) {
            rear = front;
        }
        p = null;
        return data;
    }
}
