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
    ListNode res=new ListNode();
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                insertLast(t1.val);
                t1=t1.next;
            }
            else {
                insertLast(t2.val);
                t2=t2.next;
            }
        
        }
        while(t1!=null){
                insertLast(t1.val);
                t1=t1.next;
            }
            while(t2!=null){
                insertLast(t2.val);
                t2=t2.next;
            }
            return res.next;
    }
    public void insertLast(int val){
        if(res.next==null){
            ListNode node=new ListNode(val);
            res.next=node;
        }
        else{
            ListNode temp=new ListNode(val);
            ListNode node=res.next;
            while(node.next!=null){
                node=node.next;
            }
            node.next=temp;
            temp.next=null;
        }
    }
}