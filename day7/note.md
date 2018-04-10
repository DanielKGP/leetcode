## Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:
	
	[
	  "((()))",
	  "(()())",
	  "(())()",
	  "()(())",
	  "()()()"
	]
	
### Solution one 

经过翻阅博客和discuss，我找到了比较容易理解的方法。这像是对某种二叉树的遍历，但还是找不到什么具体的规律。博客给的是一个这样的模型：

 						/    \
 					   (      )
 					 /  \    /   \
 					(    )   (    )
 				   / \  / \ / \  / \
 				   ( )  ( ) (  ) (  )
 				   
 				   
 对这个模型的每一种遍历就会得到一种结果。
 
	 class Solution {
	     public List<String> generateParenthesis(int n) {
	            List<String> list = new ArrayList<String>();
	            backtrack(list, "", 0, 0, n);
	            return list;
	        }
	
	        public void backtrack(List<String> list, String str, int open, int close, int max){
	
	            if(str.length() == max*2){
	                list.add(str);
	                return;
	            }
	
	            if(open < max)
	                backtrack(list, str+"(", open+1, close, max);
	            if(close < open)
	                backtrack(list, str+")", open, close+1, max);
	        }
	}		   
	 				   
 				   
 				   
 				   
 				   
 				   
 				   
 				   
 				   