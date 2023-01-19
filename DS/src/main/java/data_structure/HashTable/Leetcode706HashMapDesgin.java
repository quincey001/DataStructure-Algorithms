package data_structure.HashTable;

import java.util.LinkedList;

public class Leetcode706HashMapDesgin {
}
class MyHashMap {
    LinkedList<Node>[] map;
    public static int SIZE = 1000;
    public MyHashMap() {
        map = new LinkedList[SIZE];
    }

    public void put(int key, int value) {
        // if the bucket exist in the hashtable,
        //if not, create a new bucket
        int bucketIndex = key % SIZE;
        if(map[bucketIndex] == null){
            map[bucketIndex] = new LinkedList<Node>();
            map[bucketIndex].add(new Node(key, value));
        }else{
            //if the bucket exist in the hashtable
            for(Node node : map[bucketIndex]){
                if(node.key == key){
                    // if the node exist in the bucket, replace the new value
                    node.value = value;
                    return;
                }
            }
            map[bucketIndex].add(new Node(key, value));
        }
    }

    public int get(int key) {
        int bucketIndex = key % SIZE;
        // if the bucket not exist in the hash table
        if(map[bucketIndex] == null){
            return -1;
        }else{
            // if the bucket exit in the hash table
            // iterate the nodes in the bucket to get the key
            for(Node node : map[bucketIndex]){
                if(node.key == key){
                    return node.value;
                }
            }
            // if all the nodes does not has the key, return -1
            return -1;
        }
    }

    public void remove(int key) {
        int bucketIndex = key % SIZE;
        Node toRemove = null;
        // if the bucket does not exist
        if(map[bucketIndex] == null){
            return;
        }else{
            // if the bucket exist, iterate the nodes
            for(Node node : map[bucketIndex]){
                if(node.key == key){
                    toRemove = node;
                }
            }
            if(toRemove == null)return;
            map[bucketIndex].remove(toRemove);
        }
    }
}
class Node{
    public int key;
    public int value;
    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
