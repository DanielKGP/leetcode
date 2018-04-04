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


##Add Digits

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

###solution one
没有想到不用循环的方法：先贴上自己做的

	class Solution {
	    public int addDigits(int num) {
	        while(num >9){
	            num = num%10 + num/10;
	        }
	        return num;
	    }
	}

###solution two

这类运算非常熟悉，根据数学特性可以得到时间复杂度为O(1)的解法。

	class Solution {
	    public int addDigits(int num) {
	        return 1 + (num - 1) % 9;
	    }
	}
