class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return ToBST(head,null);
    }
    private TreeNode ToBST(ListNode head, ListNode tail){
        ListNode fast = head;
        ListNode slow = head;
        if(head == tail) return null;

        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }

        TreeNode res = new TreeNode(slow.val);
        res.left = ToBST(head,slow);
        res.right = ToBST(slow.next,tail);

        return res;
    }
}
