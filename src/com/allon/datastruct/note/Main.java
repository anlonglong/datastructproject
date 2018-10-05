package com.allon.datastruct.note;

import com.allon.datastruct.note.linkquene.LinkQuene;
import com.allon.datastruct.note.list.linkedlist.LinkedList;
import com.allon.datastruct.note.list.sequencelist.SqList;
import com.allon.datastruct.note.queue.SqQueue;
import com.allon.datastruct.note.stack.Stack;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
//        sqList();
//        linkList();
//        stackTest();

//        queneTest();
        LinkQuene<Integer> linkQuene = new LinkQuene<>();
        linkQuene.enQueue(1);
        linkQuene.enQueue(2);
        linkQuene.enQueue(3);
        linkQuene.enQueue(4);
        linkQuene.enQueue(5);
        System.out.println("linkQuene.getSize() = " + linkQuene.getSize());
        System.out.println("linkQuene.deQueue() = " + linkQuene.deQueue());
        System.out.println("linkQuene.deQueue() = " + linkQuene.deQueue());
        System.out.println("linkQuene.deQueue() = " + linkQuene.deQueue());
    }

    private static void queneTest() {
        SqQueue<Integer> sqQueue = new SqQueue<>();
        sqQueue.enQuene(1);
        sqQueue.enQuene(2);
        sqQueue.enQuene(3);
        sqQueue.enQuene(4);
        sqQueue.enQuene(5);
        System.out.println("sqQueue size = " + sqQueue.size());
        System.out.println("dequeue = "+ sqQueue.deQueue());
        System.out.println("dequeue = "+ sqQueue.deQueue());
        System.out.println("dequeue = "+ sqQueue.deQueue());
        System.out.println("dequeue = "+ sqQueue.deQueue());
        System.out.println("dequeue = "+ sqQueue.deQueue());
        System.out.println("sqQueue size = " + sqQueue.size());
    }

    private static void stackTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("size = " + stack.size());
        System.out.println("pop elememt = "+ stack.pop());
        System.out.println("pop elememt = "+ stack.pop());
        System.out.println("pop elememt = "+ stack.pop());
        System.out.println("size = " + stack.size());
    }

    private static void linkList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.listInsert(1,1);
        linkedList.listInsert(2,2);
        linkedList.listInsert(3,3);
        linkedList.listInsert(4,7);
        linkedList.listInsert(5,5);
        linkedList.listInsert(6,0);
        System.out.println("size = "+linkedList.length());
        System.out.println("element = "+linkedList.getElement(4));
        Integer integer = linkedList.listDelete(6);
        System.out.println("integer = " + integer);
        linkedList.cleanList();
        System.out.println("size = "+linkedList.length());
    }

    private static void sqList() {
        SqList<Integer> sqList = new SqList<>();
        sqList.listInsert(1, 1);
        sqList.listInsert(2, 2);
        sqList.listInsert(3, 3);
        sqList.listInsert(4, 4);
        sqList.listInsert(5, 5);
        sqList.listInsert(6, 6);
        sqList.listInsert(7, 7);
        System.out.println("length = " + sqList.length());
        System.out.println(sqList.toString());
        Integer integer = sqList.listDelete(2);
        System.out.println("delete element is = "+integer);
        System.out.println("length = " + sqList.length());
        System.out.println(sqList.toString());
        Integer integer1 = sqList.listDelete(1);
        System.out.println("delete element is = "+integer1);
        System.out.println("length = " + sqList.length());
        System.out.println(sqList.toString());
        Integer integer2 = sqList.listDelete(3);
        System.out.println("delete element is = "+integer2);
        System.out.println("length = " + sqList.length());
        System.out.println(sqList.toString());
        int index = sqList.locationElement(7);
        System.out.println("index = " + index);
    }
}
