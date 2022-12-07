package data_structure.LinkedList;

public class leetcode206ReverseLinkedList {
    Node head;
    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);

    }
    public void reverse(){
        
    }
}
