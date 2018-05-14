package com.bow3n.learn.algorithms.ch02;

import java.util.Arrays;

public class Insertion extends BasicSort {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }



    public static void main(String[] args) {
        Integer a[] = {1,7,2,3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
