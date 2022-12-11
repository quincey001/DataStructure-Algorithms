package data_structure.LinkedList;

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
     ListNode(int val){
         this.val = val;
     }
     ListNode(int val, ListNode next){
         this.val = val;
         this.next = next;
    }

}
