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
    public ListNode middleNode(ListNode head) {
        ListNode first=head;
        ListNode second=head;
        while(second!=null && second.next!=null){
            first=first.next;
            second=second.next.next;
        }
        return first;
    }
}*/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode cur=head;
        ListNode cur1=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        int x=count/2;
        for(int i=0;i<x;i++){
            cur1=cur1.next;
        }
        return cur1;
    }
}