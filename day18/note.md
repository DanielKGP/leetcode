## Climbing Stairs
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

	Input: 2
	Output: 2
	Explanation: There are two ways to climb to the top.
	1. 1 step + 1 step
	2. 2 steps
Example 2:

	Input: 3
	Output: 3
	Explanation: There are three ways to climb to the top.
	1. 1 step + 1 step + 1 step
	2. 1 step + 2 steps
	3. 2 steps + 1 step

### solution one 
回溯法，由于数字没有限制，很容易超越时间限制。

	class Solution {
	    public int climbStairs(int n) {
	        List<List<Integer>> list = new ArrayList();
	        backtrack(list, n, new ArrayList<Integer>());
	        return list.size();
	    }
	    private void backtrack(List<List<Integer>> list,int remain, List<Integer> tempList){
	        if(remain < 0) return;
	        if(remain == 0) list.add(new ArrayList(tempList));
	        else{
	            for(int i=1;i<=2;i++){
	                tempList.add(i);
	                backtrack(list,remain-i,tempList);
	                tempList.remove(tempList.size()-1);
	            }
	        }
	    }
	}

### solution two
思路：动态规划

　　n<=1，此时只有一种。

　　n>1时，对于每一个台阶i，要到达台阶，最后一步都有两种方法，从i-1迈一步，或从i-2迈两步。

　　也就是说到达台阶i的方法数=达台阶i-1的方法数+达台阶i-2的方法数。

	class Solution {
	    public int climbStairs(int n) {
	        if(n==1) return 1;
	        int[] dp = new int[n];
	        dp[0]=1;
	        dp[1]=2;
	        for(int i=2;i<n;i++){
	            dp[i] = dp[i-1]+dp[i-2];
	        }
	        return dp[n-1];
	    }
	}