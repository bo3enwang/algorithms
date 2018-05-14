package com.bow3n.learn.algorithms.ch02;

import java.util.Arrays;

public class Selection  extends BasicSort{
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Integer a[] = {1, 7, 2, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
