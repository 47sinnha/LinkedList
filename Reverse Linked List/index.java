class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head; // return head if list is empty or has only one node
        }
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = null;
        
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        
        return prevNode; // prevNode is the new head of the reversed list
    }
}