/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;

        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}*/
class Solution {
    public ListNode reverseList(ListNode head) {
        return rec(null,head);
    }
    public ListNode rec(ListNode prev,ListNode cur){
        if(cur==null){
        return prev;
        }
            ListNode next=cur.next;
            cur.next=prev;
            return rec(cur,next);
    }
}