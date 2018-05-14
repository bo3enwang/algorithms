package com.bow3n.learn.algorithms.ch02;

import java.util.Arrays;

public class Shell extends BasicSort {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = 0; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                    System.out.printf("%-5s", h);
                    System.out.printf("%-5s", i);
                    System.out.printf("%-5s", j);
                    System.out.println(Arrays.toString(a));
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        String[] a = {"E", "A", "S", "Y", "S", "H", "E", "L", "L", "S", "O", "R", "T", "Q", "U", "E", "S", "T", "I", "O", "N"};
        sort(a);
    }
}
