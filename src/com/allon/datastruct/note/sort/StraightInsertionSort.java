package com.allon.datastruct.note.sort;

import java.util.Arrays;

public class StraightInsertionSort {

    public static void sort(int[] a, int n){
        int i, j, k;
        for (i = 1; i < n; i++) {
          //为a[i]在前面的a[0...i-1]有序区间中找一个合适的位置
            int value = a[i];
            for (j = i - 1; j >= 0; j--) {
                if (a[j] < value)
                    break;
                }
            //如找到了一个合适的位置
            if (j != i - 1) {
                //将比a[i]大的数据向后移
                int temp = value;
                for (k = i - 1; k > j; k--)
                    a[k + 1] = a[k];
                    //将a[i]放到正确位置上
                    a[k + 1] = temp;
                 }
            System.out.println("datas = " +Arrays.toString(a));
        }
    }

    public static void sort1(int[] a, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("数组的长度不能小于1" + n);
        }

        for (int i = 1; i < n ; i++) {
            int value = a[i];//因为在后面的移动中可能会替换掉这个值，为了在最后插入数据的时候找不到这个值，临时保存元素的值，
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] < value) {
                    break;
                }else {
                    a[j+1] = a[j];
                }
            }
            a[j+1] = value;
            System.out.println("datas = " +Arrays.toString(a));
        }
    }

}
