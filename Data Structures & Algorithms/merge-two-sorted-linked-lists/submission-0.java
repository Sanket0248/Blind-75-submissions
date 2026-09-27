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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode dummy = null;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy; // we use this extra variable becase dummy hold index value for the first index, which means if i use dummy.next to get new value then i will not have any value to return at last.

        while(list1 != null && list2 != null){ // use and instead of or.
            if(list1.val <= list2.val) {
                curr.next = list1;// dummy.next = l1.val;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next; //i missed it.
        }
        if(list1 == null && list2 != null){
            curr.next = list2;
        }
        if(list1 != null && list2 == null){
            curr.next = list1;
        }
        return dummy.next;
    }
}