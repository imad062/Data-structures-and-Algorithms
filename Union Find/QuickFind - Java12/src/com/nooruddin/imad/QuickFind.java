package com.nooruddin.imad;

public class QuickFind {

    private Integer[] id;
    private int N;

    public QuickFind(int n){
        id = new Integer[n];
        N = n;

        for(int i = 0; i < n; i++){
            id[i] = i;
        }
    }

    public boolean find(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pval = id[p];
        int qval = id[q];

        for(int i = 0; i < N; i++) {
            if(id[i] == pval)
                id[i] = qval;
        }
    }

}
