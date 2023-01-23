package Sig;

import java.util.LinkedList;

//
public class DesignHashMap {
    LinkedList<Node>[] buckets;
}
class Node{
    public int key;
    public int value;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}