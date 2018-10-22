package com.allon.datastruct.note.sort;

import java.util.Arrays;

public class BubbleSort {


//    8,5,1,2,4,6,22,23,9,56,98

    /**
     *   时间复杂度为：O(n2)
     * @param datas
     */
    public  static void sort(int[] datas) {
        System.out.println("原始数据 = "+Arrays.toString(datas));
        for (int i = 0; i < datas.length ; i++) {
            for (int j = 0; j < datas.length-1 - i; j++) {
                if (datas[j] > datas[j + 1]) {
                    swap(datas, j);
                    System.out.println("datas = " +Arrays.toString(datas));
                }
            }
        }
    }

    private static void swap(int[] datas, int j) {
        int temp = datas[j];
        datas[j] = datas[j + 1];
        datas[j + 1] = temp;
     }
   }
