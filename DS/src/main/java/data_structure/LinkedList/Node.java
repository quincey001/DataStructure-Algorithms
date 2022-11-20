package data_structure.LinkedList;

import java.util.LinkedList;

public class Node {
    /**
     * if you want to insert an element in the linkedlist it will take constant of the time
     * if you want to delete an element in the linkedlist it
     * just need constant time as well.
     * if you want to append an element to the linkedlist,
     * it will take linear of the time
     *
     */

    Node next;
    int value;
    Node(int data){
        value = data;
        next = null;
    }
}

