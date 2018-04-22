class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<List<Integer>> ans = new Stack<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return ans;

        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<Integer>();
            int level=queue.size();
            for(int i=0;i<level;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                temp.add(queue.poll().val);
            }
            ans.add(temp);
        }
        while(!ans.isEmpty()){
            res.add(ans.pop());
        }
        return res;
    }
}
