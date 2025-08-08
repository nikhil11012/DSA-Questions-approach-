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


// class Solution {
//     public ListNode swapPairs(ListNode head) {
//          ListNode dummy = new ListNode(-1);
//          dummy.next = head;

//          ListNode prev = dummy;

//          while(head!=null && head.next!=null){
//             ListNode f = head;
//             ListNode s = head.next;
//             f.next=s.next;
//             s.next=f;
//             prev.next=s;

//             prev = f;
//             head = f.next;
//          }
//          return dummy.next;        
//     }
// }

class Solution{
    public void swapPairHelper(ListNode prev,ListNode head){
        if(head==null || head.next==null){
            return ;
        }
        ListNode f = head;
        ListNode s = head.next;

        f.next=s.next;
        s.next = f;
        prev.next = s;

        swapPairHelper(f,f.next);

    }
    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        swapPairHelper(prev,head);

        return dummy.next;
    }
}