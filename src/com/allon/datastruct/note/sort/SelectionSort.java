package com.allon.datastruct.note.sort;

import java.util.Arrays;

public class SelectionSort {

    /**
     *
     *  时间复杂度为：O(n2)
     *
     * @param datas 待排序的数据
     */

    public static void simpleSelectionSort(int[] datas) {
        System.out.println("原始数据 = "+Arrays.toString(datas));
        for (int i = 0; i < datas.length; i++) {
            int min = i;
            for (int j = 1+i; j < datas.length; j++) {
                if (datas[min] > datas[j]) {
                    min = j;
                }
            }
            if (min !=i) { //如果最小值的索引不是自己则交换值，如果最下值是自己则没有交换的必要，
                swap(datas, min, i);
            }
            System.out.println("datas = " +Arrays.toString(datas));
        }
    }

    private static void swap(int[] datas, int min, int i) {
        int temp = datas[min];
        datas[min] = datas[i];
        datas[i] = temp;
    }

}
