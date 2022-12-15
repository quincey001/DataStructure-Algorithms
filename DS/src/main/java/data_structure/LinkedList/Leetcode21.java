package data_structure.LinkedList;

import org.w3c.dom.NodeList;

class ListNode {
    /**
     * You are given the heads of two sorted linked lists list1 and list2.
     *
     * Merge the two lists in a one sorted list. The list should be made
     * by splicing together the nodes of the first two lists.
     *
     * Return the head of the merged linked list.
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     */
     int val;
     ListNode next;
     ListNode(){}
     ListNode(int val){
         this.val = val;
         // next = null default
     }
     ListNode(int val, ListNode next){
         this.val = val;
         this.next = next;
    }
}

class LinkedListOperations {
    ListNode head;
    public void appendAtEnd(int data){
        if(head == null){
            head = new ListNode(data);
            return;
        }
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new ListNode(data);
    }
    public ListNode MergeTwoLists(ListNode list1, ListNode list2){

    }
    public static void main(String[] args){

    }
}

class LinList{
    public ListNode head;
    public ListNode create(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        this.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        return head;
    }
    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
    public static void main(String[] args){
        LinList list1 = new LinList();
        ListNode tem = list1.create();// created a linked list
        while(tem != null){
            System.out.println(tem.val + " ");
            tem = tem.next;
        }
        list1.display();

    }

}
