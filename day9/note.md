## Same Tree

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

	Input:     1         1
	          / \       / \
	         2   3     2   3

	        [1,2,3],   [1,2,3]

	Output: true

Example 2:

	Input:     1         1
	          /           \
	         2             2

	        [1,2],     [1,null,2]

	Output: false

Example 3:

	Input:     1         1
	          / \       / \
	         2   1     1   2

	        [1,2,1],   [1,1,2]

	Output: false


### solution one

This is what I write. Compared with the most voted solution in the discussion, I missed a condition to judge, although the answer is true.

	class Solution {
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p == null && q == null) return true;
	        if(p == null || q == null) return false;
	        if(p.val == q.val){
	            if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right))
	                return true;
	            else
	                return false;                
	        }
	        else
	            return false;
	    }
	}



The most voted solution:

	class Solution {
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p == null && q == null) return true;
	        if(p == null || q == null) return false;
	        if(p.val == q.val)
	            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	        return false;
	    }
	}

And the missed condition is:

	 if(p == null || q == null) return false;
