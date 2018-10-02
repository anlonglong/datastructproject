package com.allon.datastruct.note;

import com.allon.datastruct.note.list.linkedlist.LinkedList;
import com.allon.datastruct.note.list.sequencelist.SqList;
import com.allon.datastruct.note.stack.Stack;

public class Main {

    public static void main(String[] args) {
//        sqList();
//        linkList();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("size = " + stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
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
