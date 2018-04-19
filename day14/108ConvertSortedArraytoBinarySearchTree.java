class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length ==0 ) return null;
        TreeNode root = helper( nums,0, nums.length-1);
        return root;

    }
    private TreeNode helper(int[] nums, int start, int end){
        if(start > end) return null;

        int mid = (start+end)/2;
        TreeNode Node = new TreeNode(nums[mid]);
        Node.left = helper(nums,start,mid-1);
        Node.right = helper(nums,mid+1,end);
        return Node;

    }
}
