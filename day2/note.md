##Maximum Depth Of BinaryTree
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example:
Given binary tree [3,9,20,null,null,15,7],

		     3
   			/ \
           9  20
             /  \
            15   7
            
return its depth = 3



###solution one
这是数据结构里的题目直接的想法是递归,根据自己的理解和回忆写了第一遍代码：

	class Solution {
	    public int maxDepth(TreeNode root) {
	        if(root!=null){
	            if(root.left != null){
	            return maxDepth(root.left)+1;
	            }
	            if(root.right != null){
	                return maxDepth(root.right)+1;
	            }     
	        }
	        if(root == null){
	            return 0;
	        }
	        return 0;
	    }
	}
	
输出结果是1，因为还不熟悉leetcode，所以不知道这个结果对不对.

事实证明结果是错误的：
在最后返回值的时候应该比较二叉树两个叉高度的大小，取高者加1（1为当前节点的高度）

修改后的代码是：

	class Solution {
	    public int maxDepth(TreeNode root) {
	        if(root == null){
	            return 0;
	        }
	        int depth_left = maxDepth(root.left);
	        int depth_right = maxDepth(root.right);
	        return 1+Math.max(depth_left,depth_right);
	    }
	}
	
因为是遍历树的每一个节点，所以时间复杂度是O(n),空间复杂度也是O(n)

###solution two

第二种思路是非递归的方式求解，即：深度优先搜索DFS和广度优先搜索BFS。学数据结构的时候就嫌麻烦，没有实现。所以现在看博客补。

DFS用栈，BFS用队列。


__DFS__
用一个Integer的栈来存储每个子树当前的高度，用Integer变量max来存储当前的最大高度，用一个类型为TreeNode的栈来遍历二叉树。每遍历一层子树前，用max记录当前最大的高度。然后遍历子树，当子树存在时，各子树的高度加一，即value内的值。

PS：有限入右子树，这样遍历的时候符合我们之前学习时候遍历的顺序

	class Solution {
	    public int maxDepth(TreeNode root) {
	        if(root == null){
	            return 0;
	        }
	        Stack<TreeNode> stack = new Stack<>();
	        Stack<Integer> value = new Stack<>();
	        stack.push(root);
	        value.push(1);
	        int max = 0;
	        while(!stack.isEmpty()){
	            TreeNode node = stack.pop();
	            int temp = value.pop();
	            max = Math.max(temp,max);
	            if(node.right!=null){
	                stack.push(node.right);
	                value.push(temp+1);
	            }
	            if(node.left!=null){
	                stack.push(node.left);
	                value.push(temp+1);
	            }
	
	        }
	        return max;
	
	    }
	}
	
	
__BFS__

广度优先搜索用队列遍历二叉树，count存储遍历多少层即高度。

	class Solution {
	    public int maxDepth(TreeNode root) {
	        if(root == null) {
	            return 0;
	        }
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        int count = 0;
	        while(!queue.isEmpty()) {
	            int size = queue.size();
	            while(size-- > 0) {
	                TreeNode node = queue.poll();
	                if(node.left != null) {
	                    queue.offer(node.left);
	                }
	                if(node.right != null) {
	                    queue.offer(node.right);
	                }
	            }
	            count++;
	        }
	        return count;
	    }
	}
	
	
