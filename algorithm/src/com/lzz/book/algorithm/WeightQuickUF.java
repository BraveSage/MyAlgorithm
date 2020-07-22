package com.lzz.book.algorithm;

/**
 * 加权quick-UF算法
 */
public class WeightQuickUF {
    private int[] id;
    private int[] sz;
    private int count;

    public WeightQuickUF(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0; i < N; i++){
            sz[i] = i;
        }
    }

    public int count(){
        return count;
    }

    public boolean connected(int p, int q){
        return find(p)==find(q);
    }
    public int find(int p){
        //跟随链接找到根节点
        while (p != id[p])
            p = id[p];
        return p;
    }

    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if(i == j)
            return;
        //将小树的根节点连接到大树的根节点
        if(sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }

    public static void main(String[] args) {
        int N = 10;
        WeightQuickUF uf = new WeightQuickUF(N);
        int[] ps = new int[]{4,3,6,9,2,8,5,7,6,1,6};
        int[] qs = new int[]{3,8,5,4,1,9,0,2,1,0,7};
        for (int i = 0; i < ps.length; i++){
            int p = ps[i];
            int q = qs[i];
            if(uf.connected(p,q)) {
                System.out.println("continue:p:" + p + "\t" + "q:" + q);
                continue;
            }
            uf.union(p,q);
            System.out.println("p:" + p + "\t" + "q:" + q);
        }
        int[] id = uf.id;
        System.out.println(uf.count);
        System.out.println(id);
    }
}
