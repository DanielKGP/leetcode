class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return CountPath(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    private int CountPath(TreeNode root, int sum){
        if(root == null) return 0;
        int res =0;
        if(root.val == sum) res++;
        res += CountPath(root.left, sum-root.val);
        res += CountPath(root.right, sum-root.val);
        return res;
    }
}
