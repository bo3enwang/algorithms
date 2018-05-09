package com.bow3n.learn.algorithms.ch1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class ErdosRenyi {

    public static int count(int n) {
        int edges = 0;
        WeightedQuickUnionPathCompressionUF uf = new WeightedQuickUnionPathCompressionUF(n);
        while (uf.count() > 1) {
            uf.union(StdRandom.uniform(n), StdRandom.uniform(n));
            edges++;
        }
        return edges;
    }

    public static void main(String[] args) {
        int n = 200;    // number of vertices
        int trials = 100;     // number of trials
        int[] edges = new int[trials];

        for (int i = 0; i < trials; i++) {
            edges[i] = count(n);
        }
        // report statistics
        StdOut.println("1/2 n ln n = " + 0.5 * n * Math.log(n));
        StdOut.println("mean       = " + StdStats.mean(edges));
        StdOut.println("stddev     = " + StdStats.stddev(edges));
    }
}
