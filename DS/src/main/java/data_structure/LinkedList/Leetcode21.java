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
    public static void MergeTwoLists(ListNode list1, ListNode list2){
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;

        }
        curr.next = list1 != null ? list1 : list2;
        while (temp.next != null){
            System.out.println(temp.next.val);
            temp = temp.next;
        }


    }
    public static void main(String[] args){
        LinkedListOperations list1 = new LinkedListOperations();
        list1.appendAtEnd(1);
        list1.appendAtEnd(2);
        list1.appendAtEnd(4);
        LinkedListOperations list2 = new LinkedListOperations();
        list2.appendAtEnd(1);
        list2.appendAtEnd(3);
        list2.appendAtEnd(4);
//        System.out.println(list1.head);
        ListNode l1 = list1.head;
        ListNode l2 = list2.head;
         MergeTwoLists(l1, l2);


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
