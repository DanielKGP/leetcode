

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newNode = null;
        
        while(head != null){
            ListNode Next = head.next;
            head.next = newNode;//先把指针设为空
            newNode = head;
            head = Next;
        }
        return newNode;
    }
}
ß
//recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    private ListNode reverse(ListNode head, ListNode newNode){
        if(head == null) return newNode;
        ListNode next = head.next;
        head.next = newNode;
        return reverse(next,head);
    }
}