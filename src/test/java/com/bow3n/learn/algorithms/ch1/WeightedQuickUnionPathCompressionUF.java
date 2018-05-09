package com.bow3n.learn.algorithms.ch1;

public class WeightedQuickUnionPathCompressionUF {
    private int[] parent;   // parent[i] = parent of i
    private int[] size;     // size[i] = number of sites in subtree rooted at i
    private int count;      // number of components


    public WeightedQuickUnionPathCompressionUF(int n) {
        this.parent = new int[n];
        this.size = new int[n];
        this.count = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int count() {
        return this.count;
    }

    public int find(int p) {
        int root = p;
        while (root != parent[root]) {
            root = parent[root];
        }
        while (p != root) {
            int newP = parent[p];
            parent[p] = root;
            p = newP;
        }
        return root;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        count--;
    }
}
