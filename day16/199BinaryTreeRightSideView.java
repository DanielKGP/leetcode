class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        rightView(list, root, 0);
        return list;
    }
    private void rightView(List<Integer> list, TreeNode node, int depth){
        if(node == null) return;
        if(list.size() == depth) list.add(node.val);

        if(node.right != null) rightView(list, node.right, depth+1);
        if(node.left != null) rightView(list, node.left, depth+1);
    }
}
