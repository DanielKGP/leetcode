class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        helper(list,root);
        return list;

    }
    private void helper(List<Integer> list, TreeNode root){
        if(root != null){
            list.add(root.val);
            helper(list,root.left);
            helper(list,root.right);
        }
    }
}
