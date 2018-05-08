package com.bow3n.learn.algorithms.ch1;

public class QuickFindUF {
    private int[] id;
    private int count;

    public QuickFindUF(int n) {
        this.id = new int[n];
        this.count = n;
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int find(int i) {
        return id[i];
    }

    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        if (pID == qID) {
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
                count--;
            }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public int count() {
        return count;
    }


}
