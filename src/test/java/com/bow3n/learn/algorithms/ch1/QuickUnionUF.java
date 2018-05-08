package com.bow3n.learn.algorithms.ch1;

public class QuickUnionUF {

    private int[] parent;
    private int count;

    public QuickUnionUF(int n) {
        this.parent = new int[n];
        this.count = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = parent[p];
        int rootQ = parent[q];
        if (rootP == rootQ) {
            return;
        }
        parent[rootP] = rootQ;
        count--;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}
