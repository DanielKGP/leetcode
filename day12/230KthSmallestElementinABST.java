class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root,list);
        Collections.sort(list);
        if(list!= null && list.size()>=k)
            return list.get(k-1);
        else
            return 0;
    }
    private void helper(TreeNode root, List<Integer> list){
        if(root != null){
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }
}

class Solution {
    private static int number = 0;
    private static int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }

    public void helper(TreeNode n) {
        if (n.left != null) helper(n.left);
        count--;
        if (count == 0) {
            number = n.val;
            return;
        }
        if (n.right != null) helper(n.right);
    }
}
