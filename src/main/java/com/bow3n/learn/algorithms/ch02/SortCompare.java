package com.bow3n.learn.algorithms.ch02;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class SortCompare {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) {
            Insertion.sort(a);
        }
        if (alg.equals("Selection")) {
            Selection.sort(a);
        }
        if (alg.equals("Shell")) {
            Shell.sort(a);
        }
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {

        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        int N = 5000;
        int T = 100;

        double t1 = timeRandomInput("Insertion", N, T);
        double t2 = timeRandomInput("Selection", N, T);
        double t3 = timeRandomInput("Shell", N, T);

        System.out.println(String.format("Insertion: %s", t1 + ""));
        System.out.println(String.format("Selection: %s", t2 + ""));
        System.out.println(String.format("Shell: %s", t3 + ""));
    }
}
