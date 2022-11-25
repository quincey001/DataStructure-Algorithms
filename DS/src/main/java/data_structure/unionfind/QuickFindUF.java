package data_structure.unionfind;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N){
        // set id to every object to itself
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    public boolean connected(int p, int q){
        return id[p] == id[q]; //check p and q are in the same component
    }
    public void union(int p, int q){// change all entities with id[p] to id[q]
        int pid = id[p];
        int qid = id[q];
        for(int i = 0; i < id.length; i++){
            if(id[i] == pid) id[i] = qid;
        }
    }
}
