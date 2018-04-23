class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    private boolean isMirror(TreeNode l1, TreeNode l2){
        if(l1 == null && l2 == null) return true;
        if(l1 == null || l2 == null) return false;
        if(l1.val==l2.val && isMirror(l1.left,l2.right) && isMirror(l1.right,l2.left) )
            return true;
        return false;

    }
}
