class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int left = depth(root.left);
        int right = depth(root.right);

        if(Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right))
            return true;
        else
            return false;
    }
    private int depth(TreeNode root){
        if(root == null) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
