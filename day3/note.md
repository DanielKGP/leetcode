##Invert Binary Tree
Invert a binary tree.

	     4
	   /   \
	  2     7
	 / \   / \
	1   3 6   9
	
to

	     4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1
	
###solution one

最开始想到了递归

	class Solution {
	    public TreeNode invertTree(TreeNode root) {
	        if(root == null){
	            return root;
	        }
	        TreeNode temp;
	        temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	        
	        root.left = invertTree(root.left);
	        root.right = invertTree(root.right);
	        return root;
	    }
	}
	

经过推算代码应该是通过的。


      2
	 / \   
	3   1
	
要invert这课子树，其实是应该更换2节点内的指针，将他指向3节点和1节点的指针交换

官方答案：


	class Solution {
	    public TreeNode invertTree(TreeNode root) {
	        if(root == null){
	            return root;
	        }	        
	        TreeNode left = invertTree(root.left);
	        TreeNode right = invertTree(root.right);
	        root.right = left;
	        root.left = right;
	        return root;
	    }
	}