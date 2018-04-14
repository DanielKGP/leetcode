class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        helper(list,root);
        return list;

    }
    private void helper(List<Integer> list, TreeNode root){
        if(root != null){
            helper(list,root.left);
            list.add(root.val);
            helper(list,root.right);
        }
    }
}
