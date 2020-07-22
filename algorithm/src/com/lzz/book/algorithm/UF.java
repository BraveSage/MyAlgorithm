package com.lzz.book.algorithm;

/**
 * Union find 算法
 */
public class UF {

    private int[] id;
    private int count;

    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public int count(){
        return count;
    }

    public boolean connected(int p, int q){
        return quickFind(p)==quickFind(q);
    }

    public int quickFind(int p){
        return id[p];
    }

    public void quickUnion(int p, int q){
        // 获得p和q的组号
        int pID = quickFind(p);
        int qID = quickFind(q);
        // 如果两个组号相等，直接返回
        if (pID == qID) return;
        // 遍历一次，改变组号使他们属于一个组
        for (int i = 0; i < id.length; i++)
            if (id[i] == pID) id[i] = qID;
        count--;
    }

    public static void main(String[] args) {
        int N = 10;
        UF uf = new UF(N);
        int[] ps = new int[]{4,3,6,9,2,8,5,7,6,1,6};
        int[] qs = new int[]{3,8,5,4,1,9,0,2,1,0,7};
        for (int i = 0; i < ps.length; i++){
            int p = ps[i];
            int q = qs[i];
            if(uf.connected(p,q)) {
                System.out.println("continue:p:" + p + "\t" + "q:" + q);
                continue;
            }
            uf.quickUnion(p,q);
            System.out.println("p:" + p + "\t" + "q:" + q);
        }
        int[] id = uf.id;
        System.out.println(uf.count);
        System.out.println(id);
    }

}
