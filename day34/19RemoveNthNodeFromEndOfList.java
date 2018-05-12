class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = temp;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return temp.next;
    }
}
