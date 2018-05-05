class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        DFS(list, new ArrayList<Integer>(),root,sum);
        return list;
    }
    private void DFS(List<List<Integer>> list, List<Integer>tempList, TreeNode root, int sum){
        if(root == null) return;
        tempList.add(root.val);
        if(root.right == null && root.left == null && root.val == sum){
            list.add(new ArrayList(tempList));
            tempList.remove(tempList.size()-1);
            return;
        }
        else{
            DFS(list,tempList,root.left,sum-root.val);
            DFS(list,tempList,root.right,sum-root.val);
            tempList.remove(tempList.size()-1);
        }
    }
}
