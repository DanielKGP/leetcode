class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p.val == q.val){
            if(isSameTree(p.left,q.left))
                return true;
            if(isSameTree(p.right,q.right))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }
}
