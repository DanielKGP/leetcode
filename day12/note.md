## Kth Smallest Element in a BST

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

### solution one 
先上自己的算法，思路就是先用递归遍历二叉搜索树，将值存储到list中，再利用list排序获得第k个值，但这并没有利用到二叉搜索树的特性：

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
	
	
### solution two
更为合适的中序遍历应该是这样：

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
因为二叉搜索树的特点是：

* 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 
* 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值。 

所以在中序遍历时，就可以利用这一特点，遍历左子树时，count减1，直到count为0时，该节点的val值就是我们想要的了。这样就省去了使用list的空间.