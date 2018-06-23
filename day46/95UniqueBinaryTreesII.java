class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<TreeNode>();
        return backtrack(1,n);
    }
    private List<TreeNode> backtrack(int start, int end){
        List<TreeNode> list = new ArrayList<TreeNode>();
        if(start >end){
            list.add(null);
            return list;
        }
        if(start == end){
            list.add(new TreeNode(start));
            return list;
        }
        List<TreeNode> left,right;
        for(int i=start;i<=end;i++){
            left = backtrack(start,i-1);
            right = backtrack(i+1,end);

            for (TreeNode lnode:left){
                for(TreeNode rnode:right){
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }
        }
        return list;

    }
}
