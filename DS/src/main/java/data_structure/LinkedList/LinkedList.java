package data_structure.LinkedList;

public class LinkedList {
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
    public void prepend(int data){//前置
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    public void deleteValue(int data){
        if(head == null) return;
        if(head.value == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.value == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        while (linkedList.head != null){
            System.out.println(linkedList.head.value);
            linkedList.head = linkedList.head.next;
        }
    }
}
