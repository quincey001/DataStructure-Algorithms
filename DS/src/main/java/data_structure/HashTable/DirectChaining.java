package data_structure.HashTable;


import java.util.LinkedList;

public class DirectChaining {
    /**
     * Direct chaining: implements the buckets as linked list, colliding elements are stored
     * in the lists.
     */
    LinkedList<String>[] hashTable;
    int maxChianSize = 5;
    DirectChaining(int size){
        hashTable = new LinkedList[size];
    }

    // hash function to calculate the key
    public int HashFunction(){
        return 2;
    }

}
