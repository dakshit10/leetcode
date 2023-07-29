/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1!=null){
            a++;
            temp1 = temp1.next;
        }

        while(temp2!=null){
            b++;
            temp2 = temp2.next;
        }

        while(a>b){
            a--;
            headA = headA.next;
        }

        while(b>a){
            b--;
            headB = headB.next;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}
