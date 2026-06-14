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
class Solution {
    public int pairSum(ListNode head) {
        ListNode mid=head,fast=head;
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        while(fast!=null && fast.next!=null)
        {
            q.offer(mid.val);
            mid=mid.next;
            fast=fast.next.next;
        }
        while(mid!=null)
        {
            st.push(mid.val);
            mid = mid.next;
        }
        int m=0;
        while(!st.isEmpty() && !q.isEmpty())
        {
            int c=st.pop()+q.poll();
           if(c>m)
           {
             m =c;
           }
        }
        return m;
    }
}