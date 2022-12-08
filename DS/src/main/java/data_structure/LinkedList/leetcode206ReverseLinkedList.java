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
    public String reverse(){
        String val = "";
        Node pre = null, cur = head;
        while(cur != null){
            Node nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        while(pre != null){
            val += pre.value;
            pre = pre.next;
        }
        return val;
    }
    public static void main(String[] args){
        leetcode206ReverseLinkedList l = new leetcode206ReverseLinkedList();
        l.append(1);
        l.append(2);
        l.append(3);
        l.append(4);
        l.append(5);
        System.out.println(l.reverse());
    }

}
