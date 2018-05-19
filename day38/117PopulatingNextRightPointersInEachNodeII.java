public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode prev = null;
        TreeLinkNode head = null;
        TreeLinkNode curr = root;

        while(curr != null){
            while(curr != null){
                if(curr.left != null){
                    if(prev != null){
                        prev.next = curr.left;
                    }else{
                        head = curr.left;
                    }
                    prev = curr.left;
                }
                if(curr.right != null){
                    if(prev != null){
                        prev.next = curr.right;
                    }else{
                        head = curr.right;
                    }
                    prev = curr.right;
                }
                curr = curr.next;
            }
            curr = head;
            prev = null;
            head = null;
        }
    }
}
