package com.nooruddin.imad;

public class Main {

    public static void main(String[] args) {

        int N = StdIn.readInt();

        QuickFind qf = new QuickFind(N);

        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(qf.find(p, q)){
                StdOut.println("Already Connected");
            }
            else
                StdOut.println("Not Connected");
            qf.union(p, q);
        }

    }
}
