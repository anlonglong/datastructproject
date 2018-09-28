package com.allon.datastruct.note;

import com.allon.datastruct.note.base.SqList;

public class Main {

    public static void main(String[] args) {
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
    }
}
