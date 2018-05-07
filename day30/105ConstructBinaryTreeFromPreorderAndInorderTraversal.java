class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);
    }
    private TreeNode helper(int prestart, int instart, int inend, int[] preorder, int[] inorder){
        if(prestart > preorder.length-1 || instart > inend) return null;
        TreeNode root = new TreeNode(preorder[prestart]);

        int inIndex =0;
        for(int i=instart;i<=inend;i++){
            if(preorder[prestart] == inorder[i])
                inIndex = i;
        }

        root.left = helper(prestart+1,instart,inIndex-1,preorder,inorder);
        root.right = helper(prestart+inIndex-instart+1,inIndex+1,inend,preorder,inorder);
        return root;
    }
}
